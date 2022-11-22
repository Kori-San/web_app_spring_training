package fr.lernejo.todo;

import java.io.IOException;
import java.util.UUID;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class ApplicationIdentifierFilter implements Filter {

    private final String uuid = UUID.randomUUID().toString();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        if (response instanceof HttpServletResponse httpServletResponse) {
            httpServletResponse.setHeader("Instance-Id", uuid);
        }
        chain.doFilter(request, response);
    }
    
}
