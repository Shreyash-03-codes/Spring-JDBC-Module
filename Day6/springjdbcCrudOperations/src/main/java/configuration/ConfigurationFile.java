package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import entitydao.StudentDaoImpl;

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
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public StudentDaoImpl getStudentDaoImpl() {
		StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
		studentDaoImpl.setJdbcTemplate(getJdbcTemplate());
		return studentDaoImpl;
	}
	
}
