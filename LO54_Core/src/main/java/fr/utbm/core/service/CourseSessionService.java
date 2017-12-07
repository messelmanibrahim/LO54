
package fr.utbm.core.service;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.repository.CourseSessionDao;
import fr.utbm.core.utils.Filter;
import java.util.List;

public class CourseSessionService {
    
    public List<CourseSession> getList() {
        CourseSessionDao dao = new CourseSessionDao();
        return dao.getCourseSessionList(new Filter());
    }
    public List<CourseSession> getList(Filter filter) {
        CourseSessionDao dao = new CourseSessionDao();
        return dao.getCourseSessionList(filter);
    }
}