package egg.tienda.productos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Producto {
        
    // PARAMETROS --------------------------------------------------------------
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private Integer Precio;
    private String Descripcion;
    
    
    // CONSTRUCTORES -----------------------------------------------------------
    public Producto() {
    }

    public Producto(String id, String nombre, Integer Precio, String Descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
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

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    
    
}
