import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList() {
	super();
    }
    public NoNullArrayList(int startingCapacity) {
	super(startingCapacity);
    }
    public String set(int index, T element) {
    	if (element == null) {
    	    throw new IllegalArgumentException();
    	}
    	else {
   	    super.set(index, element);
    	}
    }
    public boolean add(T element) {
	if (element == null) {
	    throw new IllegalArgumentException();
	}
	else {
	    super.add(element);
	    return true;
	}
    }
    public void add(int index, T element) {
	if (element == null) {
	    throw new IllegalArgumentException();
	}
	else {
	    super.add(index, element);
	}
    }
}
    
