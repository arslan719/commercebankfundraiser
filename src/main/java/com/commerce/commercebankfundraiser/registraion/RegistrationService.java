package com.commerce.commercebankfundraiser.registraion;

import com.commerce.commercebankfundraiser.model.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final SignUpService signUpService;
    private final SignInService signInService;

    private EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail =  emailValidator.test(request.getEmail());
        boolean emailExist = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("Email not valid");
        }
        if (emailExist){
            return signInService.signUpUser(
                    new SignIn(
                            request.getEmail(),
                            request.getPassword()
                    )
            );
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
