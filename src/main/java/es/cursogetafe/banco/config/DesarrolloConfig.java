package es.cursogetafe.banco.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile("desarrollo")
public class DesarrolloConfig {

	@Autowired
	Environment prop;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName(prop.getProperty("des.bbdd.driver"));
		bds.setUrl(prop.getProperty("des.bbdd.url"));
		return bds;
	}
}
