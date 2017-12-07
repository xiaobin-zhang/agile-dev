package com.agile.demo.demo5;

import java.util.ArrayList;
import java.util.List;

public class ProductInit {

	public void init() {
		Product p = new Product();
		List<Class<? extends Param<?>>> ps = new ArrayList<Class<? extends Param<?>>>();
		ps.add(CardNoParam.class);
		p.params = ps;
	}
}
