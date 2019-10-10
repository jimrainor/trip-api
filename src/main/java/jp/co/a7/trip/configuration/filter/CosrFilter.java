package jp.co.a7.trip.configuration.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.core.Ordered;
import org.springframework.web.filter.OncePerRequestFilter;

public class CosrFilter extends OncePerRequestFilter implements Ordered {

  private int order = FilterRegistrationBean.HIGHEST_PRECEDENCE - 200;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain chain) throws ServletException, IOException {

    response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
    response.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE");
    response.setHeader("Access-Control-Allow-Headers", "content-type,x-auth-token");
    response.setHeader("Access-Control-Expose-Headers", "x-auth-token,Content-Disposition");
    response.setHeader("Access-Control-Allow-Credentials", "true");

    chain.doFilter(request, response);
  }

  @Override
  public int getOrder() {
    return order;
  }
}
