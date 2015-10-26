package modelo;

        import java.util.*;
        import javax.persistence.*;
        import play.db.ebean.Model;


        import play.data.format.*;
        import play.data.validation.*;

        import com.avaje.ebean.*;


@Entity
@Table(name = "Cliente")
public class Administrador extends Model{

    @Id
    protected Long id;

    String user_admin;

    @(mappedBy = "admin" ,cascade=CascadeType.ALL)
    List<Tutor> tutors;

    String password;
    public String codigo;
    public String nombre;
    public String apellido;
    public String DNI;
    public String email;
    public String direccion;
    public String RUC;

    public Administrador(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_admin() {
        return user_admin;
    }

    public void setUser_admin(String user_admin) {
        this.user_admin = user_admin;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getFullName(){
        return this.getName() + " " + this.getLast_name();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



public class Cliente {
    private int num;
}
