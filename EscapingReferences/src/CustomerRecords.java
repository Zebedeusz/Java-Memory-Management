import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() {

		//as it returns reference to the object, state of this object may be easily altered <- encapsulation violation
//		return this.records;

		//returns a copy of Map 'this.records'
//		return new HashMap<String, Customer>(this.records);

		//returns copy of the original map that cannot be edited
		return Collections.unmodifiableMap(this.records);
	}

	public CustomerReadOnly getCustomerByName(String name){
		//gives access to object which may be mutated, as the reference is returned
//		return this.records.get(name);

//		returns new object of type 'Customer' with the same filed values as requested one
//		return new Customer(this.records.get(name));

//		user of this method will only be able to use (and see) methods from the interface - making this object readonly
		return this.records.get(name);
	}

	//allows for easily iterating in forEach loop through elements of this collection
	//however it is still possible to remove elements from this collection via remove() method in iterator
	@Override
	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
}
