
package fr.utbm.core.entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class Client {
    private int id;
    private String lastname;
    private String firstname;
    private String address;
    private String phone;
    private String email;
    private CourseSession session;
    
    public Client( String lastname, String firstname, String address, String phone, String email, CourseSession session) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.session = session;
    }
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getLastname() {
            return lastname;
    }
    public void setLastname(String lastname) {
            this.lastname = lastname;
    }
    public String getFirstname() {
            return firstname;
    }
    public void setFirstname(String firstname) {
            this.firstname = firstname;
    }
    public String getAddress() {
            return address;
    }
    public void setAddress(String address) {
            this.address = address;
    }
    public String getPhone() {
            return phone;
    }
    public void setPhone(String phone) {
            this.phone = phone;
    }
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    public CourseSession getSession() {
            return session;
    }
    public void setSession(CourseSession session) {
            this.session = session;
    }
    @Override
    public String toString() {
        return "Client [id = " + this.id + " lastName = " + this.lastname + " firstName = " + this.firstname
                + " address =  " + this.address + " phone = " + this.phone + " email  = "
                + this.email + " session = " + this.session.getId() + " ]";
    }
}
