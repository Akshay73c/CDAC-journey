package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

import com.app.core.Mgr;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;
import static utils.GenericUtils.*;

/*
 * write a static method in the GenericUtils class -
to return sum of salaries of all emps from the specified list.

 * AL<Mgr> , 
 * Vector<TempWorker> , 
 * LinkedList<SalesMgr> 
 */
public class Test2 {

	public static void main(String[] args) {
		ArrayList<Mgr> mgrs = new ArrayList<>
		(Arrays.asList(new Mgr(1500), new Mgr(1600)));
		computeSumOfSalary(mgrs);

		Vector<TempWorker> tempWorkers = 
				new Vector<>(Arrays.asList(new TempWorker(500), new TempWorker(600)));
		computeSumOfSalary(tempWorkers);
		LinkedList<SalesMgr> salesMgrs = 
				new LinkedList<>(Arrays.asList(new SalesMgr(2000), new SalesMgr(2100)));
		computeSumOfSalary(salesMgrs);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(2);
	}

}
