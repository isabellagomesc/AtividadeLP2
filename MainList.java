/*
  Isabella Gomes Cardoso (SP3044165)
  Isabelle Pimenta Santos (SP3044181)
  Jessica Vitória Tavares (SP3044246)
  Júlia Furquim de Jesus (SP304419X)
  Lucas Leandro da Silva Paula (SP3093808) 
  Luis Henrique Gomes Cardoso (SP3044173)
*/

import java.util.*;

public class MainList {
    public static void main(String[] args) throws Exception {
      
      Lista<String> lista = new Lista<String>();

        Map<Integer, String> p = new HashMap<>();

        lista.adicionar("AW1");
        lista.adicionar("Lp2");
        lista.adicionar("Mat");
        lista.adicionar("Hist");
        lista.adicionar("Lp3");
        
        Collections.sort(lista.getList()); 

        lista.exibir();

        p.put(1, "Isa");
        p.put(2, "Luis");
        p.put(3, "Leandro");
        p.put(4, "Vitoria");

        lista.exibirMap(p);

        println("Buscas:");

        println("Buscar o do inicio: " + lista.buscaInicio()); 

        println("Tamanho: " + lista.tamanho()); 

        lista.exibir();      

        println("Busca por index--> " + lista.buscaIndex(2)); 

        lista.remover("Lp3"); 

        println("Buscar o ultimo: " + lista.buscaFim());

        lista.removerIndex(0); 

    }

	public static void println(String input) {
		System.out.println(input);
    }
}