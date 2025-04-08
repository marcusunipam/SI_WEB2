@Entity
public class Produto {
    
    @Id
    private Long Id;
    private String nome;
    private double preco;
    private List<Venda> vendas;

    public Produto(){
        this("",0);
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
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

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setVenda(List<Venda> vendas){
        this.vendas = vendas;
    }

    public List<Venda> getVenda(){
        return this.vendas;
    }

    @Override
    public String toString(){
        return "Produto[nome=" + nome +
        ", preco=" + preco +
        "]";
    }
}