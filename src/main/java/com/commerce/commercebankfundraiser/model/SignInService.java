package com.commerce.commercebankfundraiser.model;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SignInService implements UserDetailsService  {
    private final static String USER_NOT_FOUND_MSG = "user with email is not found";

    private final SignInRepository signInRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return signInRepository.findByEmail(email).orElseThrow(() ->
                new UsernameNotFoundException(
                        String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(SignIn signin){
        boolean userExist = signInRepository.findByEmail(signin.getEmail()).isPresent();
        if (userExist){
            throw new IllegalStateException ("Email already exist, Please sign in");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(signin.getPassword());
        signin.setPassword(encodedPassword);

        return "User is signed in";
    }

}
