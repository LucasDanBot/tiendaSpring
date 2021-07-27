package egg.tienda.productos.repositorios;

import egg.tienda.productos.entidades.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepositorio extends JpaRepository<Fabricante, String> {
    
    @Query("SELECT c FROM Fabricante c WHERE c.nombre = :nombre")
    public Fabricante buscarPorNombre (@Param("nombre") String nombre);
    
}
