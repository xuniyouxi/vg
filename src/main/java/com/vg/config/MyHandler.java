package com.vg.config;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.vg.config.Encrypt.JWTUtil;
import com.vg.config.MyAnn.Authorization;

@Configuration
public class MyHandler implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (!(handler instanceof HandlerMethod)) {
			System.out.println("可能请求了静态资源，放过");
			return true;
		}

		else {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			Method method = handlerMethod.getMethod();
			System.out.println("用户：" + request.getSession().getId() + "请求了：" + method);
			String token = request.getHeader("token");
			if (token != null && method.isAnnotationPresent(Authorization.class)) {
				Authorization useraut = method.getAnnotation(Authorization.class);
				try {
					int user_role = Integer
							.parseInt(JWTUtil.parseJWT(request.getHeader("token")).toString().substring(10, 11));
					if (user_role == 1 && useraut.authorization().equals("user")) {
						System.out.println("访问了user接口，且权限对的上");
						return true;
					} else if (user_role == 2 && useraut.authorization().equals("admin")) {
						System.out.println("访问了admin接口，且权限对的上");
						return true;
					}

					else {
						System.out.println("访问的接口和权限对不上");
						return false;
					}
				} catch (Exception e) {
					System.out.println("假冒token");
					return false;
				}

			} else if (token == null && method.isAnnotationPresent(Authorization.class)) {
				Authorization useraut = method.getAnnotation(Authorization.class);
				if (useraut.authorization().equals("open")) {
					System.out.println("请求了公开接口");
					return true;
				}
				else
					System.out.println("没token还想请求私有接口");
					return false;
			}
			
			return false;

		}

	}

}