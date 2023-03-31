package es.cursogetafe.banco.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cursogetafe.banco.modelo.TipoMovimiento;

public interface TipoMovimientoDao extends JpaRepository<TipoMovimiento, Integer> {

}
