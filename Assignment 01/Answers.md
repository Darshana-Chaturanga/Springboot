## Assignment 01

1. **What does singleton scope mean in Spring?**

   - In Spring, the singleton scope is the default scope for a bean, meaning the Spring IoC (Inversion of Control) container creates only one instance of the bean per container, and all requests for that bean return the same cached instance.


2. **What is the difference between singleton and prototype?**

   - Singleton Scope : Only one instance of the bean is created per Spring IoC container. The same instance is shared for all requests. The instance is cached and reused throughout the application. Created when the container starts. Destroyed when the container shuts down.

   - Prototype Scope : A new instance is created every time the bean is requested. Each `getBean()` call or dependency injection creates a new object. No caching; Spring does not manage the lifecycle beyond creation.


3. **How does Spring know which constructor to use in XML?**

   - If no `<constructor-arg>` is specified, Spring uses the no-argument constructor. When `<constructor-arg>` is used, Spring selects the constructor that matches the number, order, and type of the provided arguments.

4. **What will happen if you try to inject values into a bean but the constructor doesn't match?**

   - If you attempt to inject values into a Spring bean via XML or annotations, but no matching constructor exists, Spring will throw a BeanCreationException (or a more specific subclass like UnsatisfiedDependencyException).





