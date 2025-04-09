package dominio;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nomes")
    private String nome;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cliente")
    private List<Venda> vendas;

    public Cliente(){
        this("");
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public void setId(Long Id){
        this.Id = Id;
    }

    public Long getId(){
        return this.Id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVendas(List<Venda> vendas){
        this.vendas = vendas;
    }

    public List<Venda> getVendas(){
        return this.vendas;
    }

    @Override
    public String toString(){
        return "cliente[nome=" + nome + "]";
    }
}
