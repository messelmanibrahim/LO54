
package fr.utbm.core.entity;

public class Location {
    private int id;
    private String city;
    
    public Location() {
    }
    public Location(int id, String city) {
        this.id = id;
        this.city = city;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Location [id = " + this.id + " city = " + this.city + "]";
    }
}
