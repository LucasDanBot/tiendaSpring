package egg.tienda.productos.repositorios;

import egg.tienda.productos.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, String>{
    
    
}
