OOP Fourth Assignment: Instance Block and Static Block (IBS/BS)

## Description
This is the fourth assignment of the Object-Oriented Programming (OOP) course. It is a Java program, a simple **UNEB Candidate Registration System**, that demonstrates the **static initialization block** and the **instance initialization block**, and the order in which they run relative to the constructor.

## OOP Concepts Demonstrated
| Concept | Where it appears |
|---------|------------------|
| Static block | Runs **once**, when the `Candidate` class is first loaded. It sets `examYear`, `registrationFee` and `gradingPolicy`. |
| Instance initialization block | Runs **every time** a `Candidate` object is created, before the constructor. It increments `totalRegisteredCandidates` and sets default values for `registrationStatus` and `centreAssignment`. |
| Constructor | Runs after the instance block. It sets `indexNumber`, `fullName` and `schoolName`, and overwrites `registrationStatus` with "Registration Confirmed". |
| Static variables | `examYear`, `registrationFee`, `gradingPolicy` and `totalRegisteredCandidates` are shared by all candidates. |
| Instance variables | `indexNumber`, `fullName`, `schoolName`, `registrationStatus` and `centreAssignment` are unique to each candidate. |
| Encapsulation | All fields are `private`. |

## Order of Execution
1. **Static block**: once, when the first `Candidate` is created.
2. **Instance block**: for every new object.
3. **Constructor**: for every new object, after the instance block.

## How to Locate the Java Files
1. Open the `src` folder.
2. Open `Main.java`. It contains the `main` method, which is the entry point. It creates three candidates and displays them.
3. Open `Candidate.java`. It contains the static block, the instance block, the constructor and `displayCandidateInfo()`.
