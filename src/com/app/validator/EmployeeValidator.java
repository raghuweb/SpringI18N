package com.app.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return Employee.class.equals(arg0);
	}

	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "empId", "error.empId");
		ValidationUtils.rejectIfEmpty(errors, "empName", "error.empName");
		ValidationUtils.rejectIfEmpty(errors, "empSal", "error.empSal");
	}

}
