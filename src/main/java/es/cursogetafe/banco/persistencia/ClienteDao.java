package es.cursogetafe.banco.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.cursogetafe.banco.modelo.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer>, ClienteDaoCustom {

	@Query("SELECT c FROM Cliente c WHERE c.nombre like %?1% or c.apellido1 like %?1% or c.apellido2 like %?1%")
	List<Cliente> findByValue(String valor);

	@Query("SELECT c FROM Cliente c LEFT JOIN FETCH c.cuentas WHERE c.idCliente = :id")
	Cliente findByIdEager(@Param("id") Integer id);
	
	// Este queda implícito sin @Query por aquello del sujeto y predicado (check apuntes)
	Cliente findByNif (String nif);
	
	Cliente findByNifAndNombreLike(String nif, String nombre);
}
