package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.validation.Constraint;


@Entity
@Table(name = "usuarios")
public class Usuario extends Model{

    @Id
    protected Long dni;

    @Constraints.Required
    @Constraints.MaxLength(50)
    public String nombre;

    @Constraints.Required
    @Constraints.MaxLength(60)
    public String apellido;

    private String sexo;

    private String direccion;

    private Long telefono;

    @Constraints.Email
    private String correo;

    @OneToMany
    private int tipoUsuario;

}
