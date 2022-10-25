package com.example.demo.info;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;
import com.example.demo.info.model.Project;

@RestController //class =>json translate
public class infoController {
	@GetMapping("/info")
	public Object projectInfo() {
		Project prj = new Project();
		prj.projectName = "restapi";
		prj.author = "sgy";
		prj.createDate = new Date();
		return prj;
	}

	
}
