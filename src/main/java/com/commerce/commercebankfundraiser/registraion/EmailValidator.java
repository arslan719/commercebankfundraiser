package com.commerce.commercebankfundraiser.registraion;

import com.sun.xml.bind.v2.TODO;
import org.hibernate.annotations.Check;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {

        return true;
    }
}
