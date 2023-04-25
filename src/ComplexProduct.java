class ComplexProduct extends Product {
    Product[] components = new Product[20];
    int assmebleDuration; // in minutes
    int count = 0;

    ComplexProduct(int id, String name, int assmebleDuration) {
        super(id, name);
        this.assmebleDuration = assmebleDuration;
    }

    void addComponent(Product component) {
        components[count++] = component;
    }

    int fabricationTime() {
        creationDuration = 0;
        for(int i = 0; i < count; i++) {
            creationDuration += components[i].fabricationTime();
        }

        return assmebleDuration + creationDuration;
    }
}

/*
 * In ComplexProduct class we have declaration of list (comonents) to add components, assembleDuration, 
 * and intalization of count attribute which will be used to inrease the index of the list
 * every time a new component will be added, below it there is a constructur to initialize 
 * id, name of product and assembleDuration (duration needed to assemble components of complex product), 
 * addComponent function has been created which takes a product as a parameter 
 * and assign it to commonents list then count variable will be incremented, 
 * the calculation of fabrication duration is different from simple products, to calculate duration 
 * production of complex product we should find the sum duration of its compnents takes
 * this can be done by calling fabricationTime function for each component after that the addition
 * between creationDuration and assmebleDuration will be returned.
 */
