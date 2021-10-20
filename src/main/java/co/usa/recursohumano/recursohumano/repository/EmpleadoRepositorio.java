package co.usa.recursohumano.recursohumano.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumano.recursohumano.model.Empleado;
import co.usa.recursohumano.recursohumano.repository.crud.EmpleadoCrudRepository;

@Repository
public class EmpleadoRepositorio {
    
    @Autowired
    private EmpleadoCrudRepository empleadoCrudRepository;
    
    public List<Empleado>getAll(){
        return (List<Empleado>)empleadoCrudRepository.findAll();
    }

    public Optional<Empleado>getEmpleado(int id){
        return empleadoCrudRepository.findById(id);
    }

    public Empleado save(Empleado empleado){
        return empleadoCrudRepository.save(empleado);
    }
}
