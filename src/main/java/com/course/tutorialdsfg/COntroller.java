package com.course.tutorialdsfg;

import javax.xml.ws.RespectBinding;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class COntroller {
	@RequestMapping(value="/get" )
	public Employee get()
	{
		
		return new Employee("a", "asdf");
	}

}
