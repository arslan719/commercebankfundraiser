package com.commerce.commercebankfundraiser.service;



import com.commerce.commercebankfundraiser.exception.UserNotFoundException;
import com.commerce.commercebankfundraiser.model.Login;
import com.commerce.commercebankfundraiser.repo.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private final LoginRepo loginRepo;

    @Autowired
}
