package kladd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    private String name;
    private List<Player> players = new ArrayList<>();
    
    public void addPlayer(Player p){
        players.add(p);
    }
    public int getPlayerCount(){
       return players.size();
    }

    public String getName() {
        return name;
    }

    public boolean hasPlayer(String name){
        return players.stream().anyMatch(p -> p.getName().equals(name));
    }

    public List<String> getPlayerNames(){
        return players.stream().map(p -> p.getName()).collect(Collectors.toList());    
    }
    public List<Player> getPlayersStartingWith(char initial){
       return players.stream().filter(p -> p.getName().startsWith(String.valueOf(initial))).collect(Collectors.toList());

    }
    public String getLongestPlayerName(){
        return players.stream().map(p -> p.getName()).max(Comparator.comparingInt(String::length)).orElse("No players");
    }
}
