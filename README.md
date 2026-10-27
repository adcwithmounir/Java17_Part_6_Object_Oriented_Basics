<div align="center">

# ☕ Java SE 17 — Part 6: Object-Oriented Basics

### Master inheritance, constructors & abstract classes and prepare for the OCP 1Z0-829 certification

**Source code for the video course by _ADC with Mounir_**

[![Java](https://img.shields.io/badge/Java-SE%2017-58A6FF?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![YouTube](https://img.shields.io/badge/Watch%20on-YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://tinyurl.com/java17objectorientedbasics)

</div>

---

## 📖 About this repository

This repository contains **all the code examples** shown in **Part 6 — Object-Oriented Basics** of the *Java SE 17 Full Course* on the **ADC with Mounir** YouTube channel.

Every folder matches one video. Open the folder, follow along with the video, run the code, break it, fix it — that is the fastest way to really learn Java.

All examples are built around a **streaming-platform project** (`Content`, `Movie`, `Series`, `Episode`, `User`, `Subscription`, `StreamingPlatform`, `ContentType`…) instead of abstract `Animal` / `Dog` examples, so every concept has a real, meaningful context: a `Movie` and a `Series` that both extend `Content`, constructors that chain with `this()` and `super()`, an abstract `Content` class that forces every subclass to define how it plays, and an immutable `Subscription` that nobody can tamper with.

---

## 🎯 Who is this for?

| | Profile | How to use this repo |
|---|---|---|
| 🟢 | **Beginners who finished Parts 1–5** — comfortable with variables, methods and basic classes | Follow the folders in order, one video at a time |
| 🔵 | **Developers coming from JavaScript, Python, C# or Kotlin** | Jump to the topics you need — Java's constructor and initialization rules have their own quirks |
| 🟠 | **OCP 1Z0-829 candidates** | Focus on the 🎓 exam traps and practice questions in each video — constructor chaining, initialization order and overriding rules are heavily tested |

---

## 🗂️ Course content

| # | Folder | Video topic | What you'll learn | Status |
|:-:|---|---|---|:-:|
| 1 | [`Part_6_1_Object_Oriented_Basics`](./Part_6_1_Object_Oriented_Basics) | **Building Class Families with Inheritance** | Parent and child classes, `extends`, single inheritance, `java.lang.Object` at the top of every hierarchy | ✅ |
| 2 | [`Part_6_2_Object_Oriented_Basics`](./Part_6_2_Object_Oriented_Basics) | **Writing Your Own Subclasses** | Class modifiers (`final`, `abstract`, `sealed`…), access to inherited members, the `this` and `super` references | 🔜 |
| 3 | [`Part_6_3_Object_Oriented_Basics`](./Part_6_3_Object_Oriented_Basics) | **Bringing Objects to Life with Constructors** | The default constructor, overloading constructors, chaining with `this()` and `super()`, the compiler's hidden `super()` | 🔜 |
| 4 | [`Part_6_4_Object_Oriented_Basics`](./Part_6_4_Object_Oriented_Basics) | **The Order Java Builds Your Objects In** | Static and instance initializers, class vs. instance initialization order, initializing `final` fields | 🔜 |
| 5 | [`Part_6_5_Object_Oriented_Basics`](./Part_6_5_Object_Oriented_Basics) | **Replacing Parent Behavior: Overriding & Hiding** | The overriding rules, covariant return types, hiding `static` methods and fields, `final` methods | 🔜 |
| 6 | [`Part_6_6_Object_Oriented_Basics`](./Part_6_6_Object_Oriented_Basics) | **Blueprints with Abstract Classes** | `abstract` classes and methods, the first concrete subclass, legal and illegal modifier combinations | 🔜 |
| 7 | [`Part_6_7_Object_Oriented_Basics`](./Part_6_7_Object_Oriented_Basics) | **Locking Down Objects with Immutability** | Building objects that never change: `private final` fields, no setters, defensive copies | 🔜 |
| 8 | NO LABS (see the video) | **Chapter Review & Practice Questions** | Summary, exam essentials and OCP-style practice questions | 🔜 |

> ✅ Available · 🔜 Coming soon — the repo is updated as new videos are released.

---

## 🎓 OCP 1Z0-829 objectives covered

- **Utilizing Java object-oriented approach**
  - Declare and instantiate Java objects, and explain the object life cycle
  - Create classes, and define and use instance and static fields and methods, constructors, and instance and static initializers
  - Understand variable scopes, apply encapsulation, and create immutable objects
  - Implement inheritance, including abstract types
  - Override methods, including those of the `Object` class

---

## 🧠 Quick reference — the rules you'll use all the time

### Overriding a method

| Rule | What it means | Streaming-platform example |
|---|---|---|
| Same signature | Same name, same parameter list | `play()` in `Content` → `play()` in `Movie` |
| Access: same or wider | A child can open access up, never close it down | `protected` in `Content` → `public` in `Movie` ✅ |
| No new or broader checked exceptions | The child can't throw more than the parent promised | Parent throws `IOException` → child throws `FileNotFoundException` ✅ |
| Covariant return type | The child may return a more specific type | `Content getNext()` → `Episode getNext()` in `Series` ✅ |
| `static` methods are hidden, not overridden | Which version runs depends on the reference type | `static Content featured()` in both parent and child |
| `final` methods can't be overridden | The parent locks the behavior | `final String getId()` in `Content` |

### The order Java builds an object

```text
1. Parent class is initialized   → static fields & static blocks, top to bottom (once)
2. Child class is initialized    → static fields & static blocks, top to bottom (once)
3. Parent instance is built      → instance fields & blocks, then the parent constructor
4. Child instance is built       → instance fields & blocks, then the child constructor
```

> 🎓 **Exam tip:** the first statement of every constructor is always a call to `this()` or `super()`. If you don't write one, the compiler adds `super()` for you — and if the parent has no no-argument constructor, your code won't compile.

---

## 🛠️ Prerequisites

- **JDK 17** installed ([Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17))
- A code editor — the course uses **VS Code** with the *Extension Pack for Java*, but any IDE works (IntelliJ IDEA, Eclipse…)
- Comfort with **classes, fields and methods** (covered in Parts 1 & 5)

Check your installation:

```bash
javac -version   # should print 17.x
java  -version   # should print 17.x
```

---

## 🚀 Getting started

```bash
# 1. Clone the repository
git clone https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics.git
cd Java17_Part_6_Object_Oriented_Basics

# 2. Open the folder of the video you are watching
cd Part_6_1_Object_Oriented_Basics
```

Each folder is independent. You can open it directly in VS Code, or compile and run from the terminal:

```bash
# Compile all the classes of the folder (Content, Movie, Series…)
javac *.java

# Run the class that has the main method (no .class extension!)
java StreamingPlatform

# Java 11+ shortcut — only works when everything is in a single file
java StreamingPlatform.java
```

> 💡 **Tip:** Add a `System.out.println` to every constructor and initializer block, then create a `Movie`. Predicting the output before you run it is the best way to master initialization order.

---

## 📺 Watch the course

| Resource | Link |
|---|---|
| 📃 Full Part 6 playlist | [tinyurl.com/java17objectorientedbasics](https://tinyurl.com/java17objectorientedbasics) |
| 📃 Part 1 playlist (start here if you're new) | [tinyurl.com/java17fundamental](https://tinyurl.com/java17fundamental) |
| 💻 Source code (this repo) | [github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics) |

---

## 🧭 Course roadmap

This repository is **Part 6** of a complete Java SE 17 course. Each part has its own repository.

| Part | Topic | Status |
|:-:|---|:-:|
| 1 | [Java Fundamentals / Core Syntax](https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax) | ✅ |
| 2 | Expressions & Computations | 🔜 |
| 3 | Control Flow & Conditionals | 🔜 |
| 4 | Essential Java Libraries | 🔜 |
| 5 | Functions & Parameters | 🔜 |
| 6 | [**Object-Oriented Basics**](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics) | 🟢 |
| 7 | Interfaces & Abstract Types | 🔜 |
| 8 | [Functional Programming](https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming) | ✅ |
| 9 | Data Structures & Type Safety | 🔜 |
| 10 | Data Processing Pipelines | 🔜 |
| 11 | Error Handling & i18n | 🔜 |
| 12 | Java Module System (JPMS) | 🔜 |
| 13 | Multithreading & Parallelism | 🔜 |
| 14 | File & Stream Operations | 🔜 |
| 15 | Database Connectivity | 🔜 |

---

## 📚 Recommended reading

This course is inspired by, and complements, the official study guide:

> **OCP Oracle Certified Professional Java SE 17 Developer Study Guide: Exam 1Z0-829**
> Scott Selikoff & Jeanne Boyarsky — Sybex

The course does not replace the book. All code, explanations and practice questions in this repository are original.

---

## 🤝 Contributing

Found a typo, a bug, or have an idea for a better example?
Feel free to [open an issue](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics/issues) or submit a pull request. Questions about the videos are welcome in the YouTube comments too.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE) — use the code freely to learn and practice.

---

<div align="center">

**⭐ If this repository helps you learn Java, give it a star — it helps other learners find it!**

Made with ☕ by **ADC with Mounir**

</div>
