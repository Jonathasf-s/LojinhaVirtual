package catolica.lojinhavirtual.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutosModel,Long> {

    List<ProdutosModel> findByProdutosNomeContainingIgnoreCase(String nome);
}
