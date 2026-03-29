package catolica.lojinhavirtual.Cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")

public class ClienteController {

private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //Adicionar cliente
    @PostMapping("/add")
    public ClienteModel NovoUsuario( @RequestBody ClienteModel cliente){
        return clienteService.criarCliente(cliente);
    }

    //Listar Clientes
    @GetMapping("/listar")
    public List<ClienteModel>MostrarTodosClientes(){
        return clienteService.listarClientes();
    }

    //listar cliente por ID
    @GetMapping("/Id/{id}")
    public ClienteModel mostrarClientesId(@PathVariable Long id){return clienteService.listarClientesPorId(id);}

    //deletar cliente
    @DeleteMapping("/delete/{id}")
    public String deletarCliente(@PathVariable Long id){
        return "Cliente com ID" + id + "deletado";
    }


    //Procurar cliente por CPF
    @GetMapping("/cpf/{cpf}")
    public ClienteModel buscarCPF(@PathVariable String cpf){
        return clienteService.ProcurarCPF(cpf);
    }


}
