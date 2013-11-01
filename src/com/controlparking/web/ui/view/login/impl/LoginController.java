package com.controlparking.web.ui.view.login.impl;

import com.controlparking.web.ui.view.login.ILoginView;
import com.controlparking.web.ui.view.login.ILoginViewHandler;

public class LoginController implements ILoginViewHandler {

	private ILoginView view;
	
	public LoginController(ILoginView view){
		this.view = view;
	}
	
	@Override
	public void Login() {
		if (true){ 
			view.afterSuccessfulLogin();
		}
	}

}
