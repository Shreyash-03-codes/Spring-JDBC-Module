package studentdao;

import org.springframework.jdbc.core.JdbcTemplate;
import entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	@Override
	public int insert(Student student) {
		
		String query="INSERT INTO students(id,name,address) VALUES (?,?,?);";
		int result=this.template.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
		
	}
	
	@Override
	public int update(Student student) {
		
		String query="UPDATE students SET name=?,address=? WHERE id=?;";
		int result=this.template.update(query,student.getName(),student.getAddress(),student.getId());
		return result;
		
	}
	
	@Override 
	public int delete(Student student) {
		
		String query="DELETE FROM students WHERE id=?;";
		int result=this.template.update(query,student.getId());
		return result;
		
	}
}
