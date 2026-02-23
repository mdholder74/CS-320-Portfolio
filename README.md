# CS-320-Software Testing, Automation, and Quality Assurance Portfolio


**How can I ensure that my code, program, or software is functional and secure?**
  
  I focus on good software engineering principles and disciplined development practices to ensure my program is both functional and secure. One approach I follow is the practice of “code a little, test a little,” which means I write a small portion of code and immediately create test cases to validate that it works as expected before moving forward. This prevents me from writing large sections of untested code and later having to debug and find the root cause of multiple errors.
  
  I utilize JUnit to write and execute automated test cases to validate my code’s correctness. I review test coverage reports to measure how much of the codebase is being tested. This helps me identify gaps, dead code, or logic that is not properly validated and may need to be addressed to strengthen test coverage.
  
  I use sunny-day, rainy-day, and boundary testing techniques. Sunny-day testing validates inputs and confirms that the system behaves correctly under expected conditions. Rainy-day testing checks how the system handles invalid inputs. Boundary testing focuses on values at the edges of acceptable ranges, which helps catch edge cases not initially considered.
In addition, I strengthen security and reliability by ensuring all inputs are validated before they are processed or stored. This prevents improper data from entering the system. I also implement proper exception handling to manage errors gracefully without crashing the system.

**How do I interpret user needs and incorporate them into a program?**
  
  To interpret user needs effectively, I first ensure there is a thorough intake and requirements-gathering process. I gather and document clear software requirements, establish measurable success criteria, and ensure they align with the user’s goals and business objectives. Based on those requirements, I design functional components and implement the appropriate logic in the code. Then, I create test cases that validate those requirements behave as expected in the system.

  I incorporate clear validation rules that align directly with the business logic and user expectations. I always keep the user experience in mind and make sure I design systems that are intuitive, flexible, and easy to update.

**How do I approach designing software?**
  
  I approach designing software based on the client’s needs, documented requirements, and feedback provided throughout the development process. I focus on the DRY (Don’t Repeat Yourself) principle to avoid duplicating logic, centralizing shared functionality, and reducing defects. I design classes with the Single Responsibility Principle in mind, ensuring that each class has one specific purpose. This keeps the system modular, easier to maintain, and more testable. I also carefully consider which data structures are most appropriate for the problem I am solving and evaluate trade-offs such as time complexity, memory usage, and scalability. Choosing the appropriate data structure improves performance, scalability, and maintainability.
