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
//
//            Libro libro5 = new Libro(888564, "libroEco", 2003, 130, "Frank Gallagher", "romanzo");
//            cd.save(libro5);
//
//            Rivista rivista6 = new Rivista(9094, "luna", 2091, 40, Periodicita.MENSILE);
//            cd.save(rivista6);

//            Libro libroConEco = new Libro(999999, "Titolo di prova", 2020, 100, "Umberto Eco", "saggio");
//            cd.save(libroConEco);

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

            //********************METODI****************


            System.out.println("------------------------METODI------------------");

            //rimuovi un elemento tramite isbn
//            cd.deleteByIsbn(123122);
//
//            // Cerca elemento con isbn 2345
//            Catalogo c = cd.findByIsbn(2345);
//            if (c != null) {
//                System.out.println("Trovato elemento con ISBN 2345: " + c);
//            } else {
//                System.out.println("Elemento con ISBN 2222 non trovato.");
//            }
//
//            // Cerca elementi pubblicati nel 2023
//            List<Catalogo> elementi2020 = cd.findByAnnoPubblicazione(2023);
//            System.out.println("Elementi pubblicati nel 2023:");
//            elementi2020.forEach(System.out::println);
//
//            // Cerca libri di autore contenente "Eco"
//            List<Libro> libriEco = cd.findByAutore("eco");
//            System.out.println("Libri di autori contenenti 'eco': ");
//            libriEco.forEach(System.out::println);

            //Ricerca risultato contenente titolo
//            List<Catalogo> risultatiTitolo = cd.findByTitolo("magazine");
//            System.out.println("Elementi con titolo contenente 'magazine':");
//            risultatiTitolo.forEach(System.out::println);


        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
