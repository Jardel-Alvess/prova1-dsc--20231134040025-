package prova.ifrn.corporativos.servicoveiculo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private Integer anoFabricacao;
    private String tipo;
    private String nomeProprietario;

    public Imovel(){}

    public Imovel (Long id, String placa, String modelo, Integer anoFabricacao, String tipo, String nomeProprietario){
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.tipo = tipo;
        this.nomeProprietario = nomeProprietario;
    }
}
