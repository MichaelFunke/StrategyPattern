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

  In this example there is an abstract parent class Computer. Child classes PC, Laptop and Smartphone inherit from it. They implement  common behavior (methods) of the parent class: powerOn(); powerOff().
  Some behavior vary. This behavior is encapsulated in the interface UserInteractionBehavior.  For each "Computer" a class with concrete realization of the behavior is created: TapScreenInteraction,
  TapTouchPadInteraction, ClickMouseInteraction. All these classes implement the UserInteractionInterface.
  - In parent class Computer we created an instance of the UserInteractionBehavior interface and method which calls a method of the interface via it's instance:
  performInteraction(){userInteractionBehavior.interactWithUser();}
  - When we create an instance of a concrete class, Laptop for example, in its constructor the instance of the interface is initialized with a class describing the appropriate behavior
  Laptop() {userInteractionBehavior = new TapTouchPadInteraction();}. And when we call method of the parent class performInteraction().

  QUESTIONS:
  - In the abstract class Computer we create an instance of the interface and then initialize this instance from the child class constructor using
  a class that implements that interface and it's methods. Somehow strange.
  - Why Computer class should be abstract? (It seems that we use it as abstract, because  we don't want to put the concrete realization of it's methods.
  When we delete "abstract" the methods want their bodies back. "Abstract" means without concrete implementation.
  "My only purpose is to show you the road (i'm a map if you will), it's up to you to take a walk on it".)