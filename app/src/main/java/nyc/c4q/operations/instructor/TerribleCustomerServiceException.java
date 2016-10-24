package nyc.c4q.operations.instructor;

public class TerribleCustomerServiceException extends RuntimeException {
    public TerribleCustomerServiceException (Customer customer ){
        super(customer.getName() + "has filed a complaint");
    }
}
