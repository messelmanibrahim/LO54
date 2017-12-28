package fr.utbm.lo54.web.service;

import fr.utbm.core.entity.Client;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.service.ClientService;
import fr.utbm.core.service.CourseSessionService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;
import org.json.JSONObject;


@Path("signup")
public class SignUpResource {

    @Context
    private UriInfo context;

    public SignUpResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "bon";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        try {
            JSONObject jo = new JSONObject(content);
            String lastname = jo.getString("lastname");
            String firstname = jo.getString("firstname");
            String address = jo.getString("address");
            String phone = jo.getString("phone");
            String email = jo.getString("email");
            int sessionid = Integer.parseInt(jo.getString("sessionid"));
            CourseSessionService css = new CourseSessionService();
            CourseSession courseSession = css.getCourseSessionById(sessionid);
            ClientService cs = new ClientService();
            cs.inscribe(new Client(lastname, firstname, address, phone, email, courseSession));
        } catch (JSONException ex) {
            Logger.getLogger(SignUpResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
