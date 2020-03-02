package com.swaggersample.swaggersample.staffmembermanagement.common.api;

import com.swaggersample.swaggersample.general.common.api.ApplicationEntity;

public interface StaffMember extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

  /**
   * @return firstNameId
   */

  public String getFirstName();

  /**
   * @param firstName setter for firstName attribute
   */

  public void setFirstName(String firstName);

  /**
   * @return lastNameId
   */

  public String getLastName();

  /**
   * @param lastName setter for lastName attribute
   */

  public void setLastName(String lastName);

}
