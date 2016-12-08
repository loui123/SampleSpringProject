package com.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class AuthController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from SampleSpringProject **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping( value = "/text",method = RequestMethod.GET)
	public @ResponseBody String text() throws Exception {
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("name", "loui");
		String mapAsJson = new ObjectMapper().writeValueAsString(hashMap);
		return mapAsJson;
	}
}
