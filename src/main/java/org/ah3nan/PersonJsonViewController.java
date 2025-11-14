package org.ah3nan;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.Path;
import io.avaje.jsonb.Jsonb;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;

@Controller
@Path("/persons-view")
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class PersonJsonViewController {
    private final Jsonb jsonb;
    @Get("/")
    public String get() {
        var personType = jsonb.type(Person.class);
        var personView = personType.view("(name)");
        var person = new Person();
        person.setName("Peter");
        person.setEmail("peter@gmail.com");
        person.setPhone("123456789");
        return personView.toJson(person);
    }
}
