
package fr.utbm.core.repository;

import fr.utbm.core.entity.Location;
import fr.utbm.core.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class LocationDao {
    public List<Location> getLocationList() {
        List<Location> locations = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            Query query = session.createQuery("from Location");
            locations.addAll(query.list());
        } catch (HibernateException e) {
            e.printStackTrace();
        }finally {
            if (session != null) {
                session.close();
            }
        }
        return locations;
    }
}
