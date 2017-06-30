package com.agile.demo.demo1;

import java.util.Vector;

public class BookRentals {

	private Vector<BookRental> rentrals;
	
	public String getCustomerNameById(String rentralId) throws RentalNotFoundException{
		for (int i = 0; i < rentrals.size(); i++) {
			BookRental bookRental = rentrals.elementAt(i);
			if (bookRental.getId().equals(rentralId)) {
				return bookRental.getCusomerName();
			}
		}
		throw new RentalNotFoundException();
	}
	
	public void deleteRentalById(String rentralId) throws RentalNotFoundException{
		for (int i = 0; i < rentrals.size(); i++) {
			BookRental bookRental = rentrals.elementAt(i);
			if (bookRental.getId().equals(rentralId)) {
				rentrals.remove(i);
				return;
			}
		}
		throw new RentalNotFoundException();
	}
	
	/*
	 * 以上两个方法看起来是不是重复代码太多？
	 * 接下来演示消除重复代码的写法，请睁大眼睛
	 */
	
	public int getRentalIdxById(String rentralId) throws RentalNotFoundException{
		for (int i = 0; i < rentrals.size(); i++) {
			BookRental bookRental = rentrals.elementAt(i);
			if (bookRental.getId().equals(rentralId)) {
				return i;
			}
		}
		throw new RentalNotFoundException();
	}
	
	public String getCustomerNameById2(String rentralId) throws RentalNotFoundException{
		int idx = getRentalIdxById(rentralId);
		return rentrals.elementAt(idx).getCusomerName();
	}
	
	public void deleteRentalById2(String rentralId) throws RentalNotFoundException{
		rentrals.remove(getRentalIdxById(rentralId));
	}
}


