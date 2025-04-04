package entitydao;

import java.util.List;

import entity.Student;

public interface EntityDao {
	public int setStudent(Student student);
	public int updateStudent(Student student);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudent();
	public int deleteStudent(int studentId);
	
	
}
