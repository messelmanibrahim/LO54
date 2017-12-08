
package fr.utbm.core.app;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.repository.CourseSessionDao;
import fr.utbm.core.utils.Filter;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        CourseSessionDao cs = new CourseSessionDao();
        Filter f = new Filter();
        f.setCity("Paris");
        List<CourseSession> courseSessions = cs.getCourseSessionList(f);
        System.out.println("List:"+courseSessions.size());
    }
    
}
