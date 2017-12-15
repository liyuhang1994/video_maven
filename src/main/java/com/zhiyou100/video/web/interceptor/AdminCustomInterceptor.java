package com.zhiyou100.video.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminCustomInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 后台拦截
		if (request.getServletPath().indexOf("admin") != -1) {
			if (request.getSession().getAttribute("LOGIN") != null) {
				return true;
			} else {
				request.getRequestDispatcher("/WEB-INF/view/admin/login.jsp").forward(request, response);
				return false;
			}
		} else {
			if (request.getSession().getAttribute("_front_user") != null) {
				return true;
			} else {
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				return false;
			}
		}
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
