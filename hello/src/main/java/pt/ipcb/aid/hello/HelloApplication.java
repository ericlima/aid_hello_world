package pt.ipcb.aid.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements ApplicationRunner {

	@Value("${nome.autor}")
	private String autoraplicacao;

	@Value("${nome.applicacao}")
	private String nomeAplicacao;

	@Value("${server.port}")
	private String portaApp;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("###### Ola Mundo desde o Application Runner! #####");
		System.out.println("###### Eu sou a " + nomeAplicacao );
		System.out.println("###### Fui criado pelo autor " + autoraplicacao );
		System.out.println("###### Estou a escutar na porta " + portaApp );
		System.out.println("###### fim da aplicacao runner  " );
	}
}
