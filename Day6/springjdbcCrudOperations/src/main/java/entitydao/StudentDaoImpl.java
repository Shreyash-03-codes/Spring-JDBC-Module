package entitydao;

import java.util.List;

import entity.Student;
import rowmapper.RowMapperImpl;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int setStudent(Student student) {
		String query="INSERT INTO students(id,name,address) VALUES (?,?,?);";
		int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
	}
	
	public int updateStudent(Student student) {
		String query="UPDATE students SET name=?,address=? WHERE id=?;";
		int result=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return result;
	}
	
	public int deleteStudent(int studentId) {
		String query="DELETE FROM students WHERE id=?;";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}
	
	public Student getStudentById(int studentId) {
		String query="SELECT * FROM students WHERE id=?;";
		Student student=this.jdbcTemplate.queryForObject(query, new RowMapperImpl(),studentId);
		return student;
	}
	public List<Student> getAllStudents(){
		String query="SELECT * FROM students;";
		List<Student> students=this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}
	
}
