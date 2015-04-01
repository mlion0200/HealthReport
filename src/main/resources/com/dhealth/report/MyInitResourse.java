package main.resources.com.dhealth.report;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Resource")
public class MyInitResourse {
	@GET
	public String getName() {
		String s = "simone";
		return s;
	}
}
