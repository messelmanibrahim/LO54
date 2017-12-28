
package fr.utbm.core.service;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.repository.CourseSessionDao;
import fr.utbm.core.utils.Filter;
import java.util.List;

public class CourseSessionService {
    
    public List<CourseSession> getList(Filter filter) {
        CourseSessionDao dao = new CourseSessionDao();
        return dao.getCourseSessionList(filter);
    }
    public CourseSession getCourseSessionById(int coid){
        CourseSessionDao dao = new CourseSessionDao();
        return dao.getCourseSessionByID(coid);
    }
}
