package Business;

import Entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void Add(Gamer gamer) {
		System.out.println("Oyuncu Eklendi");
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi");
		
	}

}
