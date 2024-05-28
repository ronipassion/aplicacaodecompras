package br.com.alura.principal;

import br.com.alura.modelos.Compra;
import br.com.alura.modelos.Conta;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        var conta = new Conta();
        List<Compra> listaCompra = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o limite do crédito?");
        var resposta = leitura.nextDouble();
        conta.setLimite(resposta);
        conta.setSaldo(conta.getLimite());


        var escolha = 1;
        while (escolha != 0) {

            var compra = new Compra();

            System.out.println("Digite a descrição do produto");
            var descricaoResposta = leitura.next();
            compra.setDescricao(descricaoResposta);

            System.out.println("Digite o valor do produto");
            var valorResposta = leitura.nextDouble();
            compra.setPreco(valorResposta);

            if (conta.getSaldo() < compra.getPreco()) {
                System.out.println("Saldo insuficiente!");
                System.out.println("Finalizando a aplicação!! \n **************************************** \n Compras: \n");
                listaCompra.sort(Comparator.comparing(Compra::getPreco));
                System.out.println(listaCompra);
                System.out.println("Saldo disponível: R$" + conta.getSaldo());
                break;
            } else {
                conta.incluiCompra(valorResposta);
            }

            listaCompra.add(compra);

            System.out.println("Escolha entre as opções: 1 | Continuar ou 0 | Sair");
            escolha = leitura.nextInt();
            if (escolha != 1 && escolha != 0) {
                System.out.println("Opção inválida!");
                System.out.println("Escolha entre as opções: 1 | Continuar ou 0 | Sair");
                escolha = leitura.nextInt();
            } else if (escolha == 0) {
                System.out.println("Finalizando a aplicação!! \n **************************************** \n Compras: \n");
                listaCompra.sort(Comparator.comparing(Compra::getPreco));
                System.out.println(listaCompra);
                System.out.println("Saldo disponível: R$" + conta.getSaldo());
            }
        }
    }
}