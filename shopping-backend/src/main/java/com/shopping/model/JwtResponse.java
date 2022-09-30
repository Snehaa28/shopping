package com.shopping.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@NoArgsConstructor
@Builder
public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -8091879091924046844L;
	private String jwttoken;
	private String userName;

	public JwtResponse(String jwttoken, String username) {
		this.jwttoken = jwttoken;
		this.userName = username;
	}
}