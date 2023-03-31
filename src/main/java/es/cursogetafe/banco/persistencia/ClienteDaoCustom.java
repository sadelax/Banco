package es.cursogetafe.banco.persistencia;

import java.util.Map;

import es.cursogetafe.banco.modelo.Cliente;

public interface ClienteDaoCustom {

	Map<String, Cliente> findAllByNif();
}
