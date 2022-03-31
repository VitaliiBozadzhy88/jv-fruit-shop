package model;

public class FruitTransaction {
    final Operation operation;
    final String fruit;
    final int quantity;

    public FruitTransaction(String operation, String fruit, int quantity) {
        this.operation = convertOperation(operation);
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public Operation getOperation() {
        return operation;
    }

    public String getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    private Operation convertOperation(String operation) {
        for (Operation o : Operation.values()) {
            if (o.getOperation().equals(operation)) {
                return o;
            }
        }
        throw new RuntimeException("Can't find operation");
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        final String operation;

        Operation(String operation) {
            this.operation = operation;
        }

        public String getOperation() {
            return operation;
        }
    }
}
