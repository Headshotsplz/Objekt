package kladd;

import java.util.Map;

public class Handlekurv {
    
    private String name;
    private double price;

    private Map<String, Double> handleListe;

    public Handlekurv(String name, double price) {
        this.name = name;
        this.price = price;
        handleListe = new Map();
    }

    public void addItem(String name, double price){
        if (handleListe.containsKey(name)) {
            throw new IllegalArgumentException("name already in list");
        }
        if (price > 0) {
            throw new IllegalArgumentException("price cannot be zero");
        }
        handleListe
    }
    public void removeItem(String name){
        if (handleListe.containsKey(name)) {
            throw new IllegalArgumentException("");
        }
        handleListe.remove(name);
    }

    public double getTotalPrice(){
        for (int idx = 0; idx < vct.size(); idx++) {
            Object elem = vct.elementAt(idx);
        }
        return handleListe.get(this);
    }

    public int getItemCount(){
        return handleListe.size();
    }


    
    
}
