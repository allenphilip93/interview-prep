# Theory

## Programming Languages

### Object Oriented Programming

Object-oriented programming (OOP) is a programming language model in which programs are organized around data, or [objects](https://searchmicroservices.techtarget.com/definition/object), rather than functions and logic. 

Basically we try to define everything as objects and define ways how objects can interact and relate to each other.

A key part of programming is handling complexity. When the rules/concepts of OOP are adhered to, it allows to build complex logic in a readable maintainable fashion.

### Functional Programming

Functional programming is a programming paradigm in which we try to bind everything in pure mathematical functions style. 

It is a declarative type of programming style. Its main focus is on “what to solve” in contrast to an imperative style where the main focus is “how to solve”. 

It uses expressions instead of statements. An expression is evaluated to produce a value whereas a statement is executed to assign variables.

 Functional code is [idempotent](https://en.wikipedia.org/wiki/Idempotence): a function's return value depends only on its [arguments](https://en.wikipedia.org/wiki/Function_argument), so calling a function with the same value for an argument always produces the same result. This means there is no state and allows use to add more parallelism.



### Aspect Oriented Programming

In [computing](https://en.wikipedia.org/wiki/Computing), **aspect-oriented programming** (**AOP**) is a [programming paradigm](https://en.wikipedia.org/wiki/Programming_paradigm) that aims to increase [modularity](https://en.wikipedia.org/wiki/Modularity_(programming)) by allowing the [separation of](https://en.wikipedia.org/wiki/Separation_of_concerns) [cross-cutting concerns](https://en.wikipedia.org/wiki/Cross-cutting_concern). 

It does so by adding additional behavior to existing code (an [advice](https://en.wikipedia.org/wiki/Advice_(programming))) *without* modifying the code itself, instead separately specifying which code is modified via a "[pointcut](https://en.wikipedia.org/wiki/Pointcut)" specification, such as "log all function calls when the function's name begins with 'set'". 

This allows behaviors that are not central to the [business logic](https://en.wikipedia.org/wiki/Business_logic) (such as logging) to be added to a program without cluttering the code, core to the functionality

### Interpreter vs Compiler

Interpreters and compilers are very similar in structure. The main difference is that an interpreter directly executes the instructions in the source programming language while a compiler translates those instructions into efficient machine code.

An interpreter will typically generate an efficient intermediate representation and immediately evaluate it. Depending on the interpreter, the intermediate representation can be an *AST*, an *annotated AST* or a machine-independent low-level representation such as the *three-address code*.

### Interpreted vs Compiled Language

- In a compiled implementation, the original program is translated into native machine instructions, which are executed directly by the hardware.
- In an interpreted implementation, the original program is translated into something else. Another program, called "the interpreter", then examines "something else" and performs whatever actions are called for. Depending on the language and its implementation, there are a variety of forms of "something else". From more popular to less popular, "something else" might be
  - Binary instructions for a virtual machine, often called *bytecode*, as is done in Lua, Python, Ruby, Smalltalk, and many other systems (the approach was popularized in the 1970s by the UCSD P-system and UCSD Pascal)
  - A tree-like representation of the original program, such as an abstract-syntax tree, as is done for many prototype or educational interpreters
  - A tokenized representation of the source program, similar to Tcl
  - The characters of the source program, as was done in MINT and TRAC

One thing that complicates the issue is that *it is possible to translate (compile) bytecode into native machine instructions*. Thus, a successful interpreted implementation might eventually acquire a compiler. If the compiler runs dynamically, behind the scenes, it is often called a just-in-time compiler or JIT compiler. JITs have been developed for Java, JavaScript, Lua, and I daresay many other languages. At that point you can have a hybrid implementation in which some code is interpreted and some code is compiled.

### Java

**Java** is a [general-purpose](https://en.wikipedia.org/wiki/General-purpose_language) [programming language](https://en.wikipedia.org/wiki/Programming_language) that is [class-based](https://en.wikipedia.org/wiki/Class-based_programming), [object-oriented](https://en.wikipedia.org/wiki/Object-oriented_programming)[[15\]](https://en.wikipedia.org/wiki/Java_(programming_language)#cite_note-FOOTNOTEDECODER1-15) (although not a pure OO language, as it contains primitive types[[16\]](https://en.wikipedia.org/wiki/Java_(programming_language)#cite_note-16)), and designed to have as few implementation [dependencies](https://en.wikipedia.org/wiki/Dependency_(computer_science)) as possible.

Intended to let [application developers](https://en.wikipedia.org/wiki/Application_developer) *write once, run anywhere* (WORA)

**Security**

- Automatic array bounds checking and the lack of manual memory management make certain classes of programming mistakes that often cause serious security holes (such as buffer overruns) impossible. Most other modern languages share this feature, but C and C++, which were dominant (and still are major) application development languages at the time Java first appeared, do not.
- The [Security Manager](http://download.oracle.com/javase/1.4.2/docs/guide/security/spec/security-spec.doc6.html) concept makes it relatively easy to run Java applications in a "sandbox" that prevents them from doing any harm to the system they are running on. This played an important part in promoting Java during its early days, since Applets were envisioned as a ubiquitous, safe way to have client-side web applications.



> ***Why can't we use pointers in Java?***

Because the language designers chose not to include pointers in the language.

> ***Why we are not using the pointer here.***

Because the designers of Java thought it was a tricky-to-use and error prone construct.

> ***Which concept is used instead of pointer in Java?***

References (which are quite similar to pointers if you disregard from pointer arithmetic).

Keep in mind that all objects you create, you create on the heap (using the `new` keyword). This fact, together with the fact that there is no "dereference operator" (`*` in C/C++) means that there's no way to get hold of an object! Since you can't get hold of an object, there's no way you can store an object in a variable. Therefor all variables (except the ones holding primitive types) are of reference-type.

#### Static Typing

A language is statically typed if the type of a variable is known at compile time. For some languages this means that you as the programmer must specify what type each variable is (e.g.: Java, C, C++); other languages offer some form of *type inference*, the capability of the type system to deduce the type of a variable (e.g.: OCaml, Haskell, Scala, Kotlin)

The main advantage here is that all kinds of checking can be done by the compiler, and therefore a lot of trivial bugs are caught at a very early stage.

### JavaScript

**JavaScript** ([/ˈdʒɑːvəˌskrɪpt/](https://en.wikipedia.org/wiki/Help:IPA/English)), often abbreviated as **JS**, is a [high-level](https://en.wikipedia.org/wiki/High-level_programming_language), [interpreted](https://en.wikipedia.org/wiki/Interpreted_language) [programming language](https://en.wikipedia.org/wiki/Programming_language) that conforms to the [ECMAScript](https://en.wikipedia.org/wiki/ECMAScript) specification. JavaScript has [curly-bracket syntax](https://en.wikipedia.org/wiki/List_of_programming_languages_by_type#Curly-bracket_languages), [dynamic typing](https://en.wikipedia.org/wiki/Dynamic_programming_language), [prototype-based](https://en.wikipedia.org/wiki/Prototype-based_programming), [object-orientation](https://en.wikipedia.org/wiki/Object-oriented_programming), and [first-class functions](https://en.wikipedia.org/wiki/First-class_function).

#### Dynamic Typing

A language is dynamically typed if the type is associated with run-time values, and not named variables/fields/etc. This means that you as a programmer can write a little quicker because you do not have to specify types every time (unless using a statically-typed language with *type inference*).

#### Prototype Based

Prototype object oriented programming uses generalized objects, which can then be cloned and extended.

Prototypal inheritance in JavaScript is described by [Douglas Crockford](https://en.wikipedia.org/wiki/Douglas_Crockford) as: "you make prototype objects, and then … make new instances. Objects are mutable in JavaScript, so we can augment the new instances, giving them new fields and methods. These can then act as prototypes for even newer objects. We don't need classes to make lots of similar objects… Objects inherit from objects. What could be more object oriented than that?"

#### First Class Functions

A language that considers procedures to be "first-class" **allows functions to be passed around just like any other value**.

Languages like Java 7 (and earlier) and C "kind of" have this capability: C allows function pointers to be passed around, but you can't dynamically define a function in those languages and suddenly pass that somewhere else. Java before version 8 can *simulate* this to a certain extent with anonymous classes, but it doesn't technically have first-class functions.

More common to typical functional programming languages.

### Python

**Python** is an [interpreted](https://en.wikipedia.org/wiki/Interpreted_language), [high-level](https://en.wikipedia.org/wiki/High-level_programming_language), [general-purpose](https://en.wikipedia.org/wiki/General-purpose_programming_language) [programming language](https://en.wikipedia.org/wiki/Programming_language). Its language constructs and [object-oriented](https://en.wikipedia.org/wiki/Object-oriented_programming) approach aims to help programmers write clear, logical code for small and large-scale projects.

Python is [dynamically typed](https://en.wikipedia.org/wiki/Dynamic_programming_language) and [garbage-collected](https://en.wikipedia.org/wiki/Garbage_collection_(computer_science)). It supports multiple [programming paradigms](https://en.wikipedia.org/wiki/Programming_paradigm), including [procedural](https://en.wikipedia.org/wiki/Procedural_programming), object-oriented, and [functional programming](https://en.wikipedia.org/wiki/Functional_programming).

Python [interpreters](https://en.wikipedia.org/wiki/Interpreter_(computing)) are available for many [operating systems](https://en.wikipedia.org/wiki/Operating_system).

Python uses [duck typing](https://en.wikipedia.org/wiki/Duck_typing) and has typed objects but untyped variable names. Type constraints are not checked at [compile time](https://en.wikipedia.org/wiki/Compile_time); rather, operations on an object may fail, signifying that the given object is not of a suitable type. Despite being [dynamically typed](https://en.wikipedia.org/wiki/Type_system#Dynamic_type_checking_and_runtime_type_information), Python is [strongly typed](https://en.wikipedia.org/wiki/Strongly_typed_programming_language), forbidding operations that are not well-defined (for example, adding a number to a string) rather than silently attempting to make sense of them.

### NodeJS

**Node.js** is an [open-source](https://en.wikipedia.org/wiki/Open-source_software), [cross-platform](https://en.wikipedia.org/wiki/Cross-platform) [JavaScript](https://en.wikipedia.org/wiki/JavaScript) [run-time environment](https://en.wikipedia.org/wiki/Runtime_system) that executes JavaScript code outside of a browser. 

Node.js lets developers use JavaScript to write command line tools and for [server-side scripting](https://en.wikipedia.org/wiki/Server-side_scripting)—running scripts server-side to produce [dynamic web page](https://en.wikipedia.org/wiki/Dynamic_web_page) content before the page is sent to the user's web browser. 

Consequently, Node.js represents a "JavaScript everywhere" paradigm, unifying [web application](https://en.wikipedia.org/wiki/Web_application) development around a single programming language, rather than different languages for server- and client-side scripts.

Node.js brings [event-driven programming](https://en.wikipedia.org/wiki/Event-driven_programming) to [web servers](https://en.wikipedia.org/wiki/Web_server), enabling development of fast web servers in JavaScript.

Developers can create scalable servers without using [threading](https://en.wikipedia.org/wiki/Thread_(computing)), by using a simplified model of [event-driven programming](https://en.wikipedia.org/wiki/Event-driven_programming) that uses callbacks to signal the completion of a task along with a message/event queue so that the main thread is always kept busy and the waiting happens elsewhere. Made lot of sense for UI browsers and NodeJS took it to the server-side of things.



## Java

### Hello World Explained

```java
public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

* main() function is static since it'll be the first function executed by the JVM even before creating an instance of the class.
* While trying to execute, the JVM looks explicitly for the main() function and will throw exception if not found.
* main() function is public so that is can be accessed from the JVM.
* void return type since it makes no sense to return to first execution point.
* System has a static member out which is an static reference variable to non-static instance variable of the default OutputStream (like display/monitor) 

### Core OOPS concepts are

**1) Class**

The class is a group of similar entities. It is only an logical component and not the physical entity. For example, if you had a class called “Expensive Cars” it could have objects like Mercedes, BMW, Toyota, etc. Its properties(data) can be price or speed of these cars. While the methods may be performed with these cars are driving, reverse, braking etc.

**2) Object**

An object can be defined as an instance of a class, and there can be multiple instances of a class in a program. An Object contains both the data and the function, which operates on the data. For example - chair, bike, marker, pen, table, car, etc.

**3) Inheritance**

Inheritance is an OOPS concept in which one object acquires the properties and behaviors of the parent object. It’s creating a parent-child relationship between two classes. It offers robust and natural mechanism for organizing and structure of any software.

**4) Polymorphism**

Polymorphism refers to the ability of a variable, object or function to take on multiple forms. For example, in English, the verb *run* has a different meaning if you use it with *a laptop*, *a foot race*, and *business*. Here, we understand the meaning of *run* based on the other words used along with it.The same also applied to Polymorphism.

**5) Abstraction**

An abstraction is an act of representing essential features without including background details. It is a technique of creating a new data type that is suited for a specific application. For example, while driving a car, you do not have to be concerned with its internal working. Here you just need to concern about parts like steering wheel, Gears, accelerator, etc.

**6) Encapsulation**

Encapsulation is an OOP technique of wrapping the data and code. In this OOPS concept, the variables of a class are always hidden from other classes. It can only be accessed using the methods of their current class. For example - in school, a student cannot exist without a class.

**7) Association**

Association is a relationship between two objects. It defines the diversity between objects. In this OOP concept, all object have their separate lifecycle, and there is no owner. For example, many students can associate with one teacher while one student can also associate with multiple teachers.

**8) Aggregation**

In this technique, all objects have their separate lifecycle. However, there is ownership such that child object can’t belong to another parent object. For example consider class/objects department and teacher. Here, a single teacher can’t belong to multiple departments, but even if we delete the department, the teacher object will never be destroyed.

**9) Composition**

A composition is a specialized form of Aggregation. It is also called "death" relationship. Child objects do not have their lifecycle so when parent object deletes all child object will also delete automatically. For that, let’s take an example of House and rooms. Any house can have several rooms. One room can’t become part of two different houses. So, if you delete the house room will also be deleted.

### Access Modifiers

| **Modifier** | **Class** | **Package** | **Subclass** | **World** |
| ------------ | --------- | ----------- | ------------ | --------- |
| public       | Y         | Y           | Y            | Y         |
| protected    | Y         | Y           | Y            | N         |
| default      | Y         | Y           | N            | N         |
| private      | Y         | N           | N            | N         |

* Note that there is no concept of package inheritance ie, if a function is package private and present in package com.java then its not accessible anywhere like com.java.* because to Java com.java and com.java.test are different packages.

### Type Promotion

![](C:\codebase\github\interview-prep\img\java-type-promotion.png)



### Strings

#### Why are Strings immutable

`String` is immutable for several reasons, here is a summary:

- **Security**: parameters are typically represented as `String` in network connections, database connection urls, usernames/passwords etc. If it were mutable, these parameters could be easily changed.
- **Synchronization** and concurrency: making String immutable automatically makes them thread safe thereby solving the synchronization issues.
- **Caching**: when compiler optimizes your String objects, it sees that if two objects have same value (a="test", and b="test") and thus you need only one string object (for both a and b, these two will point to the same object).
- **Class loading**: `String` is used as arguments for class loading. If mutable, it could result in wrong class being loaded (because mutable objects change their state).

### UML Cheatsheet

![](C:\codebase\github\interview-prep\img\umlcheatsheet.jpg)

In Object-oriented programming, one object is related to other to use functionality and service provided by that object. This relationship between two objects is known as the *association* in  object oriented general software design and depicted by an arrow in Unified Modelling language or UML.

Both Composition and Aggregation are the form of association between two objects, but there is a **subtle difference between composition and aggregation**, which is also reflected by their UML notation.

We refer association between two objects as [Composition](http://javarevisited.blogspot.com/2015/06/difference-between-inheritance-and-Composition-in-Java-OOP.html), when one class ***owns*** other class and other class can not meaningfully exist, when it's owner destroyed, for example, Human class is a composition of several body parts including Hand, Leg and Heart.

While in the case of Aggregation, including object can exists without being part of the main object e.g. a Player which is part of a Team, can exist without a team and can become part of other teams as well.

The composition is stronger than Aggregation.  In Short, a relationship between two objects is referred as an association, and an association is known as composition when one object *owns* other while an association is known as aggregation when one object uses another object.

### Overriding

#### Exception

If SuperClass does not declare an exception, then the SubClass can only declare unchecked exceptions, but not the checked exceptions.

If SuperClass declares an exception, then the SubClass can only declare the child exceptions of the exception declared by the SuperClass, but not any other exception.

#### Access Modifier

Their is Only one rule while doing Method overriding with Access modifiers i.e.

> If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.

**Access modifier restrictions in decreasing order:**

- private
- default
- protected
- public

i.e. private is more restricted then default and default is more restricted than protected and so on.

#### Things to Remember

* **Final methods can not be overridden**
* **Static methods can not be overridden(Method Overriding vs Method Hiding)**
* **Private methods can not be overridden**
* **Private methods can not be overridden** From Java 5.0 onwards it is possible to have different return type for a overriding method in child class, but child’s return type should be sub-type of parent’s return type. This phenomena is known as [**covariant return type**](https://www.geeksforgeeks.org/covariant-return-types-java/).
* **Invoking overridden method from sub-class** using super()
* **Overriding and constructor :** We can not override constructor as parent and child class can never have constructor with same name(Constructor name must always be same as Class name).

### Interfaces vs Abstract Classes

When to use Abstract:

* There are some common fields and more number of common methods

* Have common partial implementations/behavior

* Establish relation between related objects
* Interfaces are slower in performance as compared to abstract classes as extra indirections are required for interfaces

When to use Interface:

*  Leverage the advantage of multiple inheritance

* Establish relation between unrelated classes (cloneable, serilazable etc.,)
* Define basic contracts that are common across implementations

### Anonymous Class

**Anonymous classes are inner classes with no name.** Since they have no name, we can’t use them in order to create instances of anonymous classes. As a result, we have to declare and instantiate anonymous classes in a single expression at the point of use.

We may either extend an existing class or implement an interface.

```java
new Book("Design Patterns") {
    @Override
    public String description() {
        return "Famous GoF book.";
    }
}
```

### Static vs Dynamic Class Loading

Dynamic Class Loading allows the loading of java code that is not known about before a program starts. The Java model loads classes as needed and need not know the name of all classes in a collection before any one of its classes can be loaded and run.

For example : Depending on user input you want to create only one object and there are hundreds of classes. Then you don't need load all classes. You can create object at run time by dynamic class loading.

```java
try {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);

    System.out.println("Enter Class Name: ");
    String whatClass = reader.readLine();

    Class exampleClass = Class.forName(whatClass);
    Object ob = exampleClass.newInstance();

} catch (ClassNotFoundException e) {
    e.printStackTrace();

} catch (Exception e) {
    e.printStackTrace();
}
```

### Multi-Threading

Both processes and threads are **independent sequences of execution**. The typical difference is that **threads** (of the same process) **run in a shared memory space, while processes run in separate memory spaces**.

**Multitasking:** Ability to execute more than one task at the same time is known as multitasking.

**Multithreading:** It is a process of executing multiple threads simultaneously. Multithreading is also known as Thread-based Multitasking.

**Multiprocessing:** It is same as multitasking, however in multiprocessing more than one CPUs are involved. On the other hand one CPU is involved in multitasking.

**Parallel Processing:** It refers to the utilization of multiple CPUs in a single computer system.

#### Creating a thread by extending Thread class

```java
class MultithreadingDemo extends Thread{  
  public void run(){  
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     MultithreadingDemo obj=new MultithreadingDemo();   
     obj.start();  
  }  
}
```

#### Creating a thread by implementing Runnable interface

```java
class MultithreadingDemo implements Runnable{  
  public void run(){  
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     MultithreadingDemo obj=new MultithreadingDemo();  
     Thread tobj =new Thread(obj);  
     tobj.start();  
 }  
}
```

- Thread priorities are the integers which decide how one thread should be treated with respect to the others.
- Thread priority decides when to switch from one running thread to another, process is called context switching

```java
Synchronized(object)
{
    // statement to be synchronized
}
```

#### Inter-thread Communication

We have few methods through which java threads can communicate with each other. These methods are `wait()`, `notify()`, `notifyAll()`. All these methods can only be called from within a synchronized method.

* To understand synchronization java has a concept of monitor. Monitor can be thought of as a box which can hold only one thread. Once a thread enters the monitor all the other threads have to wait until that thread exits the monitor.
* `wait()`  tells the calling thread to give up the monitor and go to sleep until some other thread enters the same monitor and calls `notify()`.
* `notify()` wakes up the first  thread that called `wait()` on the same object.
  `notifyAll()` wakes up all the threads that called wait() on the same object. The highest priority thread will run first.  
* `Thread.sleep()` goes to sleep until some other interrupts it and doesn't release the lock on the monitor.

![](C:\codebase\github\interview-prep\img\Executors.png)

#### Producer Consumer Example

```java
// Java program to implement solution of producer 
// consumer problem. 
import java.util.LinkedList;

public class Threadexample {
 public static void main(String[] args)
 throws InterruptedException {
  // Object of a class that has both produce() 
  // and consume() methods 
  final PC pc = new PC();

  // Create producer thread 
  Thread t1 = new Thread(new Runnable() {
   @Override
   public void run() {
    try {
     pc.produce();
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
   }
  });

  // Create consumer thread 
  Thread t2 = new Thread(new Runnable() {
   @Override
   public void run() {
    try {
     pc.consume();
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
   }
  });

  // Start both threads 
  t1.start();
  t2.start();

  // t1 finishes before t2 
  t1.join();
  t2.join();
 }

 // This class has a list, producer (adds items to list 
 // and consumber (removes items). 
 public static class PC {
  // Create a list shared by producer and consumer 
  // Size of list is 2. 
  LinkedList < Integer > list = new LinkedList < > ();
  int capacity = 2;

  // Function called by producer thread 
  public void produce() throws InterruptedException {
   int value = 0;
   while (true) {
    synchronized(this) {
     // producer thread waits while list 
     // is full 
     while (list.size() == capacity)
      wait();

     System.out.println("Producer produced-" +
      value);

     // to insert the jobs in the list 
     list.add(value++);

     // notifies the consumer thread that 
     // now it can start consuming 
     notify();

     // makes the working of program easier 
     // to understand 
     Thread.sleep(1000);
    }
   }
  }

  // Function called by consumer thread 
  public void consume() throws InterruptedException {
   while (true) {
    synchronized(this) {
     // consumer thread waits while list 
     // is empty 
     while (list.size() == 0)
      wait();

     //to retrive the ifrst job in the list 
     int val = list.removeFirst();

     System.out.println("Consumer consumed-" +
      val);

     // Wake up producer thread 
     notify();

     // and sleep 
     Thread.sleep(1000);
    }
   }
  }
 }
}
```



### JVM & Garbage Collection

![](C:\codebase\github\interview-prep\img\JVM-Architecture.png)

![](C:\codebase\github\interview-prep\img\jvm memory.png)

![](C:\codebase\github\interview-prep\img\virtual-memory.jpg)

### Things to Remember

* The local variables are not initialized to any default value, neither primitives nor object references.

* super() is implicitly invoked by the compiler if no super() or this() is included explicitly within the derived class constructor. Therefore, in this case, The Person class constructor is called first and then the Employee class constructor is called.

* this() and super() must be the first statement in the class constructor, hence we cannot call both inside the constructor

* Yes, we can change the scope of the overridden method in the subclass. However, we must notice that we cannot decrease the accessibility of the method. The following point must be taken care of while changing the accessibility of the method.

* A final variable, not initialized at the time of declaration, is known as the final blank variable. We can't initialize the final blank variable directly. Instead, we have to initialize it by using the class constructor. It is useful in the case when the user has some data which must not be changed by others

### Java 8

#### Lambda Functions

```java
// Java program to demonstrate working of lambda expressions 
public class Test 
{ 
	// operation is implemented using lambda expressions 
	interface FuncInter1 
	{ 
		int operation(int a, int b); 
	} 

	// sayMessage() is implemented using lambda expressions 
	// above 
	interface FuncInter2 
	{ 
		void sayMessage(String message); 
	} 

	// Performs FuncInter1's operation on 'a' and 'b' 
	private int operate(int a, int b, FuncInter1 fobj) 
	{ 
		return fobj.operation(a, b); 
	} 

	public static void main(String args[]) 
	{ 
		// lambda expression for addition for two parameters 
		// data type for x and y is optional. 
		// This expression implements 'FuncInter1' interface 
		FuncInter1 add = (int x, int y) -> x + y; 
        // add.operation(2,4);

		// lambda expression multiplication for two parameters 
		// This expression also implements 'FuncInter1' interface 
		FuncInter1 multiply = (int x, int y) -> x * y; 
        // multiply.operation(1,2);

		// Creating an object of Test to call operate using 
		// different implementations using lambda Expressions 
		Test tobj = new Test(); 

		// Add two numbers using lambda expression 
		System.out.println("Addition is " + 
						tobj.operate(6, 3, add)); 

		// Multiply two numbers using lambda expression 
		System.out.println("Multiplication is " + 
						tobj.operate(6, 3, multiply)); 

		// lambda expression for single parameter 
		// This expression implements 'FuncInter2' interface 
		FuncInter2 fobj = message ->System.out.println("Hello "
												+ message); 
		fobj.sayMessage("Geek"); 
	} 
} 
```



#### Streams

```java
public class NowJava8 {

 public static void main(String[] args) {

  List < String > lines = Arrays.asList("spring", "node", "mkyong");

  List < String > result = lines.stream() // convert list to stream
   .filter(line -> !"mkyong".equals(line)) // we dont like mkyong
   .collect(Collectors.toList()); // collect the output and convert streams to a List

  result.forEach(System.out::println); //output : spring, node
 }
}
```

```java
public static void main(String[] args) {

 List < Person > persons = Arrays.asList(
  new Person("mkyong", 30),
  new Person("jack", 20),
  new Person("lawrence", 40)
 );

 Person result1 = persons.stream() // Convert to steam
  .filter(x -> "jack".equals(x.getName())) // we want "jack" only
  .findAny() // If 'findAny' then return found
  .orElse(null); // If not found, return null

 System.out.println(result1);
}
```

```java
 public static void main(String[] args) {

  List < Person > persons = Arrays.asList(
   new Person("mkyong", 30),
   new Person("jack", 20),
   new Person("lawrence", 40)
  );

  String name = persons.stream()
   .filter(x -> "jack".equals(x.getName()))
   .map(Person::getName) //convert stream to String
   .findAny()
   .orElse("");

  System.out.println("name : " + name);

  List < String > collect = persons.stream()
   .map(Person::getName)
   .collect(Collectors.toList());

  collect.forEach(System.out::println);

 }
```



### Java 9

* Modular System – Jigsaw Project
* New HTTP client
* JSHELL (REPL)
* Private methods in interfaces
* Try-With-Resources

### Dependency Injection & Inversion of Control

First let’s try to understand IOC (Inversion of control). If you go back to old computer programming days, program flow used to run in its own control. For instance let’s consider a simple chat application flow as shown in the below flow diagram.

1. End user sends chat message.
2. Application waits for the message from the other end.
3. If no message is found it goes to Step 2 or else moves to Step 4.
4. Displays the message.
5. User continues with his work ahead.

[![Image 1 for Dependency Injection (DI) vs. Inversion of Control (IOC)](https://3.bp.blogspot.com/-Sb34Uxuvjmk/UZCCb_05h1I/AAAAAAAAEgA/qOSoSUw04e0/s1600/1st+image.jpg)](http://3.bp.blogspot.com/-Sb34Uxuvjmk/UZCCb_05h1I/AAAAAAAAEgA/qOSoSUw04e0/s1600/1st+image.jpg)

Now if you analyze the program flow closely, it’s sequential. The program is in control of himself. Inversion of control means the program delegates control to someone else who will drive the flow. For instance if we make the chat application event based then the flow of the program will go something as below:-

1. End user sends chat message.
2. User continues with his work ahead.
3. Application listens to events. If a message arrives event is activated and message is received and displayed.

[![Image 2 for Dependency Injection (DI) vs. Inversion of Control (IOC)](https://3.bp.blogspot.com/-4Y4krJiAn0U/UZCCxNPNDjI/AAAAAAAAEgI/p1bqKzyZPw4/s1600/2nd+image.jpg)](http://3.bp.blogspot.com/-4Y4krJiAn0U/UZCCxNPNDjI/AAAAAAAAEgI/p1bqKzyZPw4/s1600/2nd+image.jpg)

If you see the program flow it’s not sequential, its event based. So now the control is inverted. So rather than the internal program controlling the flow, events drive the program flow. Event flow approach is more flexible as their no direct invocation which leads to more flexibility.

A word of caution here, do not conclude that IOC are implemented by only events. You can delegate the control flow by callback delegates, observer pattern, events, DI (Dependency injection) and lot of other ways.

The above approach makes code more flexible as the caller is not aware of the object methods and the object is not aware of caller program flow.

[![Image 3 for Dependency Injection (DI) vs. Inversion of Control (IOC)](https://1.bp.blogspot.com/-2JkcEGnJVrY/UZCDAoPjk8I/AAAAAAAAEgQ/ilz1zM5fc78/s1600/3rd+image.jpg)](http://1.bp.blogspot.com/-2JkcEGnJVrY/UZCDAoPjk8I/AAAAAAAAEgQ/ilz1zM5fc78/s1600/3rd+image.jpg)

DI provides objects that an object needs. So rather than the dependencies construct themselves they are injected by some external means. For instance let’s say we have the following below class “Customer” who uses a “Logger” class to log errors. So rather than creating the “Logger” from within the class, you can inject the same via a constructor as shown in the below code snippet.

[![Image 4 for Dependency Injection (DI) vs. Inversion of Control (IOC)](https://4.bp.blogspot.com/-vUOcNsQcrUk/UZCDROepyWI/AAAAAAAAEgY/8NbtFggPfh4/s400/4th+image.jpg)](http://4.bp.blogspot.com/-vUOcNsQcrUk/UZCDROepyWI/AAAAAAAAEgY/8NbtFggPfh4/s1600/4th+image.jpg)

The biggest benefit achieved by the above approach is “Decoupling”. You can now invoke the customer object and pass any kind of “Logger” object as shown in the below code.

```
Customer obj = new Customer(new EmailLogger());
Customer obj1 = new Customer(new EventViewerLogger());
```

So summarizing the differences. 

**Inversion of control** :- It’s a generic term and implemented in several ways (events, delegates etc).

**Dependency injection** :- DI is a subtype of IOC and is implemented by constructor injection, setter injection or method injection.

### JMS

Java message service enables loosely coupled communication between two or more systems. It provides reliable and asynchronous form of communication. There are two types of messaging models in JMS.

* Point-to-Point Messaging Domain

  ![](C:\codebase\github\interview-prep\img\jms-pointToPoint.gif)

* Publish/Subscribe Messaging Domain

  ![](C:\codebase\github\interview-prep\img\jms-publishSubscribe.gif)



**Message Sender**

Message Sender object is created by a session and used for sending messages to a destination queue. It implements the MessageProducer interface. 

![](C:\codebase\github\interview-prep\img\jms-programmingModel.gif)

```java
public class MessageSender {
 public static void main(String[] args) {
  Connection connection = null;
  try {
   Context ctx = new InitialContext();

   ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");

   connection = cf.createConnection();

   Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

   Destination destination = session.createQueue("test.message.queue");

   MessageProducer messageProducer = session.createProducer(destination);

   MapMessage message = session.createMapMessage();

   message.setString("Name", "Tim");
   message.setString("Role", "Developer");
   message.setDouble("Salary", 850000);

   messageProducer.send(message);

  } catch (Exception e) {
   System.out.println(e);
  } finally {
   if (connection != null) {
    try {
     connection.close();
    } catch (JMSException e) {
     System.out.println(e);
    }
   }
   System.exit(0);
  }
 }
}
```

**Message Reciever**

Message Receiver object is created by a session and used for receiving messages from a queue. It implements the MessageProducer interface. In case of receiver, we use a Message Listener.  Listener remains active and gets invoked when the receiver consumes any message from the broker. 

```java
public class MessageReceiver {
 public static void main(String[] args) {
  try {
   InitialContext ctx = new InitialContext();

   ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");

   Connection connection = cf.createConnection();

   Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

   Destination destination = session.createQueue("test.prog.queue");

   MessageConsumer consumer = session.createConsumer(destination);

   consumer.setMessageListener(new MapMessageListener());
   connection.start();
  } catch (Exception e) {
   System.out.println(e);
  }
 }
}
```

**MapMessage**

```java
public class MapMessageListener implements MessageListener {
 public void onMessage(Message message) {
  if (message instanceof MapMessage) {
   MapMessage mapMessage = (MapMessage) message;

   try {
    String name = mapMessage.getString("Name");
    System.out.println("Name : " + name);
   } catch (JMSException e) {
    throw new RuntimeException(e);
   }
  } else {
   System.out.println("Invalid Message Received");
  }
 }
}
```



### SOLID Principles

* [Single responsibility principle](https://en.wikipedia.org/wiki/Single_responsibility_principle) 

  A [class](https://en.wikipedia.org/wiki/Class_(computer_programming)) should only have a single responsibility, that is, only changes to one part of the software's specification should be able to affect the specification of the class.

  ```java
  public class Person
  {
      private Long personId;
      private String firstName;
      private String lastName;
      private String age;
      private List<Account> accounts;
  }
  public class Account
  {
      private Long guid;
      private String accountNumber;
      private String accountName;
      private String status;
      private String type;
  }
  ```

  

* [Open–closed principle]()

  "Software entities ... should be open for extension, but closed for modification."

  Not change core logic and request processing, but modify the desired application flow just by extending some classes

  ```java
  public class HelloWorldAction extends Action
  {
      @Override
      public ActionForward execute(ActionMapping mapping,
                                  ActionForm form,
                                  HttpServletRequest request,
                                  HttpServletResponse response)
                                  throws Exception
      {
           
          //Process the request
   
      }
  }
  ```

  

* [Liskov substitution principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle) 

  "Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program." See also [design by contract](https://en.wikipedia.org/wiki/Design_by_contract).

* [Interface segregation principle](https://en.wikipedia.org/wiki/Interface_segregation_principle)

  "Many client-specific interfaces are better than one general-purpose interface."

   Developer Alex created an interface `Reportable` and added two methods `generateExcel()` and `generatedPdf()`. Now client ‘A’ wants to use this interface but he intend to use reports only in PDF format and not in excel. Will he be able to use the functionality easily?

  NO. He will have to implement both the methods, out of which one is extra burden put on him by designer of software. Either he will implement another method or leave it blank. This is not a good design.

* [Dependency inversion principle]()

  One should "depend upon abstractions, [not] concretions."

  The classical use of this principle of `bean configuration` in Spring framework.

  

## Collections Framework

### Sorting

![](C:\codebase\github\interview-prep\img\comparision_of_sorting_algorithms.png)

### Maps

![](C:\codebase\github\interview-prep\img\HashMap vs TreeMap vs LinkedHashMap.png)



### Blocking Queue

![](C:\codebase\github\interview-prep\img\blockingqueue.png)

### Points to remember

* Arrays.asList(array) - **Returns a fixed-size list backed by the specified array, You can't add
  to it; you can't remove from it. You can't structurally modify the List.**
* You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the general contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with all hash-based collections, including HashMap, HashSet, and Hashtable. – [here](https://stackoverflow.com/questions/2265503/why-do-i-need-to-override-the-equals-and-hashcode-methods-in-java) [here](https://www.geeksforgeeks.org/equals-hashcode-methods-java/). 
* During the execution of the application, if hashCode() is invoked more than once on the same Object then it must consistently return the same Integer value, provided no information used in equals(Object) comparison on the Object is modified. 



## Java EE

### JAR vs WAR vs EAR

Jar: Contains Java Class Files

War: Contain web technology related files

Ear: contains all type of files

### Web Application

Contains only web related technologies like JSP’s, Servlets, html, css, js

### Enterprise Application

Contains all related J2EE technologies 

### Web Server

Server used to deploy applications. Ex: Tomcat

### Application Server

Server used to deploy Enterprise applications Ex: Web logic

### Building Tools

Manifest, Gradle, ANT

### SOAP vs REST vs RPC



## SQL vs NoSQL



| RDBMS                                                        | NoSQL                                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Structured Data                                              | Unstructured Data                                            |
| Highly Matured and standardized                              | Not so mature and different NoSQL DB’s have different standards |
| When the data must be consistent without leaving room for error when using a relational database | When our budget won’t allow large devices and must be put into lower performance devices |
|                                                              | When the datastructures we manage are variable               |
|                                                              | For analyzing large quantities of data in read mode only     |
|                                                              | Event capture and processing                                 |
|                                                              | Online stores with complex intelligence engines              |



## OSI Model

