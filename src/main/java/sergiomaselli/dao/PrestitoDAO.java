package sergiomaselli.dao;

import sergiomaselli.entities.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager entityManager;

    public PrestitoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Prestito newPrestito) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPrestito);
        transaction.commit();
        System.out.println("Prestito per" + newPrestito.getUtente() + "è stato aggiunto correttamente!");
    }

    public void deleteById(long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Prestito p = entityManager.find(Prestito.class, id);
        if (p != null) {
            entityManager.remove(p);
            System.out.println("Prestito con ID " + id + " rimosso.");
        } else {
            System.out.println("Prestito con ID " + id + " non trovato.");
        }
        transaction.commit();
    }

    public Prestito findById(long id) {
        Prestito p = entityManager.find(Prestito.class, id);
        if (p == null) throw new RuntimeException("Prestito con ID " + id + " non trovato.");
        return p;
    }
}
