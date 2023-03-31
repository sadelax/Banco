package es.cursogetafe.banco.vista;

import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import es.cursogetafe.banco.modelo.Cliente;
import es.cursogetafe.banco.persistencia.ClienteDao;


@Component
@Profile("desarrollo")
public class PruebaOtrosMetodos {
	
	@Autowired
	private ClienteDao cliDao;
	
	@PostConstruct
	public void prueba() {
		System.out.println("Esta es la prueba");
		System.out.println(cliDao.findByNif("82278210B"));
		Map<String, Cliente> clientes = cliDao.findAllByNif();
		
		// recorre las claves
		for(String nif : clientes.keySet()) {
			System.out.println(nif);
		}
		
		// recorre los valores
		for(Cliente cliente: clientes.values()) {
			System.out.println(cliente);
		}
		
		// acceder a todo el mapa - no muy eficiente xd
		for(String nif : clientes.keySet()) {
			System.out.println(nif + " : " + clientes.get(nif));
		}
		
		System.out.println("==============================================================================================================================================================");
		
		// la forma correcta de iterar un mapa
		for(Entry<String, Cliente> entry : clientes.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
			System.out.println(entry); // hay un toString ahí to makeao
		}
	}	

	
	
	
}
