package com.app.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Employee;
import com.app.validator.EmployeeValidator;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeValidator validator;
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = { "/reg", "/insert" })
	public String showReg(ModelMap map) {
		map.addAttribute("employee", new Employee());
		return "Register";
	}

	@RequestMapping(value = "/insert", method = POST)
	public String getEmpData(@ModelAttribute Employee employee,
			BindingResult errors, ModelMap map, Locale locale) {
		validator.validate(employee, errors);

		if (!errors.hasErrors()) {
			map.addAttribute("message", employee);
			map.addAttribute("employee", new Employee());
		} else {
			map.addAttribute("message",
					messageSource.getMessage("error.msg", null, locale));

		}
		return "Register";
	}

}
