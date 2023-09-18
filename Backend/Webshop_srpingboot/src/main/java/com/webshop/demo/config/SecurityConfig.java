package com.webshop.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity. Reconsider for production!
            .authorizeHttpRequests()
                .requestMatchers("/users", "/users/register", "/users/login", "/registrierung.html", "/login.html", "/index.html").permitAll()  // Allow access to registration and login endpoints
                .requestMatchers("/admin/**").hasRole("ADMIN") // Restrict access to admin endpoints
                .anyRequest().authenticated()         // All other requests need authentication
            .and()
            .formLogin()
                .loginPage("/login.html") // Customize your login page if needed
                .permitAll()
            .and()
            .logout()
                .permitAll();
        return http.build();
    }

}
