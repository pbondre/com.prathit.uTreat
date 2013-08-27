package com.prathit.uTreat.model;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.research.ws.wadl.Application;

@Path("/supplements")
public class SupplementService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Supplement getSupplements() throws JsonGenerationException, JsonMappingException, IOException {
		Supplement mysupplement =  new Supplement();
		mysupplement.setDosage("5mg");
		mysupplement.setManufacturer("Kirkman2");
		mysupplement.setName("Therapro");
		return mysupplement;
		//ObjectMapper mapper = new ObjectMapper();
		//return mapper.writeValueAsString(mysupplement);
	}
	
	
}
