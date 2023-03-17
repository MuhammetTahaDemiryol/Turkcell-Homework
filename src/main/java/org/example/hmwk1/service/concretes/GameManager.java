package org.example.hmwk1.service.concretes;


import org.example.hmwk1.entity.Game;
import org.example.hmwk1.service.abstracts.GameService;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {
    List<Game> games = new ArrayList<>();
    @Override
    public void addGame(Game game) {
        if(games.contains(game)){
            System.out.println("Game already exist.");
        }else{
            games.add(game);
            System.out.println("Game added.");
        }
    }

    @Override
    public void deleteGame(Game game) {
        games.remove(game);
        System.out.println("Game deleted");

    }


    @Override
    public void deleteGameById(int id) {
        for (Game game : games) {
            if(game.getId() == id){
                games.remove(game);
                System.out.println("Game deleted");
            }
        }
    }



    @Override
    public void updateGame(int id, Game game) {
        Game updateToGame;
        for(Game game1: games){
            if(game1.getId()==id){
                updateToGame = game1;
                updateToGame.setId(game.getId());
                updateToGame.setDescription(game.getDescription());
                updateToGame.setCost(game.getCost());
                updateToGame.setName(game.getName());
                updateToGame.setCountOwner(game.getCountOwner());

            }else{
                System.out.println("Game is not found and also not updated");
            }
        }
    }

    @Override
    public List<Game> getGames() {
        return games;
    }
}
