package com.example.movieticketbooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "seats")
    private int seats;

    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private String status;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @JsonIgnoreProperties("bookings")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "theater_id")
    private Theater theTheater;

    @OneToOne
    @JoinColumn(name = "show_id")
    private Show show;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTheTheater(Theater theTheater) {
        this.theTheater = theTheater;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Theater getTheTheater() {
        return theTheater;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public int getSeats() {
        return seats;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", seats=" + seats +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                ", theTheater=" + theTheater +
                '}';
    }
}
