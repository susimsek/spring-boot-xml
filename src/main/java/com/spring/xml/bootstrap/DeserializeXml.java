package com.spring.xml.bootstrap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.spring.xml.model.Car;
import com.spring.xml.model.Person;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.nio.file.Paths;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class DeserializeXml implements CommandLineRunner {

    final XmlMapper xmlMapper;
    final JsonMapper jsonMapper;

    @Value("${files.dir}")
    private String filesDir;


    @Override
    public void run(String... args) throws Exception {
        Path path = Paths.get(filesDir + "/car.xml");
        Car car = xmlMapper.readValue(path.toFile(), Car.class);
        System.out.println("Xml File: " + car);

        path = Paths.get(filesDir + "/person.json");
        Person person = jsonMapper.readValue(path.toFile(), Person.class);
        System.out.println("Json File: " + person);
    }
}
