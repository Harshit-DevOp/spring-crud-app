package com.example.springrest.restTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrest.restTest.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
