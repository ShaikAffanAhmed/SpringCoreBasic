package com.app.affan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {

	@Autowired
	private Token token;

	public Token getToken() {
		token = getMyToken();
		return token;
	}

	@Lookup
	public Token getMyToken()
	{
		//...
		return null;
	}
	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}

	
}
