package sid.org.clientservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sid.org.clientservice.Entity.Client;
import sid.org.clientservice.Repositorys.ClientRepostorys;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepostorys c){
        return args -> {
            Client cl=new Client(null,"123456","Glsid","glsid@glsid.com");
            Client cl2=new Client(null,"132456789","Glsid1","tes@gmail.com");
            c.save(cl);
            c.save(cl2);
        };
    }
}
