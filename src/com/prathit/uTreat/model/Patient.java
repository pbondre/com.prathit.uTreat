package com.prathit.uTreat.model;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/patients")
public class Patient {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getPatient() {
		return "Prathit";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getVersion() {
		return "1.0";
	}
}
