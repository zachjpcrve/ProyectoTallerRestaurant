package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "clientes")
public class Cliente extends Model{

    @Id
    protected Long id;


    @OneToOne
    Persona persona;

    @Column(unique = true)
    Long ruc;

    @OneToOne()
    Login login;

    public Cliente(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Long getRuc() {
        return ruc;
    }

    public void setRuc(Long ruc) {
        this.ruc = ruc;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
