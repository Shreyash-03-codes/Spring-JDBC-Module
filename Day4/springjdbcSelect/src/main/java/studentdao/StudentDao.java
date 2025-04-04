package studentdao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	public int add(Student student);
	public int update(Student student);
	public int delete(int studentId);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudents();
}
