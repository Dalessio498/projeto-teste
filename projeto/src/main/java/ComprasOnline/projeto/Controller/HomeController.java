package ComprasOnline.projeto.Controller;
import ComprasOnline.projeto.Model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    List<Produto> produtos = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @PostMapping("/cadastro")
    public String EnviarFormulario(@RequestParam String nomeProduto,
                                   @RequestParam String categoriaProduto, @RequestParam double precoProduto, Model model) {

        Produto produto = new Produto();
        produto.setNomeProduto(nomeProduto);
        produto.setCategoriaProduto(categoriaProduto);
        produto.setPrecoProduto(precoProduto);

        // 2️⃣ Adicionar na lista temporária
        produtos.add(produto);

        // 3️⃣ Enviar lista e o último produto para a view
        model.addAttribute("produtos", produtos);
        model.addAttribute("nomeProduto", nomeProduto);
        model.addAttribute("categoriaProduto", categoriaProduto);
        model.addAttribute("precoProduto", precoProduto);

        return "sucesso";
    }
}