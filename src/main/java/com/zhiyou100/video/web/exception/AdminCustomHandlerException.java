package com.zhiyou100.video.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class AdminCustomHandlerException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception ex) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ex", ex);
		mav.addObject("obj", obj);
		mav.setViewName("forward:/WEB-INF/view/admin/errHTML.jsp");
		return mav;
	}

}
