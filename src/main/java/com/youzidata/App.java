package com.youzidata;

import com.youzidata.filter.CorsFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {


/*    @Bean
    @Profile({"dev", "dev-local"})
    public FilterRegistrationBean corsFilterReistration() {
        CorsFilter corsFilter = new CorsFilter();
        FilterRegistrationBean registration = new FilterRegistrationBean();

        registration.setFilter(corsFilter);
        registration.addUrlPatterns("/api/*");

        return registration;
    }*/

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
