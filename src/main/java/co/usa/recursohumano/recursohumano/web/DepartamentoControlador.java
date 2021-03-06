package co.usa.recursohumano.recursohumano.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.usa.recursohumano.recursohumano.model.departamento;
import co.usa.recursohumano.recursohumano.service.DepartamentoServicio;

@RestController
@RequestMapping("/api/departamento")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class DepartamentoControlador {
    @Autowired
    private DepartamentoServicio departamentoServicio;

    @GetMapping("/all")
    public List<departamento>getDepartamiento(){
        return departamentoServicio.getAll();
    }

    @GetMapping("/{numId}")
    public Optional<departamento>getDepartamentos(@PathVariable("numId") int id){
        return departamentoServicio.getDepartamento(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)

    public departamento save(@RequestBody departamento dpto){
        return departamentoServicio.save(dpto);
    }
}
