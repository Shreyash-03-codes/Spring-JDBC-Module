package springdao;

import entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
}
