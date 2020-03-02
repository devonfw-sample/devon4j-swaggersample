package com.swaggersample.swaggersample.staffmembermanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.swaggersample.swaggersample.general.dataaccess.api.ApplicationPersistenceEntity;
import com.swaggersample.swaggersample.staffmembermanagement.common.api.StaffMember;

@Entity
@Table(name = "staffmember")
public class StaffMemberEntity extends ApplicationPersistenceEntity implements StaffMember {

  private String name;

  private String firstName;

  private String lastName;

  private static final long serialVersionUID = 1L;

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return firstName
   */
  @Override
  public String getFirstName() {

    return this.firstName;
  }

  /**
   * @param firstName new value of {@link #getfirstName}.
   */
  @Override
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   * @return lastName
   */
  @Override
  public String getLastName() {

    return this.lastName;
  }

  /**
   * @param lastName new value of {@link #getlastName}.
   */
  @Override
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

}
