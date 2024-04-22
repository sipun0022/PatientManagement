package com.cerner.controller;

import java.util.List;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cerner.model.Patient;
import com.cerner.service.PatientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Path("/patient")
@Api("/Patient")
@SwaggerDefinition(tags= {@Tag(name="Patient Service", description= "Rest end points for Patient Service")})
public class PatientController {

	PatientService personService = new PatientService();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Patient> getPatient()
	{
		
		List<Patient> personList=personService.getAllPatients();
		return personList;
	}
	
	@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Patient getPatient(@PathParam("id") int id)
	{
		return personService.getPatient(id);
	}
   
    @POST
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Patient addPatient(Patient patient)
	{
		return personService.addPatient(patient);
		//Response.status(401).entity(new re.build();
	}

    @PUT
    @Path("/id")
    @Produces(MediaType.APPLICATION_JSON)
	public Patient updatePatient(Patient patient)
	{
		return personService.updatePatient(patient);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deletePatient(@PathParam("id") int id)
	{
    	personService.deletePatient(id);
		
	}
	

	
	
}
