package org.webservice.restapi.resources.a2;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/login")
public class LoginResource {
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	
	public String validation(@FormParam("username") String username, @FormParam("password") String password){
		
		if(username.equals("Birappa")&&password.equals("1234")){
			return "Valid User";
		}
		return "Invalid User";
	}

}
