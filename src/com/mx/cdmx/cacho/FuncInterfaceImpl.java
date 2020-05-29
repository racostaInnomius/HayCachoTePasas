package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncInterfaceImpl {

	public static Integer doOperation100(int i) {
		return i * 100;
	}
	
	public static Integer doOperation200(int i) {
		return i * 200;
	}
	
	public static List<CachoBean> doSortOperation(ArrayList<CachoBean> cachoBeanList) {
		//cachoBeanList.sort(Comparator.thenComparingInt(CachoBean::getId));
		return cachoBeanList;
	}
}
