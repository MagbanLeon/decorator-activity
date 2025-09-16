public class Vermouth extends LiquorDecorator{
    public Vermouth(Liquor drink){
        this.drink = drink;
    }
    public int getCalorie(){
        return 40 + drink.getCalorie();
    }
}