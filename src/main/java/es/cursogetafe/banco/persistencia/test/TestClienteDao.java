package es.cursogetafe.banco.persistencia.test;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import es.cursogetafe.banco.modelo.Cliente;
import es.cursogetafe.banco.modelo.Genero;
import es.cursogetafe.banco.persistencia.ClienteDao;

//@Component
public class TestClienteDao {

	@Autowired
	ClienteDao cd;
	
	@PostConstruct
	public void test() {
		
		System.out.println("Test save");
		Cliente nuevo = new Cliente();
		nuevo.setNombre("sandra");
		nuevo.setApellido1("dela");
		nuevo.setApellido2("cruz");
		nuevo.setNif("5043773005L");
		nuevo.setGenero(Genero.M);
		nuevo.setProvincia("madrid");
		nuevo.setMunicipio("madrid");
		cd.save(nuevo);
		System.out.println(nuevo);
		System.out.println("-------------------");
		
		System.out.println("Test findById");
		Optional<Cliente> idOp = cd.findById(4);
		if(idOp.isPresent())
			System.out.println(idOp);
		System.out.println("-------------------");
		
		System.out.println("Test findByIdEager");
		Cliente eager = cd.findByIdEager(23);
		System.out.println(eager);
		System.out.println("-------------------");
		
		System.out.println("Test findAll");
		Set<Cliente> clientes = new TreeSet<>(cd.findAll());
		System.out.println(clientes);
		System.out.println("-------------------");
	}
}
