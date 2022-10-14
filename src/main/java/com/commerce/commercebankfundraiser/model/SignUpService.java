package com.commerce.commercebankfundraiser.model;


import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SignUpService implements UserDetailsService {
    private final static String USER_NOT_FOUND_MSG = "user with email %s not found";
    private final SignUpRepositary signUpRepositary;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return signUpRepositary.findByEmail(email).orElseThrow(() ->
                new UsernameNotFoundException(
                        String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(SignUp signup){
        boolean userExist = signUpRepositary.findByEmail(signup.getEmail()).isPresent();
        if (userExist){
            throw new IllegalStateException ("Email already exist");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(signup.getPassword());
        signup.setPassword(encodedPassword);
        signUpRepositary.save(signup);

        return "User is registered";
    }
}
