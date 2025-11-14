open module avaje.jsonview.serverrequest.issue {
    requires io.avaje.http.api;
    requires io.avaje.inject;
    requires io.avaje.json;
    requires io.avaje.jsonb;
    requires io.helidon.common.media.type;
    requires io.helidon.common.parameters;
    requires io.helidon.http;
    requires io.helidon.webserver;
    requires jakarta.inject;
    requires static lombok;
    provides io.avaje.inject.spi.InjectExtension with org.ah3nan.Ah3nanModule;
    provides io.avaje.jsonb.spi.JsonbExtension with org.ah3nan.jsonb.GeneratedJsonComponent;
}