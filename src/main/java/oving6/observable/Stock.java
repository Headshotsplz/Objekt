package oving6.observable;

import java.util.ArrayList;
import java.util.Collection;

public class Stock implements StockListener{

    private String ticker;
    private double price;

    private final Collection<StockListener> listeners = new ArrayList<>();
    
    
    public Stock(String ticker, double Newprice){
        if (ticker == null || ticker.isEmpty()) {
            throw new IllegalArgumentException("ticker cannot be null or empty");
        }
        this.ticker = ticker;
        this.price = Newprice;

    }
    public void setPrice(double newPrice){
        if (newPrice <= 0) {
            throw new IllegalArgumentException("price cannot be negative or equals zero");
        }
        this.price = newPrice;
        listeners.stream().forEach(listener -> listener.stockPriceChanged(this, newPrice, newPrice));
    }

    public String getTicker(){
        return this.ticker;
    }

    public double getPrice(){
        return this.price;
    }   

    public void addStockListener(StockListener listener){
        if (listeners.contains(listener)) {
            throw new IllegalStateException("already listening");
        }
        listeners.add(listener);
    }
    public void removeStockListener(StockListener listener){
        if (! listeners.contains(listener)) {
            throw new IllegalStateException("already not listening");
        }
        listeners.remove(listener);
    }

    @Override
    public void stockPriceChanged(Stock stock, double oldValue, double newValue) {

    }

}
