package com.codeclan.example.OnlineCourseBooker.components;


import com.codeclan.example.OnlineCourseBooker.models.Booking;
import com.codeclan.example.OnlineCourseBooker.models.Course;
import com.codeclan.example.OnlineCourseBooker.models.Customer;
import com.codeclan.example.OnlineCourseBooker.repositories.BookingRepository;
import com.codeclan.example.OnlineCourseBooker.repositories.CourseRepository;
import com.codeclan.example.OnlineCourseBooker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer matt = new Customer("Matt", "Edmonton", 19);
        customerRepository.save(matt);

        Customer alex = new Customer("Alex", "Leith", 41);
        customerRepository.save(alex);

        Customer mila = new Customer("Mila", "Edinburgh", 25);
        customerRepository.save(mila);

        Customer evelyn = new Customer("Evelyn", "Edinburgh", 26);
        customerRepository.save(evelyn);


        Course beauty101 = new Course("Beauty 101", "Dunfermline", 3.50);
        courseRepository.save(beauty101);

        Course health101 = new Course("Health 101", "Newington", 3.10);
        courseRepository.save(health101);

        Course nailArt = new Course("Nail Art", "Stockbridge", 4.20);
        courseRepository.save(nailArt);

        Course tattoo101 = new Course("Tattoo 101", "Granton", 2.90);
        courseRepository.save(tattoo101);

        Course hairHeaven = new Course("Hair Heaven", "Liberton", 3.50);
        courseRepository.save(hairHeaven);


        Booking booking1 = new Booking ("01-01-2021", alex, nailArt);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking ("01-03-2021", mila, tattoo101);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking ("04-01-2021", matt, beauty101);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking ("01-05-2021", evelyn, health101);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("03-05-2021", mila, hairHeaven);
        bookingRepository.save(booking5);



    }
}
