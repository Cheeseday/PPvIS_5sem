package sample.model;

public class Resources {
    private double amountOfWater;
    private int weightOfFertilizers;

    public Resources(double amountOfWater, int weightOfFertilizers) {
        this.amountOfWater = amountOfWater;
        this.weightOfFertilizers = weightOfFertilizers;
    }

    public void setWeightOfFertilizers(int weightOfFertilizers) {
        this.weightOfFertilizers = weightOfFertilizers;
    }

    public int getWeightOfFertilizers() {
        return weightOfFertilizers;
    }

    public void setAmountOfWater(double amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public double getAmountOfWater() {
        return amountOfWater;
    }
    public String getResources() {
        return "Amount of water:" + amountOfWater + "\n" + "Weight of fertilizers" + weightOfFertilizers;
    }
}
