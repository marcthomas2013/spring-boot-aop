package com.marcthomas;

import org.springframework.stereotype.Service;

/**
 * Created by marc.thomas on 03/09/2015.
 */
@Service
public class MyService {
    public String doSomething() {
        return "Doing something";
    }

    public String callDoSomethingInternally() {
        return doSomething();
    }
}
