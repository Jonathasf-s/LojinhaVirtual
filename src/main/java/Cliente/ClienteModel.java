package Cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor  // gera um construtor No Args
@AllArgsConstructor  // gera todos os costrutuores independentes de novos atributos adicionados
@Data  // gera todos os getter and setters
@Entity
@Table(name = "TB_Cliente")
public class ClienteModel {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
   private Long ClienteId; // Vai ser o Id do banco de dados

   private String nome;
   private String cpf;


}
