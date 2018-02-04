package org.koushik.javabrains.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresource")
public class MessageResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String messages() {
		return"Welcome to git world geervani";
	}
}
