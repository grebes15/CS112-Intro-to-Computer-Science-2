import java.util.Iterator;
import java.util.ArrayList;

public class CreateArrayLists
{

    public static void main(String[] args)
    {

	ArrayList<Integer> list = new ArrayList<Integer>();
	int totalSize = 100000;

	System.out.println("Size = " + list.size());

	for(int i = 0; i < totalSize; i++)
	    {

		list.add(new Integer(10));

	    }

	System.out.println("Size = " + list.size());

    }

}
