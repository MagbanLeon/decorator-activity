public class Bitters extends LiquorDecorator{
    public Bitters(Liquor drink){
        this.drink = drink;
    }
    public int getCalorie(){
        return 20 + drink.getCalorie();
    }
}