package catolica.lojinhavirtual.Cliente;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    // criar novo cliente
    public ClienteModel criarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }


    // listar todos os clientes
    public List<ClienteModel>listarClientes(){
        return clienteRepository.findAll();
    }


    // listar clientes por ID
    public ClienteModel listarClientesPorId(Long id){
        Optional<ClienteModel> ClientePotId= clienteRepository.findById(id);
        return ClientePotId.orElse(null);
    }


    // deletar cliente
    public void deletarCliente(Long id){
        clienteRepository.deleteById(id);
    }

    //procurar clietne por CPF
    public ClienteModel ProcurarCPF(String cpf){
        return clienteRepository.findByCpf(cpf).orElse(null);
    }
}
