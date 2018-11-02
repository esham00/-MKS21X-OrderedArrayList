 public class Driver {
    public static void main(String[] args){
        NoNullArrayList<String> a = new NoNullArrayList<String>();
	NoNullArrayList<Integer> b = new NoNullArrayList<Integer>();
	a.add("a");
	a.add("b");
	a.add("c");
	a.add("d");
	b.add(2);
	b.add(0, new Integer (1));
	System.out.println(a);
	System.out.println(b);
	try {
	    b.add(null);
	}
	catch (IllegalArgumentException e) {
	    e.printStackTrace();
	}
	try {
	    a.add(null);
	}
	catch(IllegalArgumentException e) {
	    e.printStackTrace();
	}
	try {
	    b.add(1, null);
	}
	catch (IllegalArgumentException e) {
	    e.printStackTrace();
	}
	try {
	    a.add(1, null);
	}
	catch (IllegalArgumentException e) {
	    e.printStackTrace();
	}
	b.set(0, new Integer(0));
	b.set(1, new Integer(1));
	a.set(0, "A");
       	a.set(1, "B");
	a.set(2, "C");
	a.set(3, "D");
	System.out.println(a);
	System.out.println(b);
    }
 }
		
