🧠 Day 9 — Deep Dive into OOP (Encapsulation, Inheritance & Abstraction)

After learning about methods and object creation in Java, today was all about exploring the core pillars of Object-Oriented Programming (OOP) — the foundation of clean and modular Java design.

🔒 Encapsulation

Encapsulation means wrapping data (variables) and code (methods) together into a single unit — the class.
It protects data from unauthorized access using access modifiers like private, public, and protected.

Why Encapsulation?

Hides internal implementation details.

Ensures data security and controlled access through getters/setters.

Promotes code reusability and maintainability.

How it works:

Declare variables as private.

Provide public getter and setter methods to access and modify them.

🧬 Inheritance

Inheritance is about reusing and extending existing code.
It allows a new class (child) to inherit properties and methods from an existing class (parent).

Why Inheritance?

Promotes code reuse.

Improves readability and maintainability.

Supports hierarchical relationships between classes.

How it works:

Use the extends keyword.

Access parent methods and variables directly in the child class.

Example:
A Car class can inherit from a general Vehicle class — reusing attributes like speed, fuel, and methods like start() or stop().

Access Modifiers in Inheritance:

private → Not accessible outside the class.

default → Accessible within the same package.

protected → Accessible in subclasses (even in different packages).

public → Accessible everywhere.

🧩 Abstraction

Abstraction focuses on showing only essential features and hiding unnecessary details.
It helps simplify complex systems by exposing only what’s relevant.

Why Abstraction?

Reduces complexity.

Increases flexibility and maintainability.

Makes the design more modular and easy to extend.

How it works:

Using abstract classes (partial abstraction).

Using interfaces (full abstraction — covered tomorrow).

🔹 Types of Abstraction:

Concrete Class → Fully implemented.

Partial Abstraction → Using abstract classes (some methods are abstract).

Full Abstraction → Using interfaces (all methods abstract — until Java 8).

🧠 Reflection

Encapsulation keeps your data safe,
Inheritance helps you reuse code,
and Abstraction hides complexity —
together, they form the backbone of OOP design.

Tomorrow, we’ll explore Polymorphism and Interfaces — how Java achieves flexibility through dynamic behavior. ⚡

📁 Files Included

EncapsulationDemo.java

InheritanceDemo.java

AbstractionDemo.java (optional if you add abstraction example later)

🏷️ Tags

#100DaysOfCode #Java #OOP #Encapsulation #Inheritance #Abstraction #LearnJava #DeveloperGrowth #CodeWithAnuj
