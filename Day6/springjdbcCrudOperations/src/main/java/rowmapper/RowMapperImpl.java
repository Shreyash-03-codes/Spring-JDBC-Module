package rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Student;

public class RowMapperImpl implements RowMapper<Student>{
	public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
		Student student=new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAddress(rs.getString("address"));
		return student;
	}
}
