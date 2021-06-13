package com.springrest.Springrest.services;

import com.springrest.Springrest.entites.Courses;

import java.util.List;

public interface CourseService {
   public List<Courses> getCourses();

   public Courses getCourse(long courseId);

   public Courses addCourse(Courses course);

   public Courses updateCourse(Courses course);

   public void deleteCourse(long parseLong);
}
