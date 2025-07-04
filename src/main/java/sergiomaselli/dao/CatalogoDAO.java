package sergiomaselli.dao;

import sergiomaselli.entities.Catalogo;
import sergiomaselli.entities.Libro;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public void deleteByIsbn(int isbn) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Catalogo c = entityManager.find(Catalogo.class, isbn);
        if (c != null) {
            entityManager.remove(c);
            System.out.println("Elemento catalogo con ISBN " + isbn + " rimosso.");
        } else {
            System.out.println("Elemento catalogo con ISBN " + isbn + " non trovato.");
        }
        transaction.commit();
    }

    public Catalogo findByIsbn(int isbn) {
        Catalogo c = entityManager.find(Catalogo.class, isbn);
        if (c == null) throw new RuntimeException("Elemento catalogo con ISBN " + isbn + " non trovato.");
        return c;
    }
    
    public List<Catalogo> findByAnnoPubblicazione(int anno) {
        TypedQuery<Catalogo> query = entityManager.createQuery(
                "SELECT c FROM Catalogo c WHERE c.annoPubblicazione = :anno", Catalogo.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<Libro> findByAutore(String name) {
        TypedQuery<Libro> query = entityManager.createQuery(
                "SELECT l FROM Libro l WHERE LOWER(l.autore) LIKE LOWER(:autore)", Libro.class);
        query.setParameter("autore", "%" + name.toLowerCase() + "%");
        return query.getResultList();
    }

    public List<Catalogo> findByTitolo(String titolo) {
        TypedQuery<Catalogo> query = entityManager.createQuery(
                "SELECT c FROM Catalogo c WHERE c.titolo LIKE :titolo", Catalogo.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }

}

