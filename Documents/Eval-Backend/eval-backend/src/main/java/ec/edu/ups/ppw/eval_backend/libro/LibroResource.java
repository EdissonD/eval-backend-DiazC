package ec.edu.ups.ppw.eval_backend.libro;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.edu.ups.ppw.eval_backend.libroService.LibroService;
import jakarta.ejb.EJB;
import jakarta.ws.rs.core.MediaType;

@Path("/libros")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LibroResource {

    @EJB 
    private LibroService service;

    @GET
    public List<Libro> listar() {
        return service.listar();
    }

    @POST
    public void guardar(Libro libro) {
        service.guardar(libro);
    }
}
