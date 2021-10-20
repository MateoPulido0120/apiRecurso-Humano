package co.usa.recursohumano.recursohumano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursohumano.recursohumano.model.departamento;
import co.usa.recursohumano.recursohumano.repository.DepartamentoRepositorio;

@Service
public class DepartamentoServicio {
    @Autowired
    private DepartamentoRepositorio departamentoRepositorio;

    public List<departamento>getAll(){
        return departamentoRepositorio.getAll();
    }

    public Optional<departamento>getDepartamento(int id){
        return departamentoRepositorio.getDepartamento(id);
    }

    public departamento save(departamento dpto){
        //Verificar si el dpto es nuevo, si es asi lo guarda
        if(dpto.getNumId()==null){
            return departamentoRepositorio.save(dpto);
        }else{
            //Evalua si el dpto ya existe
            Optional<departamento> consulta=departamentoRepositorio.getDepartamento(dpto.getNumId());
            if(consulta.isEmpty()){
                return departamentoRepositorio.save(dpto);
            }else{
                return dpto;
            }
        }
    }
}
