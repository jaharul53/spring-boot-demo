package com.johurulislam.springbootdemo.configuration;
import com.johurulislam.springbootdemo.model.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Computer hpProBook(){
        return new Computer("Hp", "Vivo-Book", 8, 500,3.5f);
    }
    @Bean
    public Computer asusVivoBook(){
        return new Computer("Hp", "Vivo-Book", 8, 500,3.5f);
    }
}
