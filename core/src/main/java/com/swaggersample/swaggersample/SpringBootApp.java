package com.swaggersample.swaggersample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.openapi.SwaggerToOpenApiConversionFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import com.devonfw.module.jpa.dataaccess.api.AdvancedRevisionEntity;
import com.devonfw.module.jpa.dataaccess.impl.data.GenericRepositoryFactoryBean;
import com.swaggersample.swaggersample.staffmembermanagement.service.impl.rest.StaffmembermanagementRestServiceImpl;

/**
 * Main entry point of this {@link SpringBootApplication}. Simply run this class to start this app.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.swaggersample.swaggersample" }, basePackageClasses = { AdvancedRevisionEntity.class })
@EnableJpaRepositories(repositoryFactoryBeanClass = GenericRepositoryFactoryBean.class)
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SpringBootApp {

  @Value("${cxf.path}")
  private String basePath;

  @Autowired
  private Bus bus;

  @Autowired
  private Feature swagger2Feature;

  @Autowired
  ServletRegistrationBean servletRegistrationBean;

  /**
   * Entry point for spring-boot based app
   *
   * @param args - arguments
   */
  public static void main(String[] args) {

    SpringApplication.run(SpringBootApp.class, args);
  }

  /**
   * @return Server
   */
  @Bean
  public Server rsServer() {

    JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
    List<Feature> features = new ArrayList<>();
    features.add(this.swagger2Feature);
    this.bus.setFeatures(features);
    endpoint.setBus(this.bus);
    endpoint.setServiceBeans(Arrays.<Object> asList(new StaffmembermanagementRestServiceImpl()));
    endpoint.setAddress("/");
    endpoint.setFeatures(Arrays.asList(this.swagger2Feature));
    endpoint.setProvider(new SwaggerToOpenApiConversionFilter());
    List<String> urlMappings = new ArrayList<>();
    urlMappings.add(this.basePath + "/*");
    this.servletRegistrationBean.setUrlMappings(urlMappings);
    return endpoint.create();
  }
}
