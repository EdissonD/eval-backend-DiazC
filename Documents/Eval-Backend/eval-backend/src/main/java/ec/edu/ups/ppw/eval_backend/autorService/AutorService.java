package ec.edu.ups.ppw.eval_backend.autorService;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.ppw.eval_backend.autor.Autor;
import jakarta.ejb.Stateless;

@Stateless
public class AutorService {

    @PersistenceContext
    private EntityManager em;

    public List<Autor> listar() {
        return em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
    }

    public void guardar(Autor autor) {
        em.persist(autor);
    }
}
