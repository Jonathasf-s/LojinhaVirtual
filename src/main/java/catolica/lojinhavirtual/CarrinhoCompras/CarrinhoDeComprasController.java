package catolica.lojinhavirtual.CarrinhoCompras;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedidos")

public class CarrinhoDeComprasController {

    private CarrinhoDeComprasService carrinhoDeComprasService;

    public CarrinhoDeComprasController(CarrinhoDeComprasService carrinhoDeComprasService) {
        this.carrinhoDeComprasService = carrinhoDeComprasService;
    }

    // Finalizar compra
    @PostMapping("/finalizar")
    public CarrinhoDeComprasModel finalizar(@RequestBody CarrinhoDeComprasModel carrinho){
        //vai resceber o Json
        //Singleton processa o pagamnto e o Repository salva no H2
        return carrinhoDeComprasService.finalizarCompra(carrinho);
    }

    //Listar pedidos
    @GetMapping("/listar")
    public List<CarrinhoDeComprasModel>listarPedidos(){
        return carrinhoDeComprasService.listarTudo();
    }

    //Listar pedido por id
    @GetMapping("/listar/{id}")
    public CarrinhoDeComprasModel procurarId(@PathVariable Long id){
        return carrinhoDeComprasService.buscarId(id);
    }
}
