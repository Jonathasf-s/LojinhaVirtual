package catolica.lojinhavirtual.Cliente;

import java.util.List;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    // criar novo cliente



    // listar todos os clientes
    public List<ClienteModel>listarClientes(){
        return clienteRepository.findAll();
    }


    // listar clientes por ID
}
