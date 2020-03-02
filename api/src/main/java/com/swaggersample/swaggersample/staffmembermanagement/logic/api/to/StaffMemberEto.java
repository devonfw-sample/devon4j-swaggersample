package com.swaggersample.swaggersample.staffmembermanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractEto;
import com.swaggersample.swaggersample.staffmembermanagement.common.api.StaffMember;

/**
 * Entity transport object of StaffMember
 */
public class StaffMemberEto extends AbstractEto implements StaffMember {

  private static final long serialVersionUID = 1L;

  private String name;

  private String firstName;

  private String lastName;

  @Override
  public String getName() {

    return name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getFirstName() {

    return firstName;
  }

  @Override
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  @Override
  public String getLastName() {

    return lastName;
  }

  @Override
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
    result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    StaffMemberEto other = (StaffMemberEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (this.firstName == null) {
      if (other.firstName != null) {
        return false;
      }
    } else if (!this.firstName.equals(other.firstName)) {
      return false;
    }
    if (this.lastName == null) {
      if (other.lastName != null) {
        return false;
      }
    } else if (!this.lastName.equals(other.lastName)) {
      return false;
    }
    return true;
  }
}
