# StrategyPattern

  The Strategy Pattern
 
  The SP defines a family of algorithms, encapsulates each one, and makes them interchangeable.
  Strategy lets the algorithm vary independently from clients that use it.
 
  Pitfalls of inheritance and interfaces:
  Child classes inherit from parent class. Not all child classes need methods defined in the parent class.
  We have to override those methods and write code that will block them from an inappropriate usage.
  When objects have different behavior inheritance becomes useless.
  Interfaces don’t solve the problem. We’ll have to create a lot of interfaces (there is a lot of kinds of behavior). We can’t reuse code.

  Design Principle #1: “Encapsulate What Varies”
 
  •	If some aspect of code is changing, that’s a sign you should pull it out and separate it.
  •	By separating out the parts of your code that vary, you can extend or alter them without affecting the rest of your code
 
  This principle is fundamental to almost every design pattern
 
  Design Principle #2 “Program to an interface, not to an implementation”
 
  We move what changes in separate interfaces, for each of those interfaces we create subclasses with concrete implementation of the behavior.
  In parent class we create instances of those parent interfaces. It is a “has-a” relationship.
  Every subclass will have their behavior that will be determined  by the concrete instance of an interface.
 
  Design Principle #3 “Favor composition over inheritance”
