package com.swaggersample.swaggersample.staffmembermanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.swaggersample.swaggersample.staffmembermanagement.dataaccess.api.StaffMemberEntity;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberSearchCriteriaTo;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.usecase.UcFindStaffMember;
import com.swaggersample.swaggersample.staffmembermanagement.logic.base.usecase.AbstractStaffMemberUc;

/**
 * Use case implementation for searching, filtering and getting StaffMembers
 */
@Named
@Validated
@Transactional
public class UcFindStaffMemberImpl extends AbstractStaffMemberUc implements UcFindStaffMember {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindStaffMemberImpl.class);

  @Override
  public StaffMemberEto findStaffMember(long id) {

    LOG.debug("Get StaffMember with id {} from database.", id);
    Optional<StaffMemberEntity> foundEntity = getStaffMemberRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), StaffMemberEto.class);
    else
      return null;
  }

  @Override
  public Page<StaffMemberEto> findStaffMembers(StaffMemberSearchCriteriaTo criteria) {

    Page<StaffMemberEntity> staffmembers = getStaffMemberRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(staffmembers, StaffMemberEto.class);
  }

}
