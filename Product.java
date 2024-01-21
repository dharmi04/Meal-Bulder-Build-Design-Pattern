// Product.java
public class Product {
    // Properties of a generic product
    private String part1;
    private String part2;
    
    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product { Dish-1: " + part1 + ", Dish-2: " + part2 + " }";
    }
}
