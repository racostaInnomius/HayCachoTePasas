package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface FuncInterfaceSort {
	public abstract List<CachoBean> doSortOperation(ArrayList<CachoBean> cachoBeanList);
}
