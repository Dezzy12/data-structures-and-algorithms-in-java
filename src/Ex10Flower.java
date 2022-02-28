public class Ex10Flower {
    //instance variables
    public String flower;
    public int petals;
    public float price;

    public Ex10Flower(String flower, int petals, float price){
        this.flower = flower;  //name of flower
        this.petals = petals;  //number of petals
        this.price = price;    //price of flower in (francs)
    }

    // this are the getters
    public String getFlower(){
        return flower;

    }
    public int getPetals(){
        return petals;
    }
    public float getPrice(){
        return price;
    }
    public static void main(String[] args){
        Ex10Flower flower = new Ex10Flower("Rose flower",12,1500f);
        System.out.println("This is are the names, petals count,prices of flower respectively: ");
        System.out.println(flower.getFlower() + ", " + flower.getPetals() + ", " + flower.getPrice() + "frs");
    }
}
