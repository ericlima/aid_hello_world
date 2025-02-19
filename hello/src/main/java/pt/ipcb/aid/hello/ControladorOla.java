package pt.ipcb.aid.hello;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
//URI Base: http://localhost:8080
public class ControladorOla {

    @Autowired
    @Qualifier("nome.app")
    private String nomeaplicacao;

    //Http GET /ola?nome=Alexandre%20Fonte
    @GetMapping(value = "/ola")
    public String olamundo(@RequestParam(value =
            "nome",defaultValue = "Mundo!") String nome){
        return "Olá " + nome + " da app "+nomeaplicacao;
    }

    //URI correspondente: http://localhost:8080/getconta?id=1
    @GetMapping(value = "/getconta")

    public Conta getContabyId(@RequestParam("id") long id) {
        return new Conta(id,"Eric Lima","Castelo Branco",123456789,1234,100000.0, LocalDateTime.now());
    }
}