package hostelproject.demohostel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import hostelproject.demohostel.services.student_service;
import java.util.List;
import hostelproject.demohostel.entity.student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/hostel")
public class student_controller {
    @Autowired
    private student_service ss;
    @GetMapping("studentdisplay")
    public List<student> getMethod() {
        return  ss.getallstudents();
    }

    @PostMapping("addstud")
    public String postMethod(@RequestBody student student) {
      
        
        return ss.Createstudent(student);
    }
    
   @DeleteMapping("delete")
public String deleteStudent(@RequestBody student student) {
    ss.deletestudent(student); 
    return "Student deleted successfully";
    
}
@PutMapping("update")
public String updateStudentName( @RequestBody student student) {
    return "updated"+ss.updateStudent(student);
}

 @GetMapping("getstudent")

 public ModelAndView getstudent() {

     ModelAndView mav = new ModelAndView();

     mav.setViewName("user-data");

     mav.addObject("Prasad", ss.getallstudents());

     return mav;
 }

 @PostMapping("addstudent")

 public ModelAndView addstudents(@ModelAttribute student student) {

     ModelAndView mav = new ModelAndView();

     mav.setViewName("user-data");

     mav.addObject("Prasad", ss.Createstudent(student));

     return mav;
 }


}