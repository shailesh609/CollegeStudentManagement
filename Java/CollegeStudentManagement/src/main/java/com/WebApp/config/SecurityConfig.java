package com.WebApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;*/

//@Configuration
// @EnableWebSecurity  extends  WebSecurityConfigurerAdapter
public class SecurityConfig {

	/*
	 * 
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder
	 * authenticationMgr) throws Exception {
	 * authenticationMgr.inMemoryAuthentication()
	 * .withUser("Shailesh").password(this.passwordEncoder().encode("shailesh@123"))
	 * .authorities("ROLE_USER") .and()
	 * .withUser("admin").password(this.passwordEncoder().encode("admin@123")).
	 * authorities("ROLE_ADMIN"); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * 
	 * http. csrf().disable() .authorizeRequests()
	 * .antMatchers("/stud/**").access("hasRole('ROLE_USER')")
	 * .antMatchers("/view","/college","/student").access("hasRole('ROLE_ADMIN')")
	 * .antMatchers("/login","/css/style.css").permitAll()
	 * .anyRequest().authenticated() .and() .formLogin().loginPage("/login")
	 * .defaultSuccessUrl("/home") .failureUrl("/error")
	 * .usernameParameter("username").passwordParameter("password") .and()
	 * .logout().invalidateHttpSession(true) .clearAuthentication(true)
	 * .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	 * .logoutSuccessUrl("/home");
	 * 
	 * }
	 * 
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(10); }
	 * 
	 */
	
}
