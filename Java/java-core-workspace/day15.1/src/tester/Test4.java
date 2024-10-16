package tester;

import static utils.GenericUtils.addEmp;
import static utils.GenericUtils.computeSumOfSalary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

import com.app.core.Emp;
import com.app.core.HRMgr;
import com.app.core.Mgr;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;


public class Test4 {

	public static void main(String[] args) {
		ArrayList<Emp> mgrs = new ArrayList<>
		(Arrays.asList(new Mgr(1500), new Mgr(1600)));
		computeSumOfSalary(mgrs);

		Vector<TempWorker> tempWorkers = 
				new Vector<>(Arrays.asList(new TempWorker(500), new TempWorker(600)));
		computeSumOfSalary(tempWorkers);
		LinkedList<SalesMgr> salesMgrs = 
				new LinkedList<>(Arrays.asList(new SalesMgr(2000), new SalesMgr(2100)));
		/*
		 * Which of the following will be legal ?
		 */
//		addEmp(mgrs, new Mgr(1234));
//		addEmp(mgrs, new SalesMgr(1234));
//		addEmp(mgrs, new HRMgr(1234));
//		addEmp(mgrs, new Object());
	}

}
