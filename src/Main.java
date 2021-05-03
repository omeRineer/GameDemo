import Business.CampaignManager;
import Business.GameManager;
import Business.GamerManager;
import Business.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sales;

public class Main {

	public static void main(String[] args) {
		Game game=new Game();
		game.GameId=1;
		game.GameName="Uncharted 4";
		Gamer gamer=new Gamer();
		gamer.GamerId=1;
		gamer.GamerName="Ömer Faruk Sandýkçý";
		Campaign campaign=new Campaign();
		campaign.CampaignId=1;
		campaign.CampaignName="Student Campaign";
		
		Sales sales=new Sales();
		sales.SalesId=1;
		sales.GameId=1;
		sales.GamerId=1;
		sales.Price=350;
		sales.Description="Cep Yakan Fiyat";
		
		GameManager gameManager=new GameManager();
		gameManager.Add(game);
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.Add(gamer);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.Add(campaign);
		
		SalesManager salesManager=new SalesManager();
		salesManager.Sale(sales);
		

	}

}
