package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.validation.Constraint;

@Entity
@Table(name = "pedido")
public class Pedido extends Model{

    @Id
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "codigoPersona", cascade=CascadeType.ALL)
    private
    List<Persona> personasList;



}
