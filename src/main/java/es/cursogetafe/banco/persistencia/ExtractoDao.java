package es.cursogetafe.banco.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.cursogetafe.banco.modelo.Cuenta;
import es.cursogetafe.banco.modelo.Extracto;

public interface ExtractoDao extends JpaRepository<Extracto, Integer> {
	
	@Query("SELECT e FROM Extracto e JOIN FETCH e.movimientos "
			+ "JOIN FETCH e.cuenta cu JOIN FETCH cu.tarjetas "
			+ "where e.cuenta = ?1 and e.anyo = ?2 and e.mes = ?3")
	public Extracto extractoFechaEager(Cuenta c, int anyo, int mes);

}
