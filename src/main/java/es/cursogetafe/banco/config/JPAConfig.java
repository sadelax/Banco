package es.cursogetafe.banco.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// esto habilita los daos
@EnableJpaRepositories("es.cursogetafe.banco.persistencia")
// y ahora habilito la gestión de transas
@EnableTransactionManagement
public class JPAConfig {
	
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean emf(DataSource ds) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		
		// inyectamos el datasource
		emf.setDataSource(ds);
		
		// indicamos quién es el proveedor (motor) de jpa: hibernate
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		// ahora le vamos a indicar dónde están las entity class
		emf.setPackagesToScan("es.cursogetafe.banco.modelo");
		
		// crear un map para incluir las propiedades JPA (antes estaban en el persistence.xml)
		// también se puede crear un objeto properties en vez de un map.
		Map<String, Object> prop = new HashMap<>();
		prop.put("hibernate.show_sql", true);
		
		// para poder conectar con el sqlite
		prop.put("hibernate.dialect", "org.sqlite.hibernate.dialect.SQLiteDialect");
		
		// le asignamos el mapa con las propiedades
		emf.setJpaPropertyMap(prop);
		
		return emf;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txM = new JpaTransactionManager();
		txM.setEntityManagerFactory(emf);
		return txM;
	}

}
