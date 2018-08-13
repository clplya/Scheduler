package scheduler.Data_Access_Objects;

import Objects.Customer;
import Scheduler.DataSource;
import java.util.ArrayList;

/**
 *
 * @author clply_000
 */
public class DBCustomerDao {
    private ArrayList allCustomers;
    private Customer selectedCustomer;
    
    public void DBCustomerDao(DataSource dataSource){
        
    }
    
    public ArrayList<Customer> getAll(){
        return allCustomers;
    }
    
    public Customer getById(int Id){
        return selectedCustomer;
    }

    public boolean add(Customer customer){
        return true;
    }
}