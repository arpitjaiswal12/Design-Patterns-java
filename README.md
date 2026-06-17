# Design Patterns

This repository contains all the design patterns covered in the book **Head First Design Patterns.**

---

# 1. Strategy Design Pattern

## Definition

**The Strategy Pattern defines a family of algorithms, encapsulates each one and make them interchangeable. Strategy lets the algorithm vary independently from client that use it.**

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

---

# 2. Observer Design Pattern

## Definition

**The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.**

---

## Problem It Solves

Consider a weather monitoring system.

The weather station tracks:

- Temperature
- Humidity
- Pressure

Several devices need live updates:

- Mobile App
- Smart Watch
- LED Display
- TV Screen

Whenever the weather changes, every registered device should automatically receive the latest information.

Without Observer Pattern, the weather station would need direct references to every display device, resulting in tight coupling.

The Observer Pattern removes this dependency.

---

## Real-World Example

### Weather Monitoring System

A weather station publishes temperature updates.

Multiple displays subscribe to these updates.

When temperature changes:

```text
28°C → 32°C
```

Every registered display receives the update automatically.

---

## Components

### Subject (Publisher)

Maintains the list of observers.

Responsible for:

```text
registerObserver()
removeObserver()
notifyObservers()
```

Example:

```text
WeatherStation
```

---

### Observer

Defines a common update interface.

Example:

```text
DisplayDevice
```

---

### Concrete Observers

Implement the observer interface.

Examples:

```text
MobileDisplay
SmartWatch
LEDDisplay
```

Each device decides how to display the updated weather information.

---

## Flow

```text
Devices register with WeatherStation
                ↓
WeatherStation stores observers
                ↓
Temperature changes
                ↓
notifyObservers()
                ↓
update() called on each observer
                ↓
All displays refresh automatically
```
## Class Diagram

<img width="748" height="602" alt="image" src="https://github.com/user-attachments/assets/c9c128f1-59f5-409d-b45d-521297209d58" />

---
