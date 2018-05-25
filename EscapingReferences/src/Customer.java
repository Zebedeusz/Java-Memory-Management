
public class Customer implements CustomerReadOnly {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(Customer oldCustomer){
		this.name = oldCustomer.name;
	}

	public String toString() {
		return name;
	}
}
