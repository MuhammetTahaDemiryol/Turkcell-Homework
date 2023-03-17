package org.example.hmwk1.service.concretes;

import org.example.hmwk1.entity.Campaign;
import org.example.hmwk1.service.abstracts.CampaignService;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager implements CampaignService {

    List<Campaign> campaigns = new ArrayList<>();
    @Override
    public void addCampaign(Campaign campaign) {

        if(campaigns.contains(campaign)){
            System.out.println("Campaign already exist.");
        }else{
            campaigns.add(campaign);
            System.out.println("Campaign added.");
        }
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        campaigns.remove(campaign);
        System.out.println("Campaign deleted");

    }

    @Override
    public void deleteCampaignById(int id) {
        for (Campaign campaign : campaigns) {
            if(campaign.getId() == id){
                campaigns.remove(campaign);
                System.out.println("Campaign deleted");
            }
        }

    }

    @Override
    public void updateCampaign(int id, Campaign campaign) {
        Campaign updateToCampaign = null;
        for(Campaign campaign1: campaigns){
            if(campaign1.getId()==id){
                updateToCampaign = campaign1;
                updateToCampaign.setGame(campaign.getGames().get(id));
                updateToCampaign.setDiscountAmount(campaign.getDiscountAmount());
                updateToCampaign.setDayTime(campaign.getDayTime());
            }else{
                System.out.println("Campaign is not found and also not updated");
            }
        }

    }

    @Override
    public List<Campaign> getCampaigns() {
        return campaigns;
    }


}
