package scheduler.Data_Access_Objects;

import Objects.Customer;
import java.util.ArrayList;

/**
 *
 * @author clply_000
 */
public interface CustomerDao {    
    ArrayList<Customer> getAll(ArrayList<Customer> customer);
    
    Customer getById(int Id);
    
    boolean add(Customer customer);
}
