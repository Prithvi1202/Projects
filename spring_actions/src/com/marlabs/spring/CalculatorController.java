package com.marlabs.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CalculatorController extends MultiActionController{
	public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Integer numberA = Integer.parseInt(request.getParameter("numberA").toString());
        Integer numberB = Integer.parseInt(request.getParameter("numberB").toString());
        Integer result = numberA + numberB;
        return new ModelAndView("calculator", "result", result.toString());
	}
	
	public ModelAndView subtract(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Integer numberA = Integer.parseInt(request.getParameter("numberA").toString());
        Integer numberB = Integer.parseInt(request.getParameter("numberB").toString());
        Integer result = numberA - numberB;
        return new ModelAndView("calculator", "result", result.toString());
	}
	
	public ModelAndView multiply(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Integer numberA = Integer.parseInt(request.getParameter("numberA").toString());
        Integer numberB = Integer.parseInt(request.getParameter("numberB").toString());
        Integer result = numberA * numberB;
        return new ModelAndView("calculator", "result", result.toString());
	}
	
	public ModelAndView divide(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Integer numberA = Integer.parseInt(request.getParameter("numberA").toString());
        Integer numberB = Integer.parseInt(request.getParameter("numberB").toString());
        Integer result = numberA / numberB;
        return new ModelAndView("calculator", "result", result.toString());
	}
	
}
