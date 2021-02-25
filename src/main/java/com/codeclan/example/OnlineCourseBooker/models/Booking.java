package com.codeclan.example.OnlineCourseBooker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private String date;


    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    @JsonIgnoreProperties({"bookings"})
    private Course course;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)
    @JsonIgnoreProperties({"bookings"})
    private Customer customer;



    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;
    }

    public Booking(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
