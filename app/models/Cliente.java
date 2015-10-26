package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente extends Model{

    @Id
    private String codigo;

    @Constraints.Required
    private String username;

    @Constraints.Required
    private String password;


    @OneToOne
    @JoinColumn(name = "dni")
    private
    List<Persona> personasList;


    /*Constructor*/
    public Cliente(){

    }

    /*Getters and Setters*/

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public List<Persona> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Persona> personasList) {
        this.personasList = personasList;
    }



}
