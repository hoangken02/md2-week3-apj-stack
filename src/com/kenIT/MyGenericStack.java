package com.kenIT;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int size(){
       return stack.size();
    }

    public boolean isEmpty(){
        if (size() == 0){
            return true;
        }
        return false;
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
       return stack.removeFirst();
    }
}
