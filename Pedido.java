import java.util.ArrayList;
import java.util.Scanner;

enum Categoria{
    Alimento,
    Eletronico,
    Outros
}
class ItemPedido{
    String descricao;
    int quantidade;
    Categoria categoria;
    ItemPedido(String descricao, int quantidade, Categoria categoria){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
}
public class Pedido{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        ArrayList<ItemPedido> pedido = new ArrayList<>();
        while(true){
            System.out.print("Informe a descrição do item: ");
            String descricao = leia.nextLine();
            if(descricao.isEmpty()){
                break;
            }
            System.out.print("Informe a quantidade do item: ");
            int quantidade = leia.nextInt();
            leia.nextLine();
            System.out.print("Selecione a categoria(1 - alimento, 2 - eletrônico ou 3 - outros): ");
            int opcao = leia.nextInt();
            leia.nextLine();
            Categoria categoria;
            if(opcao == 1){
                categoria = Categoria.Alimento;
            }else if(opcao == 2){
                categoria = Categoria.Eletronico;
            }else{
                categoria = Categoria.Outros;
            }
            ItemPedido item = new ItemPedido(descricao, quantidade, categoria);
            pedido.add(item);
        }
        System.out.println(" ");
        System.out.println("Lista de itens do pedido:");
        System.out.println(" ");
        for(ItemPedido item : pedido){
            System.out.println(item.categoria + " " + item.descricao + " " + item.quantidade);
        }        
    }
}
 
