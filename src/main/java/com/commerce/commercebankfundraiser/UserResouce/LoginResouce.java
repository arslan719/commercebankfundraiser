package com.commerce.commercebankfundraiser.UserResouce;

import com.commerce.commercebankfundraiser.model.Login;
import com.commerce.commercebankfundraiser.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginResouce {

    @Autowired
    private final LoginService loginService;

}
