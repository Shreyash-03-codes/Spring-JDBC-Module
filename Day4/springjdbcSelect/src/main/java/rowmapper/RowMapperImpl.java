package rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Student;

public class RowMapperImpl implements RowMapper<Student>{
	public Student mapRow(ResultSet set,int rowNum) throws SQLException{
		Student student=new Student();
		student.setId(set.getInt(1));
		student.setName(set.getString(2));
		student.setAddress(set.getString(3));
		return student;
	}


}
