# Agile-Development

敏捷开发

## 项目简介
Agile-dev:敏捷开发的一些技巧演示，主要内容有：
- demo1	---	去掉重复代码
- demo2	---	去掉代码异味

#### demo1去掉重复代码：
	如果同样的代码重复出现了三次，那么就要引起注视了。提取代码中公共的部分，抽象为公共方法。
	
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
		
	以上获取客户名和删除客户这两个方法中，存在重复的代码，可以考虑对其共性的部分进行抽象：
	
		//提取公共的方法
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
			rentrals.remove(*getRentalIdxById(rentralId)*);
		}		
		
#### demo2去掉代码异味：
	代码异味的表现形式：
		1.代码用了类别代码；
		2.该类中有很多属性有时候不用；
		3.该类中的某些属性，在同情况下有不同的含义；
		4.存在switch或if-then-else-if这种形式的代码。
