package com.example.JavaFundermentals.JavaFundermentals.intro;

class InnerOuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

 class MainClass {
    public static void main(String[] args) {
        InnerOuterClass myOuter = new InnerOuterClass();
        InnerOuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
