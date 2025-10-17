# Day 13 — File Handling in Java

This folder contains short, focused examples demonstrating common file handling tasks in Java:
- `FileReadWriteDemo.java` — read/write text files with BufferedReader/BufferedWriter
- `TryWithResourcesNIODemo.java` — use java.nio Path/Files and try-with-resources
- `AppendAndRotateDemo.java` — append to logs and a tiny rotation example
- `DirectoryAndFileOperations.java` — directory creation, listing and deletion with NIO
- `ObjectSerializationDemo.java` — basic object serialization / deserialization

## Concept notes

**File Handling** allows Java programs to *create, read, write, append, move, and delete files or directories*. Use `java.io` for classic stream-based IO and `java.nio.file` (Paths/Files) for modern, efficient file operations.

**Common patterns**
- Use **try-with-resources** to auto-close streams.
- Prefer `java.nio.file.Files` and `Path` for ease and better performance.
- Catch and handle `IOException` and `FileNotFoundException` when performing disk I/O.
- Use serialization carefully — prefer JSON or other formats for cross-platform data exchange.

## Practical use-cases
- Logging events to files
- Reading configuration files
- Persisting simple datasets or reports
- Temporary files for intermediate processing

## Best practices
- Use small helper methods to wrap repetitive IO logic.
- Validate file paths and permissions before operations.
- Avoid storing secrets in plain files; use environment/config services.
- Use file rotation to prevent logs from growing indefinitely.
