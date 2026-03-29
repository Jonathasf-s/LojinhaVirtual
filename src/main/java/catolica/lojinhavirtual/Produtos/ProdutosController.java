package catolica.lojinhavirtual.Produtos;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutosController {

    private ProdutosService produtosService;

    public ProdutosController(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    // adicionar novo produto
    @PostMapping("/add")
    public ProdutosModel adicionar(@RequestBody ProdutosModel produto) {
        return produtosService.adicionarProduto(produto);
    }

    // Listar todos
    @GetMapping("/listar")
    public List<ProdutosModel> listarTodos() {
        return produtosService.listarProduto();
    }

    //Mostar por Id
    @GetMapping("/Id/{id}")
    public ProdutosModel buscarPorId(@PathVariable Long id) {
        return produtosService.produtosPorID(id);
    }
    @DeleteMapping("/deletar/{id}")
    public void remover(@PathVariable Long id) {
        produtosService.DeletarProduto(id);
    }

}

