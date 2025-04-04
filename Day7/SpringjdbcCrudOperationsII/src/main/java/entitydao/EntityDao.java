package entitydao;

import java.util.List;

import entity.Student;

public interface EntityDao {
	public int setStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(int studentId);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudents();
}
