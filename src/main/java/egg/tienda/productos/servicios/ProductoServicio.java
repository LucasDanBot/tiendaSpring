package egg.tienda.productos.servicios;

import egg.tienda.productos.errores.ErrorServicio;
import egg.tienda.productos.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductoServicio {
    
    @Autowired
    private ProductoRepositorio prodcutoRepositorio;
    
    
    public void crearProducto (String nombre, Integer precio, String descripcion) {
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    private void validarNombre (String nombre, Integer precio, String descripcion) throws ErrorServicio{
        
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del Autor esta vacio");
        }
        
    }
    
    private void validarPrecio (String nombre, Integer precio, String descripcion) throws ErrorServicio{
        
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del Autor esta vacio");
        }
        
    }
    
    private void validarDescripcion (String nombre, Integer precio, String descripcion) throws ErrorServicio{
        
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del Autor esta vacio");
        }
        
    }
}
