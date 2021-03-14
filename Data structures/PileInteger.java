public class PileInteger extends Pile<Integer>{
    // An implementation of a stack using java arrays
    private Integer[] items;
    private int top = 0;
    private int max = 100;

    // Constructor 
    public PileInteger(){
        items = new Integer[max];
    }

    // push operation
    public Integer empiler(Integer item){

        if(!this.estPleine()){
            items[top++] = item;
        }
        return item;
    }

    // pop operation 
    public Integer depiler(){
        Integer item = null; 
        item = items[--top];
        return item;
    }

    // check is stack is empty
    public Boolean estVide(){
        return (top == 0);
    }

    // check if stacks is full
    public Boolean estPleine(){
        return (top == max-1);
    }


    public static void main (String[] args){

        PileInteger pile = new PileInteger();
        pile.empiler(1);
        pile.empiler(2);
        pile.empiler(3);
        pile.empiler(4);
        pile.empiler(5);
        System.out.println(pile.depiler());
    }
}