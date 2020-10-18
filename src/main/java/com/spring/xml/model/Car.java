package com.spring.xml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@JacksonXmlRootElement(localName = "Car")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {

    @JacksonXmlProperty(localName = "color")
    String color;

    @JacksonXmlProperty(localName = "type")
    String type;

}
