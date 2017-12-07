
package fr.utbm.core.repository;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.utils.Filter;
import fr.utbm.core.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CourseSessionDao {
    public List<CourseSession> getCourseSessionList(Filter filter){
        List<CourseSession> sessionList = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
                Criteria courseSessionCrit = session.createCriteria(CourseSession.class);
                /*
                for(SessionWhereValuable key : where.getFilters().keySet())
                        courseSessionCrit.add(
                                        SessionWhereToCriteriaValuable.valueOf(
                                                        key.name()).toRestriction(
                                                                        key, where.getFilters().get(key)
                                                                        )
                        );*/
                sessionList.addAll(courseSessionCrit.list());
                session.close();
        } catch (HibernateException e) {
                e.printStackTrace();
        }
        return sessionList;
    }
}
