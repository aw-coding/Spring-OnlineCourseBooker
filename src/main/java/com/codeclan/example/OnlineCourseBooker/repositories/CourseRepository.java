package com.codeclan.example.OnlineCourseBooker.repositories;

import com.codeclan.example.OnlineCourseBooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
