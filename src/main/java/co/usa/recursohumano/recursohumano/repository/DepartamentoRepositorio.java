package co.usa.recursohumano.recursohumano.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumano.recursohumano.model.departamento;
import co.usa.recursohumano.recursohumano.repository.crud.DepartamentoCrudRepository;

@Repository
public class DepartamentoRepositorio {
    @Autowired
    private DepartamentoCrudRepository departamentoCrudRepository;
    
    public List<departamento>getAll(){
        return (List<departamento>)departamentoCrudRepository.findAll();  //Convierte un dato iterable en una lista
    }

    public Optional<departamento>getDepartamento(int id){
        //Optional es un tipo de dato implmentado ya que con bases de datos hay datos null
        return departamentoCrudRepository.findById(id);  //Busca el id del departamento
    }

    public departamento save(departamento dpto){
        return departamentoCrudRepository.save(dpto);
    }
}
