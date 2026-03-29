package catolica.lojinhavirtual.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente")

public class ClienteController {

private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/novoUser")
    public String NovoUsuario(){return "crie um novo usuario";}

    @GetMapping("/mostrarClientes")
    public List<ClienteModel>MostrarTodosClientes(){
        return clienteService.listarClientes();
    }
}
