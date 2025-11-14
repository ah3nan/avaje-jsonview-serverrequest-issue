package com.digitalmerce.app;

import io.avaje.jsonb.Json;
import lombok.Getter;
import lombok.Setter;

@Json
@Getter
@Setter
public class Person {

    private String name;
    private String email;
    private String phone;

}