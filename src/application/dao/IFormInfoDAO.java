package application.dao;
import application.model.FormInfo;

import java.util.List;

public interface IFormInfoDAO extends GenericDAO<FormInfo>{
	List<FormInfo> findAll();
	Long insertRoom(FormInfo form_info);
	void updateRoom(FormInfo form_info);
	FormInfo findOne(Long id);
}
