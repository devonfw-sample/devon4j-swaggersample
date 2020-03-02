package com.swaggersample.swaggersample.staffmembermanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.swaggersample.swaggersample.staffmembermanagement.dataaccess.api.StaffMemberEntity;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.usecase.UcManageStaffMember;
import com.swaggersample.swaggersample.staffmembermanagement.logic.base.usecase.AbstractStaffMemberUc;

/**
 * Use case implementation for modifying and deleting StaffMembers
 */
@Named
@Validated
@Transactional
public class UcManageStaffMemberImpl extends AbstractStaffMemberUc implements UcManageStaffMember {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageStaffMemberImpl.class);

  @Override
  public boolean deleteStaffMember(long staffMemberId) {

    StaffMemberEntity staffMember = getStaffMemberRepository().find(staffMemberId);
    getStaffMemberRepository().delete(staffMember);
    LOG.debug("The staffMember with id '{}' has been deleted.", staffMemberId);
    return true;
  }

  @Override
  public StaffMemberEto saveStaffMember(StaffMemberEto staffMember) {

    Objects.requireNonNull(staffMember, "staffMember");

    StaffMemberEntity staffMemberEntity = getBeanMapper().map(staffMember, StaffMemberEntity.class);

    // initialize, validate staffMemberEntity here if necessary
    StaffMemberEntity resultEntity = getStaffMemberRepository().save(staffMemberEntity);
    LOG.debug("StaffMember with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, StaffMemberEto.class);
  }
}
