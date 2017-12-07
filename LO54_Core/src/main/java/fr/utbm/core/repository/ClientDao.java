
package fr.utbm.core.repository;

import fr.utbm.core.entity.Client;
import fr.utbm.core.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ClientDao {
    public void signUp(Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(client);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException he2) {
                    he2.printStackTrace();
                }
            }
        } finally {
            if (session != null)
                   session.close();
        }
    }
    
}
