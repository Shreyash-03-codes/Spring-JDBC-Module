package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import entitydao.EntityDaoImpl;

@Configuration

public class ConfigurationFile {
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("shreyash@2005");
		return dataSource;
	}
	
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
	@Bean
	public EntityDaoImpl getDaoImpl() {
		EntityDaoImpl entityDaoImpl=new EntityDaoImpl();
		entityDaoImpl.setJdbcTemplate(getTemplate());
		return entityDaoImpl;
	}
}
