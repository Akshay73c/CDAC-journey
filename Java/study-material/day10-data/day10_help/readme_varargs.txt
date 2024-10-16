var-args  ...  (elipsis)
var-args means you can pass  variable no of arguments   , to any java method.

Rule :  
Must be last argument in the list of method arguments
Can be used with  primitive type as well as ref types.
Legal ---
void doStuff(int... x) {
//B.L	
 } // expects from 0 to many ints
Usage : ref.doStuff();//no args
int[] ints={1,2,3,4};
ref.doStuff(ints);//array
ref.doStuff(20,34,56);// comma separated list of args

System.out.printf("%n");//legal 
System.out.printf(1234);//javac error

// as parameters
void doStuff2(char c, int... x) {..... } // expects first a char,
// then 0 to many ints
eg : ref.doStuff2('a',1,2,3,5);//no javac err
ref.doStuff2();//javac err : 1st arg missing


class Test {
void doStuff3(Animal... animals) { 
   for(Animal a : animals)
     sop(a.getName());
} // 0 to many Animals
}
Test ref=new Test();
invocations ---
ref.doStuff3();//no javac err
Animal animals[]={new Cat(),new Dog(),new Horse()};//4 objs 
ref.doStuff3(animals);//no javac err
Animal a1=new Horse(); 
Animal a2=new Cat(); 
Animal a3=new Dog();
ref.doStuff3(a1,a2,a3);
OR
ref.doStuff3(new Cat(),new Dog(),new Horse());


Illegal: javac error
void doStuff4(int x...) {....} // bad syntax : javac err
void doStuff5(int... x, char... y) {...} // too many var-args
void doStuff6(String... s, byte b) { } // var-arg must be last



