package springdao;

import org.springframework.jdbc.core.JdbcTemplate;

import entity.Student;

public class SpringEntityDao implements SpringDao {
	private JdbcTemplate template;
	public int insert(Student student) {
		String query="insert into students(id,name,address) values(?,?,?);";
		int result=this.template.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	

}
