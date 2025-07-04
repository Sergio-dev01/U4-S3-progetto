package sergiomaselli;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4progetto");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("ciao");
    }
}
