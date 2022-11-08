package com.students.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


@Controller
public class DemoController {
	
	// Annotation 
		@ResponseBody
		@RequestMapping("/hello")

		// Method 
		public String helloWorld() 
		{
		    return "Hello new  World!";
		}

}
