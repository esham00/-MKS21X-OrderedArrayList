public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
	super();
    }
    public OrderedArrayList(int startingCapacity) {
	super(startingCapacity);
    }
    private int order(T element) {
	int index = 0;
        for (int i = 0; i < this.size(); i++) {
	    if (element.compareTo(this.get(i)) >= 0) {
		index = i + 1;
	    }
    	}
	return index;
    }		
    public boolean add(T element) {
	super.add(order(element), element);
	return true;
    }
    public void add(int index, T element) {
    	super.add(order(element), element);
    }
    public T set(int index, T element) {
	if (index > this.size() || index < 0) {
	    throw new IllegalArgumentException();
	}
	T prevEle = this.get(index);
	this.remove(index);
	this.add(element);
	return prevEle;
    }
}
