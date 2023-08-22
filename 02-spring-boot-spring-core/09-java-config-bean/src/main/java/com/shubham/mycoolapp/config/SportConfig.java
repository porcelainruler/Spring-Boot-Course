package com.shubham.mycoolapp.config;

import com.shubham.mycoolapp.common.Coach;
import com.shubham.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
