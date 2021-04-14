package com.home.UserInterceptorWithSpringRestAPI.interceptors;

import com.home.UserInterceptorWithSpringRestAPI.controller.Demo1RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log2Interceptor extends HandlerInterceptorAdapter {
    Logger logger= LoggerFactory.getLogger(Log2Interceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      logger.info(" Log2Interceptor - > preHandle");
        logger.info("URL - {} "+request.getRequestURL().toString());
      SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy");
        logger.info("date- {} "+simpleDateFormat.format(new Date()));
      return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info(" Log2Interceptor - > postHandle");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(" Log2Interceptor - > afterCompletion");
        System.out.println(" ============================================");
    }
}
