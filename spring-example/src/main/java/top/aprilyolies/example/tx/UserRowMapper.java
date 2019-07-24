package top.aprilyolies.example.tx;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setAge(rs.getInt("age"));
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setSex(rs.getString("sex"));
		return user;
	}
}
