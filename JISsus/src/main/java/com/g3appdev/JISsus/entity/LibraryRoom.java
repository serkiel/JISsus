package com.g3appdev.JISsus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LibraryRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libraryRoomID;

    private String roomName;
    private String availableTimeSlots;
    private String bookingStatus;

    // Getters and setters

    public Long getLibraryRoomID() {
        return libraryRoomID;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public String getAvailableTimeSlots() {
        return availableTimeSlots;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setAvailableTimeSlots(String availableTimeSlots) {
        this.availableTimeSlots = availableTimeSlots;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    // Constructors, if necessary
}
