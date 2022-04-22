package co.edu.poli.ces3;

public class Article {
    private float IVA;
    private float size;
    private Float weight;
    private double price;
    protected String Id;

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
    
    public void sell(String nameSeller){
        
    }
    
    public void buy(int idStore, boolean isLocate){
        
    }
    
    public double calculateValueTotal(double[] discounts){
        double totalDiscount = this.calculateTotalDiscounts(discounts);
        return 0;
    }
    
    private double calculateTotalDiscounts(double[] discounts){
        return 0.8;
    }
    
}
