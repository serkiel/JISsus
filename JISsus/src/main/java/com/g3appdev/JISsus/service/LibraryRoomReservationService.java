package com.g3appdev.JISsus.service;

import com.g3appdev.JISsus.entity.LibraryRoomReservation;
import com.g3appdev.JISsus.repository.LibraryRoomReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryRoomReservationService {

    @Autowired
    private LibraryRoomReservationRepository reservationRepository;

    public List<LibraryRoomReservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<LibraryRoomReservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    public LibraryRoomReservation createReservation(LibraryRoomReservation reservation) {
        return reservationRepository.save(reservation);
    }

    public LibraryRoomReservation updateReservation(Long id, LibraryRoomReservation reservationDetails) {
        LibraryRoomReservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        reservation.setUserID(reservationDetails.getUserID());
        reservation.setStartTime(reservationDetails.getStartTime());
        reservation.setEndTime(reservationDetails.getEndTime());
        reservation.setReservationStatus(reservationDetails.getReservationStatus());
        reservation.setLibraryRoom(reservationDetails.getLibraryRoom());

        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
