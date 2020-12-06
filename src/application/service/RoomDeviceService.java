package application.service;

import application.model.Room_Device;

public interface RoomDeviceService {
    Room_Device findByRoomIdAndDeviceId(Long roomId, Long deviceId);
}
