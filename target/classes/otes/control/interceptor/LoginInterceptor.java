package otes.control.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import otes.entity.ActiveUser;
import otes.util.ResourcesUtil;

public  class LoginInterceptor implements HandlerInterceptor{
		@Override
		public boolean preHandle(HttpServletRequest request,HttpServletResponse reponse,Object handler)throws Exception
		{
			String url=request.getRequestURI();
			List<String> open_urls=ResourcesUtil.getKeyList("anonymousURl");
			for (String open_url : open_urls) {
				if (url.indexOf(open_url)>=0) {
					return true;
				}
			}
			
			HttpSession session=request.getSession();
			ActiveUser activeuser=(ActiveUser)session.getAttribute("activeuser");
			if(activeuser!=null){
				return true;
			}
			request.getRequestDispatcher("WEB-INF/jsp/Login.jsp").forward(request, reponse);
			
			return false;
		}
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
				throws Exception {
			System.out.println("HandlerInterceptor2...postHandle");
		}

		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception modelAndView)
				throws Exception {
			System.out.println("HandlerInterceptor2...afterCompletion");
		}
}
