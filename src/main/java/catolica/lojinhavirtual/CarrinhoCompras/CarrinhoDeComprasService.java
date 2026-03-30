package catolica.lojinhavirtual.CarrinhoCompras;

import catolica.lojinhavirtual.Produtos.ProdutosModel;
import catolica.lojinhavirtual.Produtos.ProdutosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoDeComprasService {

    private CarrinhoDeComprasRepository carrinhoDeComprasRepository;

   private ProdutosRepository produtosRepository;

    public CarrinhoDeComprasService(ProdutosRepository produtosRepository, CarrinhoDeComprasRepository carrinhoDeComprasRepository) {
        this.produtosRepository = produtosRepository;
        this.carrinhoDeComprasRepository = carrinhoDeComprasRepository;
    }

    // Salvar no carrinho
    public CarrinhoDeComprasModel finalizarCompra(CarrinhoDeComprasModel carrinho){
        return carrinhoDeComprasRepository.save(carrinho);
    }

    //Soma dos produtos
    public double calcularTotal(Long carrinhoId){
        CarrinhoDeComprasModel carrinho = carrinhoDeComprasRepository.findById(carrinhoId).orElse(null);
        if (carrinho != null && carrinho.getProdutos() !=null){
            return carrinho.getProdutos().stream()
                    .mapToDouble(ProdutosModel::getProdutosValor)
                    .sum();
        }
        return 0.0;
    }

    //Listar os o conteudo do carrinho
    public List<CarrinhoDeComprasModel> listarTudo(){
        return carrinhoDeComprasRepository.findAll();
    }

    // Buscar por ID
    public CarrinhoDeComprasModel buscarId(Long id){
        return carrinhoDeComprasRepository.findById(id).orElse(null);
    }

}
