package org.webservice.restapi.resources.a3;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userInfo")
public class UserInfo {

	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	@Path("{zipcode}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Info getUserInfo(@PathParam("zipcode") int zipcode){
		Service service=new Service();
		//Integer intZipcode=Integer.parseInt(zipcode);
		return service.getInfo(zipcode);
	}
}
