package mhm.test.ws.endpoint;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestWS {
    @POST
    @Path("/endpoint/{hello}")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_XML)
    public String postTrack(@PathParam("hello") String hello,
	    @Context ServletContext context) {
	StringBuilder sb = new StringBuilder("<html>");
	sb.append("<body>");
	sb.append("<h1>").append(context.getServletContextName())
		.append("</h1>");
	sb.append(hello);
	sb.append("</body>");
	sb.append("</html>");
	return sb.toString();
    }
}
