package com.anonymity.goodsmanagement.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author anonymity
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object userSn = session.getAttribute("userSn");
        if (userSn == null) {
            response.setStatus(HttpServletResponse.SC_REQUEST_TIMEOUT);
        }
        return userSn != null;
    }

}
