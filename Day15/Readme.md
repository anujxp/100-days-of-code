# Day 15 — Multithreading in Java

## Overview
Multithreading lets a program perform multiple tasks concurrently within the same process. This is different from process-level multitasking (separate programs managed by the OS). Threads are lightweight units of execution that share the process memory, enabling highly responsive and high-throughput applications when used correctly.

---

## Core Concepts & Internal View
- **Thread vs Process**
  - Process: independent program with its own memory.
  - Thread: lightweight execution unit within a process; shares memory with other threads in the same process.

- **CPU Scheduling & Parallelism**
  - True parallelism depends on CPU cores and scheduling.
  - Time-slicing strategies (e.g., Round Robin) give each thread a time quantum; OS/JVM scheduler switches between threads to share CPU.

- **Thread Lifecycle**
  1. **New** — created but not started.
  2. **Runnable** — ready and waiting for CPU.
  3. **Running** — executing on CPU.
  4. **Blocked / Waiting** — sleeping, waiting for IO or monitor.
  5. **Terminated** — finished running.

- **Stack & Heap**
  - Each thread gets its own stack (local variables and call frames).
  - All threads share the heap (objects), which requires synchronization when concurrent access happens.

---

## Why Multithreading?
- Improve responsiveness (UI apps, servers).
- Utilize multiple CPU cores for compute-intensive tasks.
- Run background jobs without blocking main flow (file downloads, logging, monitoring).

---

## Synchronization & Safety
- When multiple threads access shared data, data races and inconsistent state can occur.
- Use `synchronized`, locks, or higher-level concurrency utilities (`java.util.concurrent`) to protect shared state.
- Prefer immutable data or thread-local state when appropriate.

---

## Real-life Example (Delivery Company analogy)
Imagine a delivery company:
- **Process** = the company.
- **Thread** = a delivery truck.
- The dispatcher (CPU scheduler) assigns parcels (tasks) to trucks.
- Each truck executes deliveries independently; sometimes they need to access a shared garage (synchronized resource) — only one truck at a time can use it.

This maps directly to server threads handling requests and synchronized blocks controlling access to shared resources.

---

## Use Cases & Example Files (what to look for)

1. **Simple thread creation — extends Thread**
   - File: `ThreadExtendsDemo.java`
   - Use case: quick background tasks or learning examples. Shows per-thread execution with `start()` and `run()`.

2. **Preferred pattern — implement Runnable**
   - File: `RunnableDemo.java`
   - Use case: decouples task from thread, suitable for reusing the same task with different thread management.

3. **Server-style concurrency — thread pool**
   - File: `ThreadPoolDemo.java`
   - Use case: handling many short-lived tasks (e.g., incoming web requests). Demonstrates `ExecutorService` and fixed thread pool to limit thread creation overhead.

4. **Protecting shared state — synchronization**
   - File: `SynchronizedCounterDemo.java`
   - Use case: counters, shared metrics, and any mutable shared state; shows `synchronized` keyword to avoid race conditions.

5. **Producer-Consumer pattern — coordination**
   - File: `ProducerConsumerDemo.java`
   - Use case: pipelines where producers generate work and consumers process it (e.g., log processors, streaming pipelines). Uses `wait()` / `notify()`.

6. **Tasks that return results — Callable & Future**
   - File: `CallableFutureDemo.java`
   - Use case: background computations that produce results (e.g., remote calls, heavy computations) that you need later.

---

## Practical Tips & Best Practices
- Prefer `Runnable` / `ExecutorService` over creating raw `Thread` instances in production code.
- Use thread pools to control concurrency and resource usage.
- Keep synchronized blocks small to reduce contention.
- Avoid sharing mutable state unless necessary — use concurrent collections (`ConcurrentHashMap`, `BlockingQueue`) where applicable.
- Consider higher-level constructs from `java.util.concurrent` (Locks, Semaphores, Executors, Streams parallelism) for complex scenarios.

---

## Short Reflection
Multithreading is powerful but introduces complexity. Start with simple patterns, protect shared state carefully, and use the standard concurrency utilities rather than reinventing synchronization logic.

---

### Files included
- ThreadExtendsDemo.java
- RunnableDemo.java
- ThreadPoolDemo.java
- SynchronizedCounterDemo.java
- ProducerConsumerDemo.java
- CallableFutureDemo.java

