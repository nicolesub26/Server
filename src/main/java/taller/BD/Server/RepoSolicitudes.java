package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestResource
//@CrossOrigin("http://localhost:8100")
@CrossOrigin("*")

public interface RepoSolicitudes extends CrudRepository<Solicitudes,Integer> {
    
}
