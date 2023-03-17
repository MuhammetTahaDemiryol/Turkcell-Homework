package org.example.hmwk1.service.abstracts;

import org.example.hmwk1.entity.Campaign;

import java.util.List;

public interface CampaignService {
    void addCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
    void deleteCampaignById(int id);
    void updateCampaign(int id,Campaign campaign);
    List<Campaign> getCampaigns();



}
