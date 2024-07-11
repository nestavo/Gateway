package Elim.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Elim.interf.Inte;

@RestController
@RequestMapping("/prod")
public class Controli {

	
	@Autowired 
	private Inte pr;
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://127.0.0.1:3000")
	   public void eliminarProducto(@PathVariable Long id) {
        pr.deleteById(id);
    }
}
