package prova.ifrn.corporativos.servicoveiculo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private Integer anoFabricacao;
    private String tipo;
    private String nomeProprietario;

    public Veiculo(){}

    public Veiculo (Long id, String placa, String modelo, Integer anoFabricacao, String tipo, String nomeProprietario){
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.tipo = tipo;
        this.nomeProprietario = nomeProprietario;
    }
}
