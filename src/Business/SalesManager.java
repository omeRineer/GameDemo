package Business;

import Entities.Sales;

public class SalesManager implements SalesService {

	@Override
	public void Sale(Sales sales) {
		System.out.println("Sat�n alma i�lemi ger�ekle�tirildi");
		
	}

	@Override
	public void Delete(Sales sales) {
		System.out.println("Sat�n alma i�lemi iptal edildi");
		
	}
	
}
