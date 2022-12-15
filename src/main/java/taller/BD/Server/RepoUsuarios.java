package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
//@CrossOrigin("http://localhost:8100")
@CrossOrigin("*")
//@RestResource
@RestResource(path = "usuarios")
public interface RepoUsuarios extends CrudRepository<Usuario,String> {

}