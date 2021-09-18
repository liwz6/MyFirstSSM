package com.test.service.impl;

import com.test.entity.Student;
import com.test.mapper.StudentMapper;
import com.test.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentByNo(int stuNo) {
		// TODO Auto-generated method stub
		return studentMapper.queryStudentByNo(stuNo);
	}

}
