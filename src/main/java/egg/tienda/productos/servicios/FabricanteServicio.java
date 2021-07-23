package egg.tienda.productos.servicios;

import egg.tienda.productos.entidades.Fabricante;
import egg.tienda.productos.errores.ErrorServicio;
import egg.tienda.productos.repositorios.FabricanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FabricanteServicio {
    
    @Autowired
    private FabricanteRepositorio fabricanteRepositorio;
    
    
    
    public void crearFabricante (String nombre) throws ErrorServicio {
        
        
        // hacer validaciones!!!
        
        
        validar(nombre);
        
        Fabricante fabricante = new Fabricante();
        
        fabricante.setNombre(nombre);
        
        fabricanteRepositorio.save(fabricante);
        
    }
    
    
    
    
    
    
    
    private void validar (String nombre) throws ErrorServicio{
        
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del Autor esta vacio");
        }
        
    }
    
}
