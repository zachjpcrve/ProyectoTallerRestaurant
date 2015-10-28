package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.validation.Constraint;


@Entity
@Table(name = "empleado")
public class Empleado extends Model{

    @Id
    private String codigo;

    @OneToOne
    @JoinColumn(name = "codigoPersona")
    private
    List<Persona> personasList;

    @OneToOne
    @JoinColumn(name = "codigoTipoEmpleado")
    private
    List<TipoEmpleado> tipoEmpleadoList;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private String username;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private String password;

    /*constructor*/
    public Empleado(){
    }

    /*getter and setter*/

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Persona> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Persona> personasList) {
        this.personasList = personasList;
    }

    public List<TipoEmpleado> getTipoEmpleadoList() {
        return tipoEmpleadoList;
    }

    public void setTipoEmpleadoList(List<TipoEmpleado> tipoEmpleadoList) {
        this.tipoEmpleadoList = tipoEmpleadoList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
