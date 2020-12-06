package application.dao.impl;


import application.dao.IFormInfoDAO;
import application.mapper.FormInfoMapper;
import application.model.FormInfo;

import java.util.List;

public class FormInfoDAO extends AbstractDAO<FormInfo> implements IFormInfoDAO {

	@Override
	public List<FormInfo> findAll() {
		String sql = "SELECT * FROM form_info";
		return query(sql, new FormInfoMapper());
	}

	@Override
	public Long insertRoom(FormInfo form) {
		StringBuilder sql = new StringBuilder("INSERT INTO form_info");
		sql.append("(full_name, credit_card, birthday,");
		sql.append(" reason, status,");
		sql.append(" date_of_allocation, nation, religion, address_of_allocation, ");
		sql.append("phone, permanent_address, sum_price, number_table, number_chair, number_speaker, number_radio, number_projector, room)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), form.getFullname(), form.getCredit_card(), form.getBirthday(),
				form.getReason(), form.getStatus(),
				form.getDate_of_allocation(), form.getNation(), form.getReligion(), form.getAddress_of_allocation(),
				form.getPhone(), form.getPermanent_address(), form.getSum_price(), form.getTable(), form.getChair(),
				form.getSpeaker(), form.getRadio(), form.getProjector(), form.getRoom());
	}


	@Override
	public void updateRoom(FormInfo form) {

		StringBuilder sql = new StringBuilder("UPDATE form_info SET fullname = ?, adress = ?, credit_card = ?, birthday = ?, gender = ?,");
		sql.append("resident = ?, reason = ?, deposit = ?, status = ?, status_pay = ?,");
		sql.append("date_of_allocation = ?, nation = ?, religion = ?, address_of_allocation = ?,");
		sql.append("phone = ?, permanent_address = ?, sum_price = ?");
		sql.append(" WHERE id = ?");

		update(sql.toString(), form.getFullname(), form.getAddress(), form.getCredit_card(), form.getBirthday(),

				form.getGender(), form.getResident(), form.getReason(), form.getDeposit(), form.getStatus(), form.getStatus_pay(),
				form.getDate_of_allocation(), form.getNation(), form.getReligion(), form.getAddress_of_allocation(),
				form.getPhone(), form.getPermanent_address(), form.getSum_price(), form.getId());
	}

	@Override
	public FormInfo findOne(Long id) {
		String sql = "SELECT * FROM form_info WHERE id = ?" ;
		List<FormInfo> list = query(sql, new FormInfoMapper(), id);
		return list.isEmpty() ? null : list.get(0);
	}
}