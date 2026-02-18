package ComprasOnline.projeto.Model;

public class Produto {

    String nomeProduto;
    String categoriaProduto;
    double precoProduto;

    public Produto(String nomeProduto, String categoriaProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.categoriaProduto = categoriaProduto;
        this.precoProduto = precoProduto;
    }

    public Produto() {

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
