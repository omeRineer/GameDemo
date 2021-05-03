package Business;

import Entities.Sales;

public class SalesManager implements SalesService {

	@Override
	public void Sale(Sales sales) {
		System.out.println("Satýn alma iþlemi gerçekleþtirildi");
		
	}

	@Override
	public void Delete(Sales sales) {
		System.out.println("Satýn alma iþlemi iptal edildi");
		
	}
	
}
