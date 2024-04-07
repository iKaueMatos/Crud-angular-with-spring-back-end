package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
