abstract class Product {
    // Simple Product attributes
    int id;
    String name;
    int creationDuration; // in minutes

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract int fabricationTime();
}

/*
 * This is an abstract class which acts as a blueprint for SimpleProduct and 
 * ComplexProduct classes, it has declaration of product id, name, creationDuartion,
 * a constructur to initialize id and name for a product
 * and we have abstract function declaration fabricationTime()
 */
