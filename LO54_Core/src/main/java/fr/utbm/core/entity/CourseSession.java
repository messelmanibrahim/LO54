
package fr.utbm.core.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class CourseSession {
    private int id;
    private Date start;
    private Date end;
    private List<Client> clients;
    private Course course;
    private Location location;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Course_Session [id = " + this.id + " start = " + this.start + " end = " + this.end
                + " " + this.course.getCode() + " " + this.location.getId() + "]";
    }
}
