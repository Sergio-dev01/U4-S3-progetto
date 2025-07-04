package sergiomaselli;

import sergiomaselli.dao.CatalogoDAO;
import sergiomaselli.dao.PrestitoDAO;
import sergiomaselli.dao.UtenteDAO;
import sergiomaselli.exceptions.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4progetto");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        CatalogoDAO cd = new CatalogoDAO(em);
        PrestitoDAO pd = new PrestitoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);

        try {
//            Creazione elementi
//            Utente utente = new Utente(1234, "Sergio", "Maselli", LocalDate.of(2001, 10, 4));
//            ud.save(utente);
//
//            Libro libro = new Libro(1111, "Geronimo Stilton", 2000, 212, "Non lo so", "avventura e commedia");
//            cd.save(libro);
//
//            Rivista rivista = new Rivista(2345, "Essemagazine", 2025, 40, Periodicita.SETTIMANALE);
//            cd.save(rivista);
//
//            Utente utente2 = new Utente(5678, "Aldo", "Baglio", LocalDate.of(1970, 6, 3));
//            ud.save(utente2);
//
//            Libro libro2 = new Libro(2222, "1000 modi per morire", 2007, 100, "Non lo so", "commedia");
//            cd.save(libro2);
//
//            Rivista rivista2 = new Rivista(6789, "Mastelle", 2023, 80, Periodicita.MENSILE);
//            cd.save(rivista2);
//
//            Utente utente3 = new Utente(869586, "Ajeje", "Brazorf", LocalDate.of(1965, 8, 25));
//            ud.save(utente3);
//
//            Libro libro3 = new Libro(342536, "Piccoli Brividi", 2008, 150, "Jhon Lennon", "horror");
//            cd.save(libro3);
//
//            Rivista rivista3 = new Rivista(90989, "Mastelle", 2023, 80, Periodicita.MENSILE);
//            cd.save(rivista3);
////
//            Utente utente4 = new Utente(9870569, "olly", "mentol", LocalDate.of(2000, 2, 2));
//            ud.save(utente4);
//
//            Libro libro4 = new Libro(565443, "librone", 2006, 130, "Frank Gallagher", "romanzo");
//            cd.save(libro4);
//
//            Rivista rivista4 = new Rivista(3242424, "mintes", 2021, 40, Periodicita.SEMESTRALE);
//            cd.save(rivista4);

//            usato per inserire la data del girono corrente
//            LocalDate oggi = LocalDate.now();
//            Prestito prestitoLibro = new Prestito();
//            prestitoLibro.setUtente(utente);
//            prestitoLibro.setElementoPrestato(libro);
//            prestitoLibro.setDataInizioPrestito(oggi);
//            prestitoLibro.setDataRestituzionePrevista(oggi.plusDays(30));
//            prestitoLibro.setDataRestituzioneEffettiva(null);
//            pd.save(prestitoLibro);

//            LocalDate giorno = LocalDate.of(2020, 5, 4);
//            Prestito prestitoLibro = new Prestito();
//            prestitoLibro.setUtente(utente3);
//            prestitoLibro.setElementoPrestato(libro3);
//            prestitoLibro.setDataInizioPrestito(LocalDate.of(2021, 9, 5));
//            prestitoLibro.setDataRestituzionePrevista(giorno.plusDays(30));
//            prestitoLibro.setDataRestituzioneEffettiva(null);
//            pd.save(prestitoLibro);
//
//
//            Prestito prestitoRivista = new Prestito();
//            prestitoRivista.setUtente(utente3);
//            prestitoRivista.setElementoPrestato(rivista3);
//            prestitoRivista.setDataInizioPrestito(giorno);
//            prestitoRivista.setDataRestituzionePrevista(giorno.plusDays(30));
//            prestitoRivista.setDataRestituzioneEffettiva(null);
//            pd.save(prestitoRivista);

//            Prestito prestitoRivista = new Prestito();
//            prestitoRivista.setUtente(utente4);
//            prestitoRivista.setElementoPrestato(rivista4);
//            prestitoRivista.setDataInizioPrestito(oggi);
//            prestitoRivista.setDataRestituzionePrevista(oggi.plusDays(30));
//            prestitoRivista.setDataRestituzioneEffettiva(null);
//            pd.save(prestitoRivista);

        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
