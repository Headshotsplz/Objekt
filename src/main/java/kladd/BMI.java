package kladd;

public class BMI {
    private int weight;
    private int height;

    public BMI(int weight, int height) {
        setWeight(weight);
        setHeight(height);
    }

    public void setWeight(int weight) {
        if (weight < 0) {
        throw new IllegalArgumentException("Cannot be zero");
        }
        this.weight = weight;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Cannot be zero");
        }

        this.height = height;
    }

    public double getBMI(int weight, int height){
        return weight/(height*height);
    }

    

    
}
