package com.swaggersample.swaggersample.staffmembermanagement.logic.api.usecase;

import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;

/**
 * Interface of UcManageStaffMember to centralize documentation and signatures of methods.
 */
public interface UcManageStaffMember {

  /**
   * Deletes a staffMember from the database by its id 'staffMemberId'.
   *
   * @param staffMemberId Id of the staffMember to delete
   * @return boolean <code>true</code> if the staffMember can be deleted, <code>false</code> otherwise
   */
  boolean deleteStaffMember(long staffMemberId);

  /**
   * Saves a staffMember and store it in the database.
   *
   * @param staffMember the {@link StaffMemberEto} to create.
   * @return the new {@link StaffMemberEto} that has been saved with ID and version.
   */
  StaffMemberEto saveStaffMember(StaffMemberEto staffMember);

}
