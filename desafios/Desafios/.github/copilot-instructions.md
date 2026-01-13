# Copilot Instructions for DIO Java Challenges

## Project Overview
This is a basic Java learning project from DIO's Java trail (`dio-trilha-java-basico`), focused on solving programming challenges. The codebase contains Java applications designed to practice fundamental concepts like input handling, control flow, and basic algorithms.

## Codebase Architecture

### Folder Structure
- **`src/`** — Java source files (main entry points for challenges)
- **`bin/`** — Compiled `.class` files (auto-generated, do not edit)
- **`lib/`** — External dependencies (JAR files)
- **`.vscode/`** — VS Code project settings (Java paths configured)

### Key Configuration
All Java compilation uses VS Code's built-in Java support. The project paths are configured in `.vscode/settings.json`:
- Source: `src/`
- Output: `bin/`
- Dependencies: `lib/**/*.jar`

## Development Workflow

### Compiling & Running
- **Compile**: Use VS Code's **"Run Java"** button or the Java extension's compile command
- **Run**: Right-click on any file with `public static void main()` and select **"Run"** or use the play button
- **No build tool**: This project uses direct Java compilation (no Maven/Gradle), so compile directly from VS Code

### Challenge Pattern
Each challenge file (e.g., `Multiplication.java`) follows this structure:
```java
import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Challenge logic here
    }
}
```

**Key pattern**: Use `Scanner` for reading input from console. Always close or use try-with-resources for resource management in production.

## Conventions & Patterns

1. **Class naming**: PascalCase, matching the filename (e.g., `Multiplication.java` → `public class Multiplication`)
2. **Main method required**: Every challenge must have `public static void main(String[] args)` to be executable
3. **Input handling**: Use `Scanner(System.in)` for console input (available since Java 5)
4. **Single class per file**: Each challenge is typically one class per file

## Common Tasks

- **Add a new challenge**: Create a new `.java` file in `src/` with a class containing `main()` method
- **Test input/output**: Run the file directly; console will prompt for input
- **Debug**: Use VS Code's Debug panel (breakpoints, step through code) with the Java debugger

## References
- [VS Code Java Documentation](https://code.visualstudio.com/docs/languages/java)
- [Scanner Class Javadoc](https://docs.oracle.com/javase/11/docs/api/java.base/java.util/Scanner.html)
