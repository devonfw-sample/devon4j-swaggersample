package com.swaggersample.swaggersample.staffmembermanagement.logic.api.to;

import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;
import com.swaggersample.swaggersample.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.swaggersample.swaggersample.staffmembermanagement.common.api.StaffMember}s.
 */
public class StaffMemberSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String firstName;

  private String lastName;

  private StringSearchConfigTo nameOption;

  private StringSearchConfigTo firstNameOption;

  private StringSearchConfigTo lastNameOption;

  /**
   * @return nameId
   */

  public String getName() {

    return name;
  }

  /**
   * @param name setter for name attribute
   */

  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return firstNameId
   */

  public String getFirstName() {

    return firstName;
  }

  /**
   * @param firstName setter for firstName attribute
   */

  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   * @return lastNameId
   */

  public String getLastName() {

    return lastName;
  }

  /**
   * @param lastName setter for lastName attribute
   */

  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getName() name}.
   */
  public StringSearchConfigTo getNameOption() {

    return this.nameOption;
  }

  /**
   * @param nameOption new value of {@link #getNameOption()}.
   */
  public void setNameOption(StringSearchConfigTo nameOption) {

    this.nameOption = nameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getFirstName() firstName}.
   */
  public StringSearchConfigTo getFirstNameOption() {

    return this.firstNameOption;
  }

  /**
   * @param firstNameOption new value of {@link #getFirstNameOption()}.
   */
  public void setFirstNameOption(StringSearchConfigTo firstNameOption) {

    this.firstNameOption = firstNameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getLastName() lastName}.
   */
  public StringSearchConfigTo getLastNameOption() {

    return this.lastNameOption;
  }

  /**
   * @param lastNameOption new value of {@link #getLastNameOption()}.
   */
  public void setLastNameOption(StringSearchConfigTo lastNameOption) {

    this.lastNameOption = lastNameOption;
  }

}
