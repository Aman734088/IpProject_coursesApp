package com.springrest.Springrest.controller;

import com.springrest.Springrest.entites.Courses;
import com.springrest.Springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService CourseService;
    //get the Courses
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/courses")
    public List<Courses> getCourses()
    {

        return this.CourseService.getCourses();
    }
    //single course get
    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId)
    {
        return this.CourseService.getCourse(Long.parseLong(courseId));
    }
    //course add
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course)
    {

        return this.CourseService.addCourse(course);
    }
    //update course using PUT request
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses course){

        return this.CourseService.updateCourse(course);
    }
    //delete the course
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            this.CourseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
