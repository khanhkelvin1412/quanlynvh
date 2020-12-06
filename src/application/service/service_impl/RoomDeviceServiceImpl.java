package application.service.service_impl;

import application.dao.impl.RoomDeviceDAO;
import application.model.Room_Device;
import application.service.RoomDeviceService;

public class RoomDeviceServiceImpl implements RoomDeviceService {

    private RoomDeviceDAO roomDeviceDAO = new RoomDeviceDAO();


    @Override
    public Room_Device findByRoomIdAndDeviceId(Long roomId, Long deviceId) {
        return roomDeviceDAO.findByRoomIdAndDeviceId(roomId, deviceId);
    }
}
