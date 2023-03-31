package es.cursogetafe.banco.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cursogetafe.banco.modelo.Tarjeta;

public interface TarjetaDao extends JpaRepository<Tarjeta, Integer> {

}
