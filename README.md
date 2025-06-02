

---

# 🔎 2D Array Element Search

This Java project demonstrates how to search for a specific element within a two-dimensional array provided by the user. The code is organized into multiple classes across the `Array2D` package for clarity and modularity.

## 📋 Project Structure

* **`UtilityClass`**: Handles input of the 2D array dimensions and elements from the user.
* **`IsFoundElementCode`**: Contains the method to search for a number in the 2D array.
* **`MainClass2D`**: The main driver class that integrates input and searching logic.

## 🚀 How to Run

### Prerequisites

* Java installed (JDK 8 or higher)

### Steps

1. Create a folder named `Array2D` and place the following Java files inside it:

   * `IsFoundElementCode.java`
   * `MainClass2D.java`
   * `UtilityClass.java`
2. Open terminal/command prompt and navigate to the directory containing the `Array2D` folder.
3. Compile the classes:

   ```bash
   javac Array2D/*.java
   ```
4. Run the main program:

   ```bash
   java Array2D.MainClass2D
   ```

## 💡 Sample Usage

```
Enter Number of Rows: 2
Enter Number of Columns: 3
Enter element of Rows 1 and Columns 1: 5
Enter element of Rows 1 and Columns 2: 8
Enter element of Rows 1 and Columns 3: 12
Enter element of Rows 2 and Columns 1: 7
Enter element of Rows 2 and Columns 2: 9
Enter element of Rows 2 and Columns 3: 3
Enter Number You Want To Search: 9
Number Found
```

## 🧠 Concepts Used

* 2D arrays
* Nested loops
* Modular programming using multiple classes and packages
* User input handling with `Scanner`
