package com.any.Any.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(/* HttpMethod.POST,*/"/reg","/regtwo","/authPage","/regthree","/admin").permitAll()
                .antMatchers("/images/**").permitAll()
                .antMatchers("/index.css").permitAll()
                .antMatchers("/Login.css").permitAll()
                .antMatchers("/nicepage.css").permitAll()
                .antMatchers("/Post-Template.css").permitAll()
                .antMatchers("/Registration.css").permitAll()
                .antMatchers("/Registration2.css").permitAll()
                .antMatchers("/Registration3.css").permitAll()
                .antMatchers("/adminPage.css").permitAll()

                .antMatchers("/jquery.js").permitAll()
                .antMatchers("/nicepage.js").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/authPage")
                .permitAll()
                .and()
                .logout()
                .permitAll()
        ;
    }
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("u")
                        .password("p")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}
