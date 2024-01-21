

# Builder Design Pattern Example

This Java project demonstrates the use of the Builder Design Pattern to construct different food items with specific components. The example includes a `Product` class representing a generic food item, a `Builder` interface defining the construction process, and two concrete builders (`ConcreteBuilder1` and `ConcreteBuilder2`) with a director (`Director`) managing the construction.





### Builder.java

- Interface for building a `Product`.
- Defines methods to build different parts of the product (`buildPart1` and `buildPart2`) and to retrieve the final product (`getResult`).

### Client.java

- Main class containing the `main` method to demonstrate the usage of the Builder Design Pattern.
- Creates instances of builders, directors, and products to showcase different food items.

### ConcreteBuilder1.java

- Concrete builder implementation.
- Builds the main course components of the food item.

### ConcreteBuilder2.java

- Another concrete builder implementation.
- Builds the dessert components of the food item.

### Director.java

- Manages the construction process by directing a builder on how to build a product.

### Product.java

- Represents a generic product (food item) with two parts.
- Contains setters for different parts (`setPart1` and `setPart2`) and overrides `toString` for a formatted string representation.

## How to Run

1. Ensure you have Java installed on your system.
2. Open a terminal or command prompt.
3. Navigate to the directory containing the Java files.
4. Compile the files using the following command:

   ```bash
   javac Builder.java Client.java ConcreteBuilder1.java ConcreteBuilder2.java Director.java Product.java
   ```

5. Run the `Client` class:

   ```bash
   java Client
   ```

# OUTPUT
   <img width="287" alt="img1" src="https://github.com/dharmi04/Meal-Bulder-Build-Design-Pattern/assets/122154176/a06a6fc6-1312-4274-acd3-c8ade63fb596">
   <img width="415" alt="img2" src="https://github.com/dharmi04/Meal-Bulder-Build-Design-Pattern/assets/122154176/30e2d70e-4698-4dbb-8d4e-7fb668e79309">

   

