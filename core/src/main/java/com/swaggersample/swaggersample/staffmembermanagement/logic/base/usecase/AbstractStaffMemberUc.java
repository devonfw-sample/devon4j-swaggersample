package com.swaggersample.swaggersample.staffmembermanagement.logic.base.usecase;

import javax.inject.Inject;

import com.swaggersample.swaggersample.general.logic.base.AbstractUc;
import com.swaggersample.swaggersample.staffmembermanagement.dataaccess.api.repo.StaffMemberRepository;

/**
 * Abstract use case for StaffMembers, which provides access to the commonly necessary data access objects.
 */
public class AbstractStaffMemberUc extends AbstractUc {

  /** @see #getStaffMemberRepository() */
  @Inject
  private StaffMemberRepository staffMemberRepository;

  /**
   * Returns the field 'staffMemberRepository'.
   * 
   * @return the {@link StaffMemberRepository} instance.
   */
  public StaffMemberRepository getStaffMemberRepository() {

    return this.staffMemberRepository;
  }

}
