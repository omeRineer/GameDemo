package Business;

import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Oyun Eklendi");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun Silindi");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun Güncellendi");
		
	}

}
