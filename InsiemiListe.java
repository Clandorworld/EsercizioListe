import java.util.TreeSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class InsiemiListe {
    public static void main(String[] args) {

        Set<Integer> lista = new HashSet<Integer>();
        lista.add(3);
        lista.add(6);
        lista.add(9);
        lista.add(12);

        System.out.println(lista);

        System.out.println("C'è l'8 nella mia lista?");
        //Per vedere se una cosa è contenuta nella nostra lista//
        boolean cercalo = lista.contains(8);
        System.out.println(cercalo);

        System.out.println("Rimuovi il 9 dalla mia lista");
        //Se voglio rimuovere una cosa dalla nostra lista//
        lista.remove(9);
        System.out.println(lista);

        System.out.println("La mia lista è vuota?");
        //Se voglio vedere se la nostra lista è vuota//
        boolean vuota = lista.isEmpty();
        System.out.println(vuota);

        System.out.println("Quanti elementi ci sono ora nella mia lista?");
        //Se voglio vedere quanti elementi ci sono nella nostra lista//
        lista.size();
        int quantiElementi = lista.size();
        System.out.println(quantiElementi);

        System.out.println("Svuta la mia lista");
        //Se voglio svuotare la nostra lista//
        lista.clear();
        System.out.println(lista);

        System.out.println("Aggiungo numeri ad una nuova lista, saranno in ordine crescente");
        //Se voglio che i numeri siano in ordine crescente//
        Set<Integer> lista2 = new TreeSet<Integer>();
        lista2.add(6);
        lista2.add(-77);
        lista2.add(146);
        lista2.add(-2);
        System.out.println(lista2);

        System.out.println("Svuta nuovamente la mia lista");
        //Se voglio svuotare la nostra lista//
        lista2.clear();
        System.out.println(lista2);

        System.out.println("Creo una lista Array");
        //Aggiungo elementi//
        ArrayList<Integer> lista3 =new ArrayList<Integer>();
        lista3.add(4);
        lista3.add(15);
        lista3.add(21);
        lista3.add(43);
        //Dico di prendere il valore 1 (cioè il 2°) e di sostituirlo con l'8//
        lista3.get(1);
        lista3.set(1,8);

        System.out.println(lista3);

        System.out.println("Dico di mostrare solo gli elementi dal 2° al 3°");
        //Mostra elementi da 1 (ciò il 2°) al 3 (valore vero)//
        lista3.subList(1,3);
        System.out.println(lista3.subList(1, 3));
    }
}
