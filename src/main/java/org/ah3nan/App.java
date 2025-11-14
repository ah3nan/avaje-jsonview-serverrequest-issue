package org.ah3nan;

import io.avaje.inject.BeanScope;
import io.avaje.jsonb.Jsonb;
import io.helidon.webserver.WebServer;
import io.helidon.webserver.http.HttpFeature;
import io.helidon.webserver.http.HttpRouting;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final var scope = BeanScope.builder().beans(Jsonb.builder().build()).build();
        final List<HttpFeature> list = scope.list(HttpFeature.class);
        final var builder = HttpRouting.builder();
        list.forEach(builder::addFeature);

        WebServer.builder().addRouting(builder).port(8081).build().start();

        System.out.println("started");
    }
}
