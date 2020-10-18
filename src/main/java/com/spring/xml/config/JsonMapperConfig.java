package com.spring.xml.config;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JsonMapperConfig {

    @Bean
    @Primary
    public JsonMapper jsonMapper(){
        return new JsonMapper();
    }
}
