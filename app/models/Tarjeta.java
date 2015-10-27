package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Tarjeta")

public class Tarjeta extends Model{

    @Id
    private String codigoTarjeta;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private String afiliacion;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private String tipo;

    /*Constructor*/

    public Tarjeta(){

    }

    public String getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(String codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*Getter and Setter*/


}
