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
        
        validar(nombre);
        
        Fabricante fabricante = new Fabricante();
        
        fabricante.setNombre(nombre);
        
        fabricanteRepositorio.save(fabricante);
        
    }
    
    public void modificarFabricante (String nombre, String nombreNuevo) throws ErrorServicio {
        
        validar(nombre);
        validar(nombreNuevo);
        
        Fabricante fabricante = fabricanteRepositorio.buscarPorNombre(nombre);
        
        if (fabricante == null) {
            throw new ErrorServicio("No se encontro ningun Fabricante con ese nombre");
        }
        
        fabricante.setNombre(nombreNuevo);
        
        fabricanteRepositorio.save(fabricante);
        
    }
    
    
    
    
    
    private void validar (String nombre) throws ErrorServicio{
        
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del Autor esta vacio");
        }
        
    }
    
}
