package com.example.JavaFundermentals.JavaFundermentals.trees;

public class Nodes {
    Nodes left, right;
    int data;
    public Nodes(int data){
        this.data=data;
    }
    public void insert(int val){
        if(val<=data){
            if(left==null){
                left=new Nodes(val);//if not existing
            }else{
                left.insert(val);

            }
        }else{
            if(right==null){
                right=new Nodes(val);
            }else{
                right.insert(val);
            }
        }
    }
    public boolean contains(int val){
        if(val==data){
            return true;
        }else if(val<data){
            if(left==null){
                return false;
            }
            else{
                return left.contains(val);
            }
        }else {
            if(right== null){
                return false;
            }else{
                return right.contains(val);
            }
        }
    }
    public void printInOrder(){
        if(left!=null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right!=null){
            right.printInOrder();
        }
    }
}
