package com.objectspy.um.conroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("msg", "hello how are you?");
		return view;
	}

	@RequestMapping("/greet1/{first_name}/{lastName}")
	public ModelAndView greet1(@PathVariable("first_name") String firstName, @PathVariable String lastName) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("msg", "hello" + firstName + "how are you?");
		return view;
	}

	@RequestMapping("/greet2/{first_name}/{last_name}")
	public ModelAndView greet2(@PathVariable Map<String, String> info) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("msg", "hello" + info.get("first_name") + " " + " " + info.get("last_name"));
		return view;
	}

	@RequestMapping("/greet3")
	public ModelAndView greet3(@RequestParam("first_name") String firstName, @RequestParam String lastName) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("msg", "hello" + firstName + "how are you?");
		return view;
	}

	@RequestMapping("/greet4}")
	public ModelAndView greet4(@RequestParam Map<String, String> info) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("msg", "hello" + info.get("first_name") + " " + " " + info.get("last_name"));
		return view;

	}
}