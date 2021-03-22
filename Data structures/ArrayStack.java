

import java.util.stream.IntStream;
public class ArrayStack<E> implements Stack<E>{

    private E[] items;
    int top = 0;
    int size;

    ArrayStack(int size){
        this.size = size; 
        items = (E[])new Object[size];
    }

    public boolean isEmpty(){
        return (this.top == 0);
    }

    public boolean isFull(){
        return (this.top == size-1);
    }

    public E peek(){
        E item = null;
        if(!this.isEmpty()){
            item = this.items[--top];
            return item;
        }else{
            return null;
        }     
    }

    public E pop(){

        if(!this.isEmpty()){
            return null;
        }else{
            E item = items[--top];
            return item;
        }
    }

    public void push (E item){
        if(!this.isFull()){
            this.items[top++] = item;
        }
    }

    public void clear(){
        for (int i = 0; i < items.length; i++){
            this.pop();
        }
    }

    
}