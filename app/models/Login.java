package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "logins")
public class Login extends Model{

    @Id
    protected long id;

    @Constraints.Required
    @Column(length = 50,unique = true)
    String username;

    @Constraints.Required
    @Column(length = 50)
    String password;

    @Constraints.Required
    @Column(length = 50)
    String tipoPersona;

    @OneToOne(mappedBy = "login",cascade = CascadeType.ALL)
    Cliente cliente;
    public Login(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
