# Design Patterns - Strategy & Observer

This document explains the **Strategy Pattern** and **Observer Pattern** using simple real-world examples and class diagrams.

---

# 1. Strategy Design Pattern

## Definition

The Strategy Pattern defines a family of algorithms, encapsulates each one and ,make them interchangeable. Strategy lets the algorithm vary independently from client that use it.

Instead of writing large `if-else` or `switch` statements to select behavior, the behavior is delegated to independent strategy classes.

---

## Problem It Solves

Consider an e-commerce application that supports multiple payment methods:

- UPI
- Credit Card
- PayPal
- Net Banking

A traditional implementation may use:

```text
if(paymentType == UPI)
else if(paymentType == CARD)
else if(paymentType == PAYPAL)
```

As new payment methods are added, the code becomes difficult to maintain and violates the Open-Closed Principle.

The Strategy Pattern moves each payment algorithm into its own class and allows the application to select the appropriate payment strategy at runtime.

---

## Real-World Example

### Google Maps Navigation

You want to travel from Bhopal to Indore.

Possible routes:

- Car Route
- Bike Route
- Walking Route
- Public Transport Route

The destination remains the same.

Only the route calculation algorithm changes.

Google Maps chooses the appropriate strategy based on user selection.

---

## Components

### Strategy

Defines a common interface for all algorithms.

Example:

```text
PaymentStrategy
```

---

### Concrete Strategies

Implement the strategy interface.

Examples:

```text
UPIPayment
CardPayment
PayPalPayment
```

Each contains its own payment logic.

---

### Context

Uses a strategy object to perform the operation.

Example:

```text
PaymentProcessor
```

The processor does not know how payment is performed internally.

It simply delegates the task to the selected strategy.

---

## Flow

```text
User selects payment method
            ↓
Corresponding Strategy created
            ↓
Passed to PaymentProcessor
            ↓
PaymentProcessor calls pay()
            ↓
Selected payment logic executes
```

---

## Class Diagram

<img width="623" height="487" alt="image" src="https://github.com/user-attachments/assets/d5a0acce-d8ad-4fa0-8269-ca308a252cb3" />

