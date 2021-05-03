package Business;

import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya Eklendi");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya Silindi");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi");
		
	}
	
}
