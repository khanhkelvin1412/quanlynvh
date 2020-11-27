package application.dao;


import application.model.User;

import java.util.List;

public interface IUserDAO extends GenericDAO<User>{
	List<User> findAll();
	Long insertUser(User user);
	void updateUser(User user);
	User findOne(Long id);
	void delete(Long id);
}
