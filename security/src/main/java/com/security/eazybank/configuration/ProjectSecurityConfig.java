package com.security.eazybank.configuration;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectSecurityConfig {

/*
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails admin = User.withUsername("admin")
                .password("1234")
                .authorities("admin")
                .build();
        UserDetails user = User.withUsername("user")
                .password("1234")
                .authorities("user")
                .build();

        return new InMemoryUserDetailsManager(admin,user);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }*/
}
