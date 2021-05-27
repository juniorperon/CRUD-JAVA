package dao.jpa;

import javax.persistence.*;

/**
 * * * @author Moreno
 */
public class ManagerFactory {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            try {
                emf = Persistence.createEntityManagerFactory("FormMDISDIPU");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
