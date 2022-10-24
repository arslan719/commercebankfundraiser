package com.commerce.commercebankfundraiser.model;


import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SignUpService implements UserDetailsService {
    private final static String USER_NOT_FOUND_MSG = "user with email is not found";

    private final SignUpRepository signUpRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return signUpRepository.findByEmail(email).orElseThrow(() ->
                new UsernameNotFoundException(
                        String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(SignUp signup){
        boolean userExist = signUpRepository.findByEmail(signup.getEmail()).isPresent();
        if (userExist){
            throw new IllegalStateException ("Email already exist, Please sign in");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(signup.getPassword());
        signup.setPassword(encodedPassword);
        signUpRepository.save(signup);

        return "User is registered";
    }
}
