# StrategyPattern

  The Strategy Pattern
 
  The SP defines a family of algorithms, encapsulates each one, and makes them interchangeable.
  Strategy lets the algorithm vary independently from clients that use it. 
  
  The SP (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime.
  Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.
 
  Pitfalls of inheritance and interfaces:
  Child classes inherit from parent class. Not all child classes need methods defined in the parent class.
  We have to override those methods and write code that will block them from an inappropriate usage.
  When objects have different behavior inheritance becomes useless.
  Interfaces don’t solve the problem. We’ll have to create a lot of interfaces (there is a lot of kinds of behavior). We can’t reuse code.

 In this example there is an abstract parent class Computer. Child classes PC, Laptop and Smartphone inherit from it. They implement  common behavior (methods) of the parent class: powerOn(); powerOff(). Some behavior vary. This behavior is encapsulated in the interface UserInteractionBegavior.  For each class 
