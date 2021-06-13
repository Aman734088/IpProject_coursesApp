package com.springrest.Springrest.dao;

import com.springrest.Springrest.entites.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
