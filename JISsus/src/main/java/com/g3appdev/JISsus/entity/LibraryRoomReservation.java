package com.g3appdev.JISsus.entity;

import jakarta.persistence.*;

@Entity
public class LibraryRoomReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libraryReservationID;

    @ManyToOne
    @JoinColumn(name = "roomID", nullable = false)
    private LibraryRoom libraryRoom;

    private Long userID;
    private String startTime;
    private String endTime;
    private String reservationStatus;

    // Getters and setters

    public void setLibraryRoom(LibraryRoom libraryRoom) {
        this.libraryRoom = libraryRoom;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Long getLibraryReservationID() {
        return libraryReservationID;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public Long getUserID() {
        return userID;
    }

    public LibraryRoom getLibraryRoom() {
        return libraryRoom;
    }
    // Constructors, if necessary
}



