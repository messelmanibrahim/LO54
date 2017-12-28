
package fr.utbm.core.repository;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.utils.Filter;
import fr.utbm.core.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class CourseSessionDao {
    
    public List<CourseSession> getCourseSessionList(Filter filter){
        List<CourseSession> sessionList = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            boolean b = false;
            Query query;
            String str = "from CourseSession CS";
            if (filter.getCode() != null){
                if (!b){
                    str += " Where ";
                }
                str += "CS.course.code = :courseCode";
                b = true;
            }
            if(filter.getCity()!= null){
                if (!b){
                    str += " Where ";
                }
                if (b){
                    str += " AND ";
                }
                str += "CS.location.city = :city";
                b=true;
            }
            if(filter.getDate()!= null){
                if (!b){
                    str += " Where ";
                }
                if (b){
                    str += " AND ";
                }
                str += ":date Between CS.start And CS.end";
            }
            query = session.createQuery(str);
            if (filter.getCode() != null){
                query.setParameter("courseCode", filter.getCode());
            }
            if(filter.getCity() != null){
                query.setParameter("city", filter.getCity());
            }
             if(filter.getDate()!= null){
                query.setParameter("date", filter.getDate());
            }           
            sessionList.addAll(query.list());
        } catch (HibernateException e) {
            e.printStackTrace();
        }finally {
            if (session != null) {
                session.close();
            }
        }
        return sessionList;
    }
    
    public CourseSession getCourseSessionByID(int coid) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String str = "from CourseSession CS Where CS.id = :cid";
        Query query = session.createQuery(str);
        query.setParameter("cid", coid);
        List<CourseSession> sessionList = new ArrayList<>();
        sessionList.addAll(query.list());
        return sessionList.get(0);
    }
}
