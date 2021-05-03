package Business;

import Entities.Game;

public interface GameService {
	public void  Add(Game game);
	public void Delete(Game game);
	public void Update(Game game);
}