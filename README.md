# Radix Sort (Java)

## 📌 Overview

**Radix Sort** is a **non-comparative sorting algorithm** that sorts numbers digit by digit, starting from the **least significant digit (LSD)** to the **most significant digit (MSD)**.

It uses **Counting Sort** as an intermediate stable sorting technique for each digit position.

---

## 🚀 Algorithm Used

**Radix Sort (LSD approach)**

### Key Idea:

* Sort numbers based on individual digits
* Process digits from right to left
* Maintain stability at each step

---

## 🧮 Time and Space Complexity

| Complexity Type | Value            |
| --------------- | ---------------- |
| Time            | `O(d × (n + k))` |
| Space           | `O(n + k)`       |

Where:

* `n` = number of elements
* `d` = number of digits in the largest number
* `k` = range of digits (0–9)

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or terminal

---

## 📂 Project Structure

```
RadixSort.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac RadixSort.java
   ```
2. Run the program:

   ```bash
   java RadixSort
   ```

---

## 📋 Program Options

```
1. Sort an Array
2. Exit
```

---

## ⌨️ Input Format

* Enter number of elements
* Enter **non-negative integers** only

---

## ✅ Sample Input

```
Number of elements: 8
Elements: 170 45 75 90 802 24 2 66
```

---

## 📤 Sample Output

```
Original Array: 170 45 75 90 802 24 2 66
Sorted Array:   2 24 45 66 75 90 170 802
```

---

## 🧠 Key Concepts

* Non-comparative sorting
* Stable sorting algorithm
* Digit-based processing
* Counting Sort integration

---

## 🔧 Limitations

* Works only with **non-negative integers**
* Not suitable for floating-point numbers without modification

---

## 📚 Applications

* Sorting large datasets of integers
* Postal code sorting
* Numerical data processing
* Specialized high-performance systems

---

## 📝 License

Free to use for academic, lab, and interview preparation purposes.


