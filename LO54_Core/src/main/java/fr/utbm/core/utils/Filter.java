
package fr.utbm.core.utils;

import java.util.Date;

public class Filter {
    private String code;
    private Date date;
    private String city;
    
    public Filter(){}
    
    public Filter(String code,  Date date, String city){
        this.code=code;
        this.date=date;
        this.city=city;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
}
