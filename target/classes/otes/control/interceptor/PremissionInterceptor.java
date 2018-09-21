package otes.control.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import otes.entity.ActiveUser;
import otes.entity.premission;
import otes.util.ResourcesUtil;

public class PremissionInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse reponse, Object handler)
			throws Exception {
		String url = request.getRequestURI();

		List<String> open_urls = ResourcesUtil.getKeyList("anonymousURL");
		for (String open_url : open_urls) {
			if (url.indexOf(open_url) >= 0) {
				// 如果是公开地址 则放行
				return true;
			}
		}
		//从配置文件中获取公用访问url
				List<String> common_urls = ResourcesUtil.getKeyList("commonURL");
				//遍历公用地址 如果是公开地址则放行
				for (String common_url : common_urls) {
					if (url.indexOf(common_url)>0) {
						//如果是公开，则放行
						return true;
					}
				}
				//判断用户身份在Session中是否存在
				HttpSession session = request.getSession();
				ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
				//从Session中取出权限范围的URL
				List<premission> premissions = activeUser.getPremission();
				for (premission Premission : premissions) {
					//权限url
					String permission_url = Premission.getUrl();
					if (url.indexOf(permission_url)>0) {
						return true;
					}
				}
				//执行到这里拦截，跳转到无权访问的提示页面
				request.getRequestDispatcher("/WEB-INF/jsp/****.jsp").forward(request, reponse);
				
				//如果返回false表示拦截器不继续执行handler，如果返回true表示放行
				return false;
	}
	//在执行handler返回modelAndView之前执行
		//如果需要向页面提供一些公用的数据或配置一些视图信息，使用此方法实现 从modelAndView入手
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
				throws Exception {
			System.out.println("HandlerInterceptor2...postHandle");
		}

		//执行handler之后执行此方法
		//作为系统统一异常处理，进行方法执行性能监控，在preHandler中设置一个时间点 在afterCompletion设置一个时间点 二者时间差就是执行时长
		//实现系统，统一日志记录
		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception modelAndView)
				throws Exception {
			System.out.println("HandlerInterceptor2...afterCompletion");
		}
}
