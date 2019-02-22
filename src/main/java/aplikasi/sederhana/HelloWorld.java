package aplikasi.sederhana;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Singleton;

@Controller("/hello")
public class HelloWorld {
    @Get("/{nama}")
    @Produces(MediaType.TEXT_PLAIN)
    public String index(String nama){
        return "Hello World "+nama;
    }
}
