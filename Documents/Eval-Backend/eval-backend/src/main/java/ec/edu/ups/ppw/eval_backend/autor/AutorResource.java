package ec.edu.ups.ppw.eval_backend.autor;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.edu.ups.ppw.eval_backend.autorService.AutorService;
import jakarta.ejb.EJB;
import jakarta.ws.rs.core.MediaType;

@Path("/autores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AutorResource {

    @EJB
    private AutorService service;

    @GET
    public List<Autor> listar() {
        return service.listar();
    }

    @POST
    public void guardar(Autor autor) {
        service.guardar(autor);
    }
}
