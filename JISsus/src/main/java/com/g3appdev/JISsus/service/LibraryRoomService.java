package com.g3appdev.JISsus.service;

import com.g3appdev.JISsus.entity.LibraryRoom;
import com.g3appdev.JISsus.repository.LibraryRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryRoomService {

    @Autowired
    private LibraryRoomRepository roomRepository;

    public List<LibraryRoom> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<LibraryRoom> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    public LibraryRoom createRoom(LibraryRoom room) {
        return roomRepository.save(room);
    }

    public LibraryRoom updateRoom(Long id, LibraryRoom roomDetails) {
        LibraryRoom room = roomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Room not found"));

        room.setRoomName(roomDetails.getRoomName());
        room.setAvailableTimeSlots(roomDetails.getAvailableTimeSlots());
        room.setBookingStatus(roomDetails.getBookingStatus());

        return roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}

