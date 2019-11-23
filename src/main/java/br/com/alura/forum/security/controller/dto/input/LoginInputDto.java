package br.com.alura.forum.security.controller.dto.input;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginInputDto {
	private String email;
	
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	public UsernamePasswordAuthenticationToken build() {
		return new UsernamePasswordAuthenticationToken(this.email, this.password);
	}

}
