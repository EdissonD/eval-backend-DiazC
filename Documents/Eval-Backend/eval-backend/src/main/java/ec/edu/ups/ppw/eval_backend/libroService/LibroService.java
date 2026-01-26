package ec.edu.ups.ppw.eval_backend.libroService;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.ppw.eval_backend.autor.Autor;
import ec.edu.ups.ppw.eval_backend.libro.Libro;
import jakarta.ejb.Stateless;

@Stateless
public class LibroService {

    @PersistenceContext
    private EntityManager em;

    public List<Libro> listar() {
        return em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
    }

    public void guardar(Libro libro) {
        libro.setAutor(em.find(Autor.class, libro.getAutor().getId()));
        em.persist(libro);
    }
}

