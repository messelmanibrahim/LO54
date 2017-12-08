
package fr.utbm.core.app;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.repository.CourseSessionDao;
import fr.utbm.core.utils.Filter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {
        CourseSessionDao cs = new CourseSessionDao();
        Filter f = new Filter();
        f.setCity("Paris");
        f.setCode("LO43");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        try {
            f.setDate(sdf.parse("9-03-2018"));
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<CourseSession> courseSessions = cs.getCourseSessionList(f);
        System.out.println("List:"+courseSessions.size());
    }
    
}
