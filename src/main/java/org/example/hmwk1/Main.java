package org.example.hmwk1;

import org.example.hmwk1.adapter.CheckService;
import org.example.hmwk1.adapter.MernisService;
import org.example.hmwk1.entity.Campaign;
import org.example.hmwk1.entity.Customer;
import org.example.hmwk1.entity.Developer;
import org.example.hmwk1.entity.Game;
import org.example.hmwk1.service.concretes.CampaignManager;
import org.example.hmwk1.service.concretes.GameManager;
import org.example.hmwk1.service.concretes.SellingManager;
import org.example.hmwk1.service.concretes.UserManager;

public class Main {
    public static void main(String[] args) {
        CheckService checkService = new MernisService();
        UserManager userManager = new UserManager(checkService);
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();
        SellingManager sellingManager = new SellingManager(campaignManager,userManager);

        Game game = new Game(1,"Battlefront 2",50,"Star Wars fps game",0);
        Game game2 = new Game(2,"Hogwarts Legacy",100,"Chosen boy ",0);
        Game game3 = new Game(3,"Battlefront ",50,"Star Wars fps game",0);
        Game game4 = new Game(4,"Factorio ",100,"Chosen boy ",0);

        gameManager.addGame(game);
        gameManager.addGame(game2);
        gameManager.addGame(game3);
        gameManager.addGame(game4);


        Customer john = new Customer(1,"7676@gmail.com","4321","John","Williams","767676767676",1932);
        Customer harry = new Customer(2,"7676@gmail.com","4321","Harry","Potter","12121212",2000);
        Customer weasley = new Customer(3,"7676@gmail.com","4321","Weasley","Williams","13131313",2002);
        Customer snape = new Customer(4,"7676@gmail.com","4321","Snape","Williams","1111111",2006);



        userManager.addUser(john);
        userManager.addUser(harry);
        userManager.addUser(weasley);
        userManager.addUser(weasley);


        userManager.getUsers().stream().forEach(System.out::println);
        userManager.deleteUser(harry);
        userManager.getUsers().stream().forEach(System.out::println);
        userManager.updateUser(1,new Customer(1,"7676@gmail.com","4321","Christopher","Lee","767676767676",1932));
        userManager.getUsers().stream().forEach(System.out::println);
        System.out.println("***************************************************");

        gameManager.getGames().stream().forEach(System.out::println);
        gameManager.deleteGame(game);
        gameManager.getGames().stream().forEach(System.out::println);
        gameManager.updateGame(1,new Game(1,"Run",250,"Run",0));
        System.out.println("***************************************************");


        Campaign campaign = new Campaign(1,75,15,game4);
        Campaign campaign2 = new Campaign(2,75,15,game2);

        campaignManager.addCampaign(campaign);
        campaignManager.addCampaign(campaign2);
        campaignManager.getCampaigns().stream().forEach(System.out::println);

        System.out.println("***************************************************");
        sellingManager.sell(weasley,game);
        sellingManager.sell(weasley,game2);
        sellingManager.sell(weasley,game4);
        sellingManager.sell(weasley,game3);
        System.out.println(weasley);

        userManager.getCustomer(3).getGames().stream().forEach(System.out::println);
    }
}
