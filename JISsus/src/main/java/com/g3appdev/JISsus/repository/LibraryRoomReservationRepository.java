package com.g3appdev.JISsus.repository;

import com.g3appdev.JISsus.entity.LibraryRoomReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRoomReservationRepository extends JpaRepository<LibraryRoomReservation, Long> {

}