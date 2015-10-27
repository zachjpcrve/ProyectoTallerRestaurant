package models;


import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "comprobante")

public class Comprobante extends Model{

    @Id
    private String codigoComprobante;

    @OneToOne
    @JoinColumn(name = "codigoPedido")
    private
    List<Pedido> pedidosList;

    @OneToOne
    @JoinColumn(name = "codigoTarjeta")
    private
    List<Tarjeta> codigoTarjeta;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private boolean tipoDeComprobante;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private double Monto;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private Date fecha;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private Date hora;

    @Constraints.Required
    @Constraints.MaxLength(40)
    private boolean tipoDePago;

    /*Constructor*/
    public Comprobante() {
    }

    public String getCodigoComprobante() {
        return codigoComprobante;
    }

    public void setCodigoComprobante(String codigoComprobante) {
        this.codigoComprobante = codigoComprobante;
    }

    public List<Pedido> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedido> pedidosList) {
        this.pedidosList = pedidosList;
    }

    public List<Tarjeta> getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(List<Tarjeta> codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public boolean isTipoDeComprobante() {
        return tipoDeComprobante;
    }

    public void setTipoDeComprobante(boolean tipoDeComprobante) {
        this.tipoDeComprobante = tipoDeComprobante;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public boolean isTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(boolean tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    /*Getter and Setter*/



}
