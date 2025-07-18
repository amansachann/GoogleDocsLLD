# 📄 Java Document Editor – Bad vs Good LLD Design

This project demonstrates both **bad** and **good low-level design (LLD)** implementations of a simple Document Editor in plain Java. It highlights the importance of writing clean, maintainable code using **Object-Oriented Programming (OOP)** principles and **SOLID** design.


---

## ❌ Bad Design Overview (`BadCode/DocumentEditor.java`)

The bad design mixes different types of content (text and images) in a single list and uses **string suffixes** like `.jpg` or `.png` to detect image elements during rendering.

### 🔍 Problems:
- ❌ Violates **Single Responsibility Principle**
- ❌ Uses **string-based type inference** instead of actual types
- ❌ Not extensible to support other content types
- ❌ Difficult to test and maintain

### 🧪 Sample Output
```
Hello, world!
[Image: logo.png]
Thanks for reading.
```

---

## ✅ Good Design Overview (`GoodCode/DocumentEditor.java`)

The good design uses **polymorphism** and **clean abstraction** with a `DocumentElement` interface to represent different types of elements like `TextElement` and `ImageElement`.

### 📦 Components:
| Class               | Responsibility                              |
|---------------------|----------------------------------------------|
| `DocumentEditor`    | Holds document elements and renders them     |
| `DocumentElement`   | Interface representing a renderable element  |
| `TextElement`       | Represents a block of text                   |
| `ImageElement`      | Represents an image with a path              |

### 💎 Benefits:
- ✅ Clean and modular
- ✅ Extensible without modifying existing code (Open/Closed Principle)
- ✅ Uses proper **polymorphism**
- ✅ Easy to add new element types like tables, videos, etc.

---

## 🚀 How to Run

1. Clone the repo or copy the code into your Java IDE
2. Run the appropriate `main()` method:

```java
com.codewithaman.BadCode.Main     // Demonstrates bad design
com.codewithaman.GoodCode.Main    // Demonstrates good design
```
3. Output is printed to console and saved in `document.txt`
---
## 🙌 Acknowledgments
Built with ❤️ by [Aman Sachan](https://github.com/amansachann) to demonstrate the difference between poor and good software design.