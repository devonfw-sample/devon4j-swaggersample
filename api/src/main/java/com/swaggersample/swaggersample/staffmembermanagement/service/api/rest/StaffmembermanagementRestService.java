package com.swaggersample.swaggersample.staffmembermanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.swaggersample.swaggersample.staffmembermanagement.logic.api.Staffmembermanagement;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberEto;
import com.swaggersample.swaggersample.staffmembermanagement.logic.api.to.StaffMemberSearchCriteriaTo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Staffmembermanagement}.
 */
@Path("/staffmembermanagement/v1")
@Api(value = "General Rest Server", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface StaffmembermanagementRestService {

  /**
   * Delegates to {@link Staffmembermanagement#findStaffMember}.
   *
   * @param id the ID of the {@link StaffMemberEto}
   * @return the {@link StaffMemberEto}
   */
  @GET
  @Path("/staffmember/{id}/")
  @ApiOperation(value = "Finds Staff Member with Id - (version in URL)")
  @ApiResponses(value = { @ApiResponse(code = 200, message = "Hello resource found", response = StaffMemberEto.class),
  @ApiResponse(code = 404, message = "Hello resource not found") })
  public StaffMemberEto getStaffMember(@PathParam("id") long id);

  /**
   * Delegates to {@link Staffmembermanagement#saveStaffMember}.
   *
   * @param staffmember the {@link StaffMemberEto} to be saved
   * @return the recently created {@link StaffMemberEto}
   */
  @POST
  @Path("/staffmember/")
  public StaffMemberEto saveStaffMember(StaffMemberEto staffmember);

  /**
   * Delegates to {@link Staffmembermanagement#deleteStaffMember}.
   *
   * @param id ID of the {@link StaffMemberEto} to be deleted
   */
  @DELETE
  @Path("/staffmember/{id}/")
  public void deleteStaffMember(@PathParam("id") long id);

  /**
   * Delegates to {@link Staffmembermanagement#findStaffMemberEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding staffmembers.
   * @return the {@link Page list} of matching {@link StaffMemberEto}s.
   */
  @Path("/staffmember/search")
  @POST
  public Page<StaffMemberEto> findStaffMembers(StaffMemberSearchCriteriaTo searchCriteriaTo);

}