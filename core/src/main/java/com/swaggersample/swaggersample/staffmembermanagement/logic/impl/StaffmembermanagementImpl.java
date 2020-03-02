package com.swaggersample.swaggersample.staffmembermanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.swaggersample.swaggersample.general.logic.base.AbstractComponentFacade;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.Staffmembermanagement;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberSearchCriteriaTo;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.usecase.UcFindStaffMember;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.usecase.UcManageStaffMember;

/**
 * Implementation of component interface of staffmembermanagement
 */
@Named
public class StaffmembermanagementImpl extends AbstractComponentFacade implements Staffmembermanagement {

  @Inject
  private UcFindStaffMember ucFindStaffMember;

  @Inject
  private UcManageStaffMember ucManageStaffMember;

  @Override
  public StaffMemberEto findStaffMember(long id) {

    return this.ucFindStaffMember.findStaffMember(id);
  }

  @Override
  public Page<StaffMemberEto> findStaffMembers(StaffMemberSearchCriteriaTo criteria) {

    return this.ucFindStaffMember.findStaffMembers(criteria);
  }

  @Override
  public StaffMemberEto saveStaffMember(StaffMemberEto staffmember) {

    return this.ucManageStaffMember.saveStaffMember(staffmember);
  }

  @Override
  public boolean deleteStaffMember(long id) {

    return this.ucManageStaffMember.deleteStaffMember(id);
  }
}
