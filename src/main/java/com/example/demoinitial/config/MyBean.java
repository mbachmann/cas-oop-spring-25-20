package com.example.demoinitial.config;

import com.example.demoinitial.domain.Person;
import com.example.demoinitial.utils.HasLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements CommandLineRunner, HasLogger {

    MyComponent myComponent;

    Person felixMuster;
    Person maxMustermann;

    @Autowired
    public MyBean(MyComponent myComponent, Person maxMustermann, Person felixMuster) {
        this.maxMustermann = maxMustermann;
        this.felixMuster = felixMuster;
        this.myComponent = myComponent;
    }

    @Override
    public void run(String... args) throws Exception {
        myComponent.hello();
        getLogger().info(myComponent.getTestValue());
        getLogger().debug("Felix Muster Test {} ", felixMuster.toString());
        getLogger().debug("Max Mustermann Test " + maxMustermann.toString());
        getLogger().info("CommandLineRunner started");
    }
}
