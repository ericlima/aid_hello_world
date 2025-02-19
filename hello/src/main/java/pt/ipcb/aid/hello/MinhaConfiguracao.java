package pt.ipcb.aid.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguracao {
    @Bean(name = "nome.app")
    public String getNomeAplicacao(){
        return "App Spring Boot Olá Mundo!";
    }
}