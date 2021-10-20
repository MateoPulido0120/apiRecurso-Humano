package co.usa.recursohumano.recursohumano.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="departamento")

public class departamento implements Serializable{

    //Campo de llave primaria autoincremental
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numId;
    private String nombreDepartamento;
    private Date fechaCreacionDate;

    //Relacion uno a muchos para enlazar la clase empleado
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "departamento")
    @JsonIgnoreProperties("departamento")
    private List<Empleado> empleado;




    public Date getFechaCreacionDate() {
        return fechaCreacionDate;
    }
    public void setFechaCreacionDate(Date fechaCreacionDate) {
        this.fechaCreacionDate = fechaCreacionDate;
    }
    public Integer getNumId() {
        return numId;
    }
    public void setNumId(Integer numId) {
        this.numId = numId;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public List<Empleado> getEmpleado() {
        return empleado;
    }
    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    

}
