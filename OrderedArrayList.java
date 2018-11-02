public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
	super();
    }
    public OrderedArrayList(int startingCapacity) {
	super(startingCapacity);
    }
    private void order() {
	T check = this.get(0);
	int all = 0;
	int size = this.size();
	int same = 0;
	NoNullArrayList<T> xin = new NoNullArrayList<T>(this.size());
	while (size > 1) {
	    for (int i = 0; i < size; i++) {
		if (check.compareTo(this.get(i)) < 0) {
		    all++;
		}
		if (check.compareTo(this.get(i)) == 0 & i != 0) {
		    same++;
		}
	    }
	    if (all == size-1) {
		xin.add(check);
		this.remove(0);
		check = this.get(0);
		size--;
	    }
	    else {
		T a = check;
		this.remove(0);
		super.add(check);
		check = this.get(0);
	    }
	}
	xin.add(this.get(0));
	this.set(0, xin.get(0));
	for (int i = 1; i < xin.size(); i++) {
	    super.add(xin.get(i));
	}
    }		
    public boolean add(T element) {
	super.add(element);
	order();
	return true;
    }
    public void add(int index, T element) {
	super.add(index, element);
	order();
    }
}
