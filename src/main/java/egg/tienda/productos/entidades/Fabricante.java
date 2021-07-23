package egg.tienda.productos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Fabricante {
    
    
    // PARAMETROS --------------------------------------------------------------    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;

    
    // CONSTRUCTORES -----------------------------------------------------------
    public Fabricante() {
    }

    public Fabricante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
    // GETTER Y SETTERS --------------------------------------------------------
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
