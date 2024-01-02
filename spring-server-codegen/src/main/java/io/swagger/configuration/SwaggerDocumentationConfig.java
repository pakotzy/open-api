package io.swagger.configuration;

import io.swagger.v3.oas.models.info.Contact;
import jakarta.annotation.Generated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Gym")
                .description("A set of workout centric endpoints")
                .termsOfService("")
                .version("0.0.1")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new Contact()
                    .email("")));
    }

}
