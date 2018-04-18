package controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {





    //在执行handler之前来执行的
    //用于用户认证校验、用户权限校验
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        String url = request.getRequestURI();

        //判断是否是公开地址
        //实际开发中需要将公开地址配置在配置文件中

        if (url.indexOf("login.action")>=0)
        {
            //如果是公开地址则放行
            return true;
        }

        //判断用户身份在session中是否存在
        HttpSession session=request.getSession();
        String usercode= (String) session.getAttribute("usercode");

        //如果用户身份在session中存在则放行
        if (usercode!=null)
        {
            return true;
        }

        //执行到这里就拦截，跳转到登陆页面，用户进行登陆
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }

}
