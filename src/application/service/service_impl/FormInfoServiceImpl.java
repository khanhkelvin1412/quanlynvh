package application.service.service_impl;

import application.dao.impl.FormInfoDAO;
import application.model.FormInfo;
import application.service.FormInfoService;

public class FormInfoServiceImpl implements FormInfoService {

    FormInfoDAO formInfoDAO = new FormInfoDAO();

    @Override
    public Long save(FormInfo form) {
        return formInfoDAO.insertRoom(form);
    }
}
