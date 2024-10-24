package com.g3appdev.JISsus.controller;

import com.g3appdev.JISsus.entity.LibraryRoomReservation;
import com.g3appdev.JISsus.service.LibraryRoomReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservations")
public class LibraryRoomReservationController {

    @Autowired
    private LibraryRoomReservationService reservationService;

    @GetMapping
    public List<LibraryRoomReservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibraryRoomReservation> getReservationById(@PathVariable Long id) {
        Optional<LibraryRoomReservation> reservation = reservationService.getReservationById(id);
        return reservation.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public LibraryRoomReservation createReservation(@RequestBody LibraryRoomReservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibraryRoomReservation> updateReservation(@PathVariable Long id,
                                                                    @RequestBody LibraryRoomReservation reservationDetails) {
        return ResponseEntity.ok(reservationService.updateReservation(id, reservationDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        return ResponseEntity.noContent().build();
    }
}

