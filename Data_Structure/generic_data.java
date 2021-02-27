package Data_Structure;

class container<T>{ // T is just a temporary value
	T value;
	
	public T getValue() {
		return value;
	}
	public void show() {
		System.out.println(value.getClass().getName());
	}
}
public class generic_data {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		container<String> c = new container<>(); // over here you can specify what datatype you want it to be 
		c.value = "KEN";
		c.show();
	}

}
