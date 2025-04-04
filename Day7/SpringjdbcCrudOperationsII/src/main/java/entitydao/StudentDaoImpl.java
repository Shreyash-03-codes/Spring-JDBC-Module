package entitydao;

import java.util.HashMap;

import java.util.List;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import entity.Student;
import rowmapper.RowMapperImpl;
public class StudentDaoImpl implements EntityDao {
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}



	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}



	public int setStudent(Student student) {
		HashMap<String, String> map=new HashMap<>();
		map.put("id", student.getId()+"");
		map.put("name", student.getName());
		map.put("address", student.getAddress());
		
		String query="INSERT INTO students(id,name,address) VALUES(:id,:name,:address);";
		int result=this.namedParameterJdbcTemplate.update(query, map);
		return result;
	}
	public int updateStudent(Student student) {
		HashMap<String, String> map=new HashMap<>();
		map.put("id", student.getId()+"");
		map.put("name", student.getName());
		map.put("address", student.getAddress());
		
		String query="UPDATE students SET name=:name,address=:address WHERE id=:id;";
		int result=this.namedParameterJdbcTemplate.update(query, map);
		return result;
	}
	public int deleteStudent(int studentId) {
		HashMap<String, String> map=new HashMap<>();
		map.put("id", studentId+"");
		
		String query="DELETE FROM students WHERE id=:id;";
		int result=this.namedParameterJdbcTemplate.update(query, map);
		return result;
	}
	public Student getStudentById(int studentId) {
		HashMap<String, String> map=new HashMap<>();
		map.put("id", studentId+"");
		String query="SELECT * FROM students WHERE id=:id;";
		Student student=this.namedParameterJdbcTemplate.queryForObject(query, map, new RowMapperImpl());
		return student;
	}
	public List<Student> getAllStudents(){
		String query="SELECT * FROM students;";
		List<Student> students=this.namedParameterJdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	
}
