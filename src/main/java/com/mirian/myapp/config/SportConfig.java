package com.mirian.myapp.config;

import com.mirian.myapp.dependencyinjection.Coach;
import com.mirian.myapp.dependencyinjection.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("SwimCoach")
    public Coach swimCoach() {
      return new SwimCoach();
    };


}
