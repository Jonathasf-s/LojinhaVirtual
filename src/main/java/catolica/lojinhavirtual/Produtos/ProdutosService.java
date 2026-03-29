package catolica.lojinhavirtual.Produtos;

import catolica.lojinhavirtual.Cliente.ClienteModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {
    private ProdutosRepository produtosRepository;

    public ProdutosService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }


    // listar todos os produtos
    public List<ProdutosModel>listarProduto(){return produtosRepository.findAll();}

    //listar produtos por ID
    public ProdutosModel produtosPorID(Long id){
        Optional<ProdutosModel> ProdutosporID = produtosRepository.findById(id);
        return ProdutosporID.orElse(null);
    }

    // adicionar um produto
    public ProdutosModel adicionarProduto(ProdutosModel produto){
        return produtosRepository.save(produto);
    }

    // deletar produto
    public void DeletarProduto(Long id){
        produtosRepository.deleteById(id);
    }

    // buscar por nome
    public List<ProdutosModel> procurarNome(String nome){
        return produtosRepository.findByProdutosNomeContainingIgnoreCase(nome);
    }
}
