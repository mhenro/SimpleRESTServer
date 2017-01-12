package ru.mhenro;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;

@Path("/controller")
public class Controller {
	@POST
	@Produces("text/plain")
	@Path("/hello")
	public String hello() {
		return "Hello world!";
	}
	
	@GET
	@Path("/getJson")
	@Produces(MediaType.APPLICATION_JSON)
	public JsonOb getJson() {
		JsonOb ob = new JsonOb();
		ob.setText("ololo");
		ob.setValue(111);
		return ob;
	}
}
