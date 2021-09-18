package com.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.Student;
import com.test.service.StudentService;

@RequestMapping("student")
@Controller
public class StudentController {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("queryByNo/{stuNo}")
	public String queryStudent(@PathVariable("stuNo")Integer stuNo,Map<String,Object> map) {
		Student student=studentService.queryStudentByNo(stuNo);
		System.out.println();
		map.put("student", student);
		return "result";
		
	}
}
