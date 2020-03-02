package com.swaggersample.swaggersample.staffmembermanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.swaggersample.swaggersample.staffmembermanagement.logic.api.Staffmembermanagement;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberSearchCriteriaTo;
import com.swaggersample.swaggersample.staffmembermanagement.service.api.rest.StaffmembermanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Staffmembermanagement}.
 */
@Named("StaffmembermanagementRestService")
public class StaffmembermanagementRestServiceImpl implements StaffmembermanagementRestService {

  @Inject
  private Staffmembermanagement staffmembermanagement;

  @Override
  public StaffMemberEto getStaffMember(long id) {

    return this.staffmembermanagement.findStaffMember(id);
  }

  @Override
  public StaffMemberEto saveStaffMember(StaffMemberEto staffmember) {

    return this.staffmembermanagement.saveStaffMember(staffmember);
  }

  @Override
  public void deleteStaffMember(long id) {

    this.staffmembermanagement.deleteStaffMember(id);
  }

  @Override
  public Page<StaffMemberEto> findStaffMembers(StaffMemberSearchCriteriaTo searchCriteriaTo) {

    return this.staffmembermanagement.findStaffMembers(searchCriteriaTo);
  }
}