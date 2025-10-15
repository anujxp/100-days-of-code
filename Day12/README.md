# Day 12 — Exception Handling in Java

Small examples demonstrating common exception-handling patterns in Java.
Files included:
- TryCatchFinallyDemo.java       — basic try/catch/finally flow
- MultipleCatchDemo.java         — multiple catch blocks for one try
- CheckedUncheckedDemo.java      — checked vs unchecked example
- ThrowThrowsDemo.java           — demonstrate throw and throws
- CustomExceptionDemo.java       — create and use a custom exception
- TryWithResourcesDemo.java      — try-with-resources example

## How to compile and run
From the folder that contains these `.java` files:

```bash
# compile all Java files
javac *.java

# run examples one by one
java TryCatchFinallyDemo
java MultipleCatchDemo
java CheckedUncheckedDemo
java ThrowThrowsDemo
java CustomExceptionDemo
java TryWithResourcesDemo



---

## ✅ Real-life Exception Handling Questions (with approach & solution hints)
Below are **practical, real-world problems** you can add to your repo (in `ExceptionQuizSolutions.md`) or use as issues/challenges. Each item includes the problem, approach, and which example file to look at for guidance.

### Q1 — File upload: missing file / corrupt file
**Problem:** Your app must read an uploaded CSV and parse user data — the file may be missing or unreadable.  
**Approach:** Use try-with-resources to open the file and catch `FileNotFoundException` and `IOException`. Provide a clear user-facing error message and log stacktrace. Optionally return a safe default or request re-upload.  
**Example:** see `TryWithResourcesDemo.java` and `CheckedUncheckedDemo.java`.

### Q2 — User input: invalid number format
**Problem:** A user submits "ten" where you expect an integer.  
**Approach:** Wrap parsing in try-catch for `NumberFormatException`, return validation error to user, and preserve app flow.  
**Example:** see `MultipleCatchDemo.java`.

### Q3 — Payment processing: partial failure & rollback
**Problem:** During a payment transaction, a downstream API fails — you must rollback DB changes.  
**Approach:** Use try-catch around transaction boundaries. In `catch`, rollback and throw a custom exception (e.g., `PaymentFailedException`) to the caller. Use finally or transaction management framework to ensure commit/rollback.  
**Files:** implement using pattern from `CustomExceptionDemo.java` (create a `PaymentFailedException`) and integrate with DB transaction API (example not included but guidance provided).

### Q4 — API timeout / network failures
**Problem:** Remote call times out intermittently.  
**Approach:** Catch `SocketTimeoutException`/`IOException`, implement retry strategy with backoff, or gracefully degrade functionality and log. Use checked exception handling to ensure retries are attempted where safe.

### Q5 — Invalid business rule
**Problem:** An order with negative quantity is submitted (business rule violation).  
**Approach:** Validate inputs early and throw a custom checked or unchecked exception (`InvalidOrderException`), which the REST controller maps to a 4xx response.  
**Example:** `CustomExceptionDemo.java`.

### Q6 — Unexpected null pointer
**Problem:** `NullPointerException` appears deep in stack trace.  
**Approach:** Defensive programming — perform null checks, use `Optional` where appropriate, and catch `NullPointerException` only if you can meaningfully recover. Prefer preventing `NPE` rather than catching it.

---

## Tips for adding to GitHub
1. Create the folder `day12` and add the `.java` files and `README.md`.  
2. Run `javac *.java` locally to verify compilation.  
3. Commit in two steps as described in the README to increase contribution count.  
4. Add short descriptions in each commit message like `Day12: exception basics` and `Day12: custom exceptions & resources`.

---

If you want I can:
- Provide **one-line `tee` commands** to create each file from the terminal (so you can generate files quickly), or  
- Bundle these into a `.zip` and provide a download link, or  
- Produce a short **LinkedIn caption** that points to your GitHub Day12 folder.

Which of these next steps would help you most?
