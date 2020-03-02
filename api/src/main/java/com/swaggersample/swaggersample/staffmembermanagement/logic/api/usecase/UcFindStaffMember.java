package com.swaggersample.swaggersample.staffmembermanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberSearchCriteriaTo;

public interface UcFindStaffMember {

  /**
   * Returns a StaffMember by its id 'id'.
   *
   * @param id The id 'id' of the StaffMember.
   * @return The {@link StaffMemberEto} with id 'id'
   */
  StaffMemberEto findStaffMember(long id);

  /**
   * Returns a paginated list of StaffMembers matching the search criteria.
   *
   * @param criteria the {@link StaffMemberSearchCriteriaTo}.
   * @return the {@link List} of matching {@link StaffMemberEto}s.
   */
  Page<StaffMemberEto> findStaffMembers(StaffMemberSearchCriteriaTo criteria);

}
