
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    public void print(){
        hand.stream()
                .forEach(card -> System.out.println(card.toString()));
    }
    
    public void sort(){
        ArrayList<Card> newx = hand.stream()
                .sorted((card1, card2) -> card1.compareTo(card2))
                .collect(Collectors.toCollection(ArrayList::new));
        this.hand = newx;
    }
    
    public ArrayList<Card> getHand(){
        return this.hand;
    }
    
    
    public void sortBySuit(){
        BySuitInValueOrder sorter = new BySuitInValueOrder();
        Iterator<Card> iterator = hand.iterator();
        ArrayList<Card> temp = new ArrayList<>();
        
        Collections.sort(hand, sorter);
//        while(iterator.hasNext()){
//            temp.add(iterator.next());
//        }
//        while(i < temp.size()){
//            sorter.compare(temp.get(0), temp.get(1));
//        }
        
        
    }

    @Override
    public int compareTo(Hand o) {
        if(this == o){
            return 0;
        }
        o.sort();
        this.sort();
        int sum = o.getHand().stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, value) -> previousSum+value);
        int sumThis = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, value) -> previousSum+value);
        if(sumThis < sum){
            return -1;
        }
        if(sumThis == sum){
            int sumOrd1 = o.getHand().stream()
                    .map(card ->card.getSuit().ordinal())
                    .reduce(0, (previousSum, value) -> previousSum+value);
            int sumOrd2 = o.getHand().stream()
                    .map(card ->card.getSuit().ordinal())
                    .reduce(0, (previousSum, value) -> previousSum+value);  
            System.out.println(sumOrd1);
            System.out.println(sumOrd2);
            int count1 = o.getHand().size();
            int count2 = this.getHand().size();
            if(sumOrd1 > sumOrd2){
                return 0;
            }else if(count1 < count2){
                return 0;
            }
        }
        return 1;
    }
}
