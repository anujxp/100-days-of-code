# Day 16 — Synchronization & Deadlock (Notes)

## Overview
Synchronization ensures **thread safety** when multiple threads access shared resources. Deadlock is a failure mode where two or more threads wait forever for locks held by each other. Inter-thread communication (wait/notify/notifyAll) and coordination methods like `join()` let threads cooperate safely.

---

## Key Concepts

### Thread Safety (in one line)
**Thread safety**: ensuring correct behavior when multiple threads access and modify shared data concurrently.

### Synchronization (what, why, how)
- **What:** a mechanism that allows only one thread to execute critical code that accesses shared state.
- **Why:** to prevent data races and inconsistent state (e.g., lost updates in counters, incorrect balances).
- **How:** using `synchronized` (methods or blocks), explicit locks (`ReentrantLock`), or higher-level concurrent utilities.

### Locking model
- A synchronized block/method uses an object's monitor (lock).
- A thread must acquire the lock before entering the synchronized region; other threads wait.
- Locks should be held for as short a time as possible to reduce contention.

---

## Deadlock (quick)
- **Definition:** a situation where two or more threads are waiting indefinitely for each other's locks.
- **How it occurs:** circular waiting + mutual exclusion + hold-and-wait conditions.
- **Example cause:** Thread A holds Lock1 and waits for Lock2 while Thread B holds Lock2 and waits for Lock1.
- **Prevention strategies:** acquire locks in a consistent order, use `tryLock()` with timeout, reduce lock scope, prefer immutable data or lock-free algorithms.

---

## Inter-thread Communication
- `wait()` → makes the current thread release the monitor and wait until another thread calls `notify()` or `notifyAll()` on the same object.
- `notify()` → wakes one waiting thread (choice is JVM dependent).
- `notifyAll()` → wakes all waiting threads.
- `join()` → causes current thread to wait until the target thread completes.

Use `wait()`/`notify()` inside synchronized context (monitor must be held).

---

## Real-life Example (Banking & Bathroom analogies)
- **Banking example (synchronization):** multiple tellers updating the same customer balance must synchronize so withdrawals/deposits don't corrupt the balance.
- **Bathroom analogy (synchronization):** one key to the bathroom — only one person uses it at a time.
- **Deadlock analogy:** two people each hold a single tool and wait for the other's tool — neither proceeds.

---

## Use-cases mapped to code examples
- `SynchronizedExample.java` — protecting shared counters/account balances using `synchronized`.
- `DeadlockExample.java` — intentional deadlock demonstration to learn how to detect and reason about stuck threads.
- `WaitNotifyDemo.java` — producer/consumer coordination using `wait()` and `notify()`.
- `JoinDemo.java` — sequencing threads using `join()`.
- `ThreadPoolExample.java` — using `ExecutorService` (thread pool) to manage worker threads efficiently.
- `TryLockAvoidDeadlockDemo.java` — using `ReentrantLock.tryLock()` pattern to avoid deadlocks.

---

## Best Practices & Tips
- Prefer higher-level concurrency utilities (`ExecutorService`, `BlockingQueue`, `ConcurrentHashMap`) over raw `synchronized` in complex apps.
- Keep synchronized sections minimal — avoid heavy computation while holding locks.
- Acquire multiple locks in a consistent global order to avoid circular waits.
- Use `tryLock()` with timeout to detect and recover from potential deadlocks.
- Use immutable objects or thread-local variables when possible to avoid sharing mutable state.
- Use thread dumps / profilers to detect deadlocks (look for threads in BLOCKED/WAITING with circular lock ownership).

---

## Short reflection
Synchronization gives you safety; misuse or overuse gives you deadlocks and poor scalability. Aim for small critical sections, prefer concurrent collections and executors, and design with lock ordering and failure recovery in mind.
