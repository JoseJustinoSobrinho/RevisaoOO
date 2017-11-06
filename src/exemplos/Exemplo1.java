
package exemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Exemplo1 {
    public static void main(String[] args) {
        
////        // tipo inteiros
////        int numero1 = 50;
////        long numero2 = 200L;
////        
////        //tipos decimais (ponto flutuante)
////        float numero3 = 2.6f;
////        double numero4 = 22.3;
////        
////        //Tipo caractere
////        char caractere = 't';
////        
////        //Tipo lógico
////        boolean logico = true;
////
////        //Tipo cadeia de caracteres        
////        String texto = "Isto é um texto";
////        
////        String nome = "Pedro";
////        int idade = 25;
////        char sexo = 'M';
////        
////        Pessoa p = new Pessoa("Pedro Augusto", 25, 'M', 1.63, 75.2);
////        
////        Pessoa p2 = new Pessoa();
////        
////        p.setNome("Carlos");
////        
////        System.out.print(p);
      
//
//        ContaCorrente cc = new ContaCorrente(); 
//        cc.setTitular(new Pessoa("Leonardo"));
//        cc.setAgencia(123);
//        cc.setConta(12345);
//        cc.setSaldo(6000);  
//        
//        
//        
//    ContaPoupanca cp = new ContaPoupanca();
//    cp.setTitular(new Pessoa("Jalielson"));
//    cp.setAgencia(254);
//    cp.setConta(96325);
//    cp.setSaldo(100);
//    
//    
//    System.out.println(cc);
//    System.out.println(cp);
//    
//    cc.transferir(500, cp);
//    
//    System.out.println("________________");    
//        
//    System.out.println(cc);
//    System.out.println(cp);
//    
//    if(cc.equals(cp)){
//        System.out.println("Iguais");        
//    } else {
//        System.out.println("Diferente");
//    }
//    
    
//ContaCorrente[] contas = new ContaCorrente[3];
//contas[0] = new ContaCorrente();
//contas[0].setTitular(new Pessoa("Lúcio"));
//contas[0].setAgencia(123);
//contas[0].setConta(12345);
//contas[0].setSaldo(600);
//
//contas[1] = new ContaCorrente();
//contas[1].setTitular(new Pessoa("Serafim"));
//contas[1].setAgencia(123);
//contas[1].setConta(5678);
//contas[1].setSaldo(1000);
//
//contas[2] = new ContaCorrente();
//contas[2].setTitular(new Pessoa("Sobrinho"));
//contas[2].setAgencia(756);
//contas[2].setConta(1999);
//contas[2].setSaldo(6600);
//
//for(int i=0; i<3; i++) {
//    System.out.println(contas[i]);
//}

////List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
Map<Integer, Conta> contas = new HashMap<Integer, Conta>();

ContaCorrente c1 = new ContaCorrente();
c1.setTitular(new Pessoa("Lúcio"));
c1.setAgencia(123);
c1.setConta(12345);
c1.setSaldo(600);
////contas.add(c1);

ContaCorrente c2 = new ContaCorrente();
c2.setTitular(new Pessoa("Serafim"));
c2.setAgencia(123);
c2.setConta(5678);
c2.setSaldo(1000);
////contas.add(c2);

ContaCorrente c3 = new ContaCorrente();
c3.setTitular(new Pessoa("Sobrinho"));
c3.setAgencia(756);
c3.setConta(1999);
c3.setSaldo(6600);
//contas.add(c3);

ContaCorrente c4 = new ContaCorrente();
c4.setTitular(new Pessoa("Janny"));
c4.setAgencia(1756);
c4.setConta(139);
c4.setSaldo(500);
//contas.add(c4);

contas.put(c1.getAgencia(), c1);
contas.put(c2.getAgencia(), c2);
contas.put(c3.getAgencia(), c3);
contas.put(c4.getAgencia(), c4);

//for(ContaCorrente cc : contas) {
//    System.out.println(cc);
//}

//contas.stream().forEach((cc) -> {
//    System.out.println(cc);
//        });

//if(contas.contains(c2)){
//    System.out.println("TEM");
//    } else {
//    System.out.println("NÃO TEM");
//}

//System.out.println(contas.get(2));  //  monstrar o indece dois


//for(ContaCorrente i : contas) {
//    contas i++;
//    System.out.println(i);
//}


//System.out.println("quantiade de contas"+contas.size());
//
//contas.remove(c1);
//contas.remove(3);
//
//System.out.println("quantiade de contas"+contas.size());

////////contas.forEach(c -> System.out.println(c));
////////
////////Collections.sort(contas);  // liste perminte numeros repetidos e conjuntos não
////////
////////System.out.println("==============");
////////
////////System.out.println(contas);

////////contas.forEach(c -> System.out.println(c));
    }
    
    
}
