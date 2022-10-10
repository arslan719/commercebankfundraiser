package com.commerce.commercebankfundraiser.registraion;

import com.commerce.commercebankfundraiser.model.SignUp;
import com.commerce.commercebankfundraiser.model.SignUpRole;
import com.commerce.commercebankfundraiser.model.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final SignUpService signUpService;

    private EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail =  emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("Email not valid");
        }
        return signUpService.signUpUser(
                new SignUp(
                        request.getFirstName(),
                        request.getLastName(),
                         request.getEmail(),
                        request.getPassword(),
                        SignUpRole.User
                )
        );
    }
}
