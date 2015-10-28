package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona extends Model{

    @Id
    protected Long id;

    @OneToOne(mappedBy = "persona",cascade = CascadeType.ALL)
    Cliente cliente;


    @Constraints.Required
    @Column(length = 40)
    String nombres;

    @Constraints.Required
    @Column(length = 40)
    String apellidos;

    @Constraints.Required
    @Column(unique = true,length = 9)
    String dni;

    @Column(length = 2)
    int edad;

    Long telefono;
    @Column(length = 60)
    String direccion;

    @Constraints.Email
    @Column(length = 60)
    String email;

    public Persona(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
