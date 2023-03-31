package es.cursogetafe.banco.persistencia;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import es.cursogetafe.banco.modelo.Cliente;

public class ClienteDaoImpl implements ClienteDaoCustom {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private ClienteDao cliDao;
	
	@Override
	public Map<String, Cliente> findAllByNif() {
		Map<String, Cliente> resu = new HashMap<>();
		for (Cliente cli : cliDao.findAll()) {
			resu.put(cli.getNif(), cli);
		}
		return resu;
	}
}
