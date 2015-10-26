package models;


import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tiposUsuarios")
public class TipoUsuario extends Model{

    @Constraints.MaxLength(80)
    private String descripcion;




}
