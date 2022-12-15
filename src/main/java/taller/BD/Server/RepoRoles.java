package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
//@CrossOrigin("http://localhost:8100")
@CrossOrigin("*")
@RestResource(path = "roles",rel = "roles")
//@RestResource // Faltaba esto para que funcione
public interface RepoRoles extends CrudRepository<Roles,Integer> {
    
}
