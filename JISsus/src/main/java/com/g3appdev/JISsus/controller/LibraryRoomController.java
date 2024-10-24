package com.g3appdev.JISsus.controller;

import com.g3appdev.JISsus.entity.LibraryRoom;
import com.g3appdev.JISsus.service.LibraryRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rooms")
public class LibraryRoomController {

    @Autowired
    private LibraryRoomService roomService;

    @GetMapping
    public List<LibraryRoom> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibraryRoom> getRoomById(@PathVariable Long id) {
        Optional<LibraryRoom> room = roomService.getRoomById(id);
        return room.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public LibraryRoom createRoom(@RequestBody LibraryRoom room) {
        return roomService.createRoom(room);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibraryRoom> updateRoom(@PathVariable Long id,
                                                  @RequestBody LibraryRoom roomDetails) {
        return ResponseEntity.ok(roomService.updateRoom(id, roomDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
        return ResponseEntity.noContent().build();
    }
}

