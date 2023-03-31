package es.cursogetafe.banco.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"es.cursogetafe.banco.vista", "es.cursogetafe.banco.negocio", "es.cursogetafe.banco.persistencia"})
@PropertySource("classpath:banco.properties")
@Import({JPAConfig.class, ProduccionConfig.class, DesarrolloConfig.class})
public class Config {

}
