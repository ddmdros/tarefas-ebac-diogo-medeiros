package br.com.ddmdros.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ebac2_arrayDeque {
    public static void main(String[] args) {
        inserindoNaFila();
        removendoDaFila();
        acessandoDaFila();
    }
    private static void acessandoDaFila(){
        System.out.println("**** ACESSANDO ****");

        //primeira fila
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        //segunda fila
        Deque<String> d = new ArrayDeque<>();
        d.add("Green");
        d.add("Orange");

        //junta todo mundo numa outra fila
        ad.addAll(d);

        System.out.println(ad);
        System.out.println(ad.contains("White"));
        System.out.println(ad.contains("Brown"));
        System.out.println(d.containsAll(d));

        System.out.println("Output of element: " + ad.element());
        System.out.println("Get first element using getFirst: " + ad.getFirst());
        System.out.println("Set last element using getLast: " + ad.getLast());
        System.out.println("Output of peek: "+ ad.peek());
        System.out.println("Get first element using peakFirst: " + ad.peekFirst());
        System.out.println("Get last element using peekLast: " + ad.peekLast());
        System.out.println("");

    }

    public static void removendoDaFila(){
        System.out.println("**** REMOVENDO ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<>();
        d.add("Pink");
        d.add("Green");
        d.add("Purple");
        d.add("Orange");
        d.add("Brown");

        ad.addAll(d);
        System.out.println("Elements in the ArrayDeque: " + ad);

        String val = ad.remove();
        ad.remove("Black");

        System.out.println("Elements in the ArrayDeque after remove: " + ad);

        ad.removeFirst();
        ad.removeLast();

        System.out.println("Elements in teh ArrayDeque after removeFirst and removeLast: " + ad);

        ad.poll();
        ad.peekFirst();
        ad.peekLast();

        System.out.println("Elements in ArrayDeque after pool, poolFirst, poolLast: " + ad);

        ad.pop();
        System.out.println("Elements in ArrayDeque after pop: " + ad);

        ad.retainAll(d);
        System.out.println("Elements in the ArrayDeque after retainAll: " + ad);

        ad.removeAll(d);
        System.out.println("Elements in the ArrayDeque after removeAll: " + ad);
        System.out.println("");
    }

    public static  void inserindoNaFila(){
        System.out.println("**** INSERINDO ****");

        Deque<String> d = new ArrayDeque<>();
        d.add("Delhi");
        d.addFirst("Bangalore");
        d.addLast("Chennai");

        System.out.println("Elements in the Deque after add, addFirst and addLast: "+ d);

        Deque<String> dq = new ArrayDeque<>();
        dq.add("Hyderabad");
        dq.add("Trivandrum");

        d.addAll(dq);

        System.out.println("Elements in the Deque after addAll: " + d);

        boolean val = d.offer("Jaipur");
        d.offerFirst("Goa");
        d.offerLast("Mumbai");

        System.out.println("Elements in the Deque after offer, offerFirst, and offerLast: " + d);

        d.push("Kolkata");

        System.out.println("Elements in the Deque after push: " + d);
        System.out.println("");
    }
}
