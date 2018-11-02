public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
	super();
    }
    public OrderedArrayList(int startingCapacity) {
	super(startingCapacity);
    }
    private OrderedArrayList<T> order(OrderedArrayList<T> da) {
	for (int i = 0; i < da.size()-1; i++) {
	    if (T == String) {
		if (da.get(i).charAt(i) > da.charAt(i+1)) {
		    String a = da.get(i+1);
		    da.set(i+1, da.get(i));
		    da.set(i, a);
		}
	    }
	    else {
		if (da.get
		
    public boolean add(T element) {
    }
}
