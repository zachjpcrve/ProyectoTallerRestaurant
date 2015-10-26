package models;


import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reportes")
public class Reporte extends Model{

    @Id
    private Long codigo;

}
