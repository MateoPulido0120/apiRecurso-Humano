package co.usa.recursohumano.recursohumano.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="empleado")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numId;
    private String nombre;
    private Integer edad;
    private String ciudad;
    private String salario;

    //Relacion con clase departamento
    @ManyToOne
    @JoinColumn(name="departamendo_id")
    @JsonIgnoreProperties("empleado")
    private departamento departamento;

    public Integer getNumId() {
        return numId;
    }
    public void setNumId(Integer numId) {
        this.numId = numId;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(departamento departamento) {
        this.departamento = departamento;
    }

    
}
