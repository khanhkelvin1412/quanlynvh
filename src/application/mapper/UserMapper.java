package application.mapper;

import application.model.User;

import java.sql.ResultSet;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs) {
		try {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setPassword(rs.getString("password"));
			user.setUsername(rs.getString("username"));
			user.setStatus(rs.getInt("status"));
			return user;
		} catch (Exception e) {
			return null;
		}
	}

}
