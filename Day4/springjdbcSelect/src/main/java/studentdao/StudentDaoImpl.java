package studentdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import entity.Student;
import rowmapper.RowMapperImpl;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int add(Student student) {
		String query="INSERT INTO students (id,name,address) values(?,?,?);";
		int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
	}
	public int update(Student student) {
		String query="UPDATE students SET name=?,address=? where id=?;";
		int result=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return result;
	}
	public int delete(int studentId) {
		String query="DELETE FROM students WHERE id=?;";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}
	
	
	public Student getStudentById(int studentId) {
		String query="SELECT * FROM students WHERE id=?;";
		Student s=this.jdbcTemplate.queryForObject(query, new RowMapperImpl(),studentId);
		return s;
	}
	
	public List<Student> getAllStudents(){
		String query="SELECT * FROM students;";
		List<Student> list=this.jdbcTemplate.query(query, new RowMapperImpl());
		return list;
		
	}


	
}
