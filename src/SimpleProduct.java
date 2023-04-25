class SimpleProduct extends Product {

    SimpleProduct(int id, String name, int creationDuration) {
        super(id, name);
        this.creationDuration = creationDuration;
    }

    void setId(int id) {
        this.id = id;
    }

    void gettId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void getName(String name) {
        this.name = name;
    }

    int fabricationTime() {
        return creationDuration;
    }
}

/*
 * SimpleProduct class extends Product class, this allows the child class to inherite 
 * attributes and non-abstract functions from the parent class in this case we have: id, name
 * and creaetionDuration, there is no non-abstract functiond to be inherited in this stuation,
 * inside SimpleProduct class we have a constructur, sters and geters and definition of 
 * fabricationTime function which returns the duration needed to create simple product.
 */