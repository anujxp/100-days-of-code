Got it ✅
Here’s a **clean and professional README.md content** (not a post-style one) — formatted exactly like your previous day files for GitHub.
It explains each concept clearly with short descriptions, examples, and headings — perfect for your **Day 12: Exception Handling in Java**.

---

# 🧩 Day 12 – Exception Handling in Java

## 🔹 What is an Exception?

An **Exception** is an event that disrupts the normal flow of a program.
It occurs during the execution of a program and can be handled using exception handling mechanisms.

**Why:** To prevent program termination and provide a meaningful response to runtime errors.
**How:** By using the `try`, `catch`, `finally`, `throw`, and `throws` keywords.

---

## 🔹 Keywords Used in Exception Handling

| Keyword     | Description                                                                                |
| :---------- | :----------------------------------------------------------------------------------------- |
| **try**     | Used to enclose the code that might throw an exception.                                    |
| **catch**   | Used to handle the exception thrown by the try block.                                      |
| **finally** | Used to execute important code such as closing resources, whether exception occurs or not. |
| **throw**   | Used to explicitly throw an exception.                                                     |
| **throws**  | Used in method declaration to indicate that method might throw an exception.               |

---

## 🔹 Exception vs Error

| Basis   | Exception                                                    | Error                                                           |
| :------ | :----------------------------------------------------------- | :-------------------------------------------------------------- |
| Nature  | Indicates conditions that a program should catch and handle. | Indicates serious problems that are not handled by the program. |
| Type    | Checked and Unchecked                                        | Runtime only                                                    |
| Example | `IOException`, `ArithmeticException`                         | `OutOfMemoryError`, `StackOverflowError`                        |

---

## 🔹 Types of Exceptions

1. **Checked Exceptions** – These are checked at compile time.
   Examples: `IOException`, `SQLException`.
2. **Unchecked Exceptions** – These occur at runtime.
   Examples: `ArithmeticException`, `NullPointerException`.

---

## 🔹 Multiple Catch Blocks

Java allows multiple catch blocks for a single try block to handle different exception types.

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} catch (Exception e) {
    System.out.println("General Exception");
}
```

👉 Always write **specific exceptions first**, followed by **general exceptions**.

---

## 🔹 Custom Exception Class

A user-defined exception can be created by extending the `Exception` or `RuntimeException` class.

```java
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
```

```java
public class CustomExceptionExample {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Not eligible to vote!");
        else
            System.out.println("Eligible to vote!");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

---

## 🔹 Real-Life Analogy

Exception handling in Java works like a **seatbelt in a car** —
it doesn’t stop an accident, but it prevents the system from crashing and keeps it safe.

---

## 🔹 Common Real-Life Scenarios

1. File not found → Handle using `FileNotFoundException`.
2. Wrong input type → Handle using `InputMismatchException`.
3. Database connection failure → Handle using `SQLException`.
4. Network error → Handle using `IOException`.

---

## 🔹 Best Practices

* Always handle specific exceptions first.
* Use `finally` or **try-with-resources** to release resources.
* Don’t use empty catch blocks.
* Create custom exceptions for business logic errors.

---

## 🔹 Summary

Exception Handling makes Java programs:

* More **robust**
* More **maintainable**
* More **user-friendly**

---

### ✅ Keywords Covered:

`try`, `catch`, `finally`, `throw`, `throws`, `checked exception`, `unchecked exception`, `custom exception`, `multiple catch block`, `Exception vs Error`

---

Would you like me to add **2 short coding exercises** (like “Handle multiple exceptions” and “Create a custom exception”) at the bottom so your GitHub README looks more practical and complete?
