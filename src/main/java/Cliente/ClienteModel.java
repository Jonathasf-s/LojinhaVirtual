package Cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor  // gera um construtor No Args
@AllArgsConstructor  // gera todos os costrutuores independentes de novos atributos adicionados
@Data  // gera todos os getter and setters

public class ClienteModel {




   private Long Id; // Vai ser o Id do banco de dados


   private String nome;
   private int idade;
   private String cpf;


}
