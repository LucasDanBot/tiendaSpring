package egg.tienda.productos.repositorios;

import egg.tienda.productos.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, String>{
    
    
}
