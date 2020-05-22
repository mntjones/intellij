package com.example.monica;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?

//1A. package-private - accessible to all classes in the com.example.monica package
interface Accessible {
    //2A. public - all interface variables are public static final
    int SOME_CONSTANT = 100;
    //3A. public static
    public void methodA();
    //4A. public - all interface methods are automatically public
    void methodB();
    boolean methodC();
}
