# Tasca 09 - Enums , Date and Records 

**Description**: A collection of practical exercises focused on writing cleaner, safer, and more modern Java code. The project covers the use of **Enums** for representing finite values with encapsulated behavior and the **Java Time API** (`java.time`) for robust temporal data manipulation without the pitfalls of the legacy Date class.

## 📌 Problem Statement

### Level 1: Enums
The goal is to move away from using Strings or Integers for fixed options and utilize Enums for type safety.
* Create a `Day` enum and determine if a day is a workday or weekend.
* Create a `Level` enum (`LOW`, `MEDIUM`, `HIGH`) containing an internal property (Color) and specific behavior.
* Implement a `Task` class that modifies its output based on the assigned `Level`.
* Implement safe conversion from `String` (user input) to `Enum`, handling `IllegalArgumentException`.

### Level 2: Date & Time API
The goal is to master the Java 8+ Time API.
* Display current dates using `LocalDate`, `LocalTime`, and `LocalDateTime`.
* Calculate the difference between dates using `Period`.
* Perform date math: Add/Subtract days, months, and hours (Immutable operations).
* Format dates using `DateTimeFormatter` (custom patterns).
* Compare dates (`isBefore`, `isAfter`).
* **Appointment Scheduler:** Create a system to store appointments and filter/show only upcoming ones using Streams.

## ✨ Features

* **Type Safety:** Prevents invalid values by using strong typing with Enums.
* **Encapsulation:** Logic and properties (e.g., colors) are stored directly inside the Enum constants.
* **Robust Input Handling:** Safe parsing of user strings into Enum constants using `try-catch` blocks.
* **Immutable Date Logic:** Uses `java.time` classes which are thread-safe and immutable.
* **Stream Processing:** Filters future appointments efficiently using Java Streams.
* **Custom Formatting:** Displays dates in human-readable formats (e.g., "Fri, 24 de March de 2028").

## 🛠 Technologies
-   **Language:** Java SE (JDK 17+)
-   **IDE:** IntelliJ IDEA / Eclipse
-   **Build Tool:** Maven / Gradle (Optional)

## 🚀 Installation & Execution

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/java-enums-dates.git](https://github.com/your-username/java-enums-dates.git)
    ```

2.  **Environment Variables:**
    * Not applicable for this console-based application.

3.  **Run the Application:**
    * **Level 1:** Run `nivell1.app.Main` to test Enums and user input.
    * **Level 2:** Run `nivell2.app.Main` to test Date calculations and the Schedule Demo.

4.  **Testing:**
    The application runs via standard console output. Verify the logs in your terminal to ensure logic correctness.

## 📸 Demo

### Level 1 Output (Enums)
```text
MONDAY es laborable.
SATURDAY es cap de setmana.

Task Task04 is level Red
Task Task05 is level Yellow

Please enter your task level: LOW, MEDIUM, or HIGH
> LOW
You chosen level LOW
