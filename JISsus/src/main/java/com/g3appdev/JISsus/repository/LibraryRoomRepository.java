package com.g3appdev.JISsus.repository;
import com.g3appdev.JISsus.entity.LibraryRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRoomRepository extends JpaRepository<LibraryRoom, Long> {
    // Custom query methods can go here
}