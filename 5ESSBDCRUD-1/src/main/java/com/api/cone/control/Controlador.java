package com.api.cone.control;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/productos")
public class Controlador {

@Autowired
private com.api.cone.repository.IUrep prodRep;

@GetMapping("/listarp")
@CrossOrigin(origins = "http://127.0.0.1:3000")
public List<com.api.cone.modelo.Modelo> listarProductos() {
return prodRep.findAll();

}

@PostMapping("/crearProd")
@CrossOrigin(origins = "http://127.0.0.1:3000")
public com.api.cone.modelo.Modelo crearUsuario(@RequestBody com.api.cone.modelo.Modelo prod) {
    return prodRep.save(prod);
}

}