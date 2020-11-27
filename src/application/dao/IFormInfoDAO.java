package application.dao;


import application.model.Form_info;

import java.util.List;

public interface IFormInfoDAO extends GenericDAO<Form_info>{
	List<Form_info> findAll();
	Long insertRoom(Form_info form_info);
	void updateRoom(Form_info form_info);
	Form_info findOne(Long id);
	void delete(Long id);
}
