package sergiomaselli.dao;

import sergiomaselli.entities.Catalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CatalogoDAO {
    private final EntityManager entityManager;

    public CatalogoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Catalogo newElement) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newElement);
        transaction.commit();
        System.out.println("L'Articolo" + newElement.getTitolo() + "è stato aggiunto correttamente!");
    }
}
