public class Lime extends LiquorDecorator{
    public Lime(Liquor drink){
        this.drink = drink;
    }
    public int getCalorie(){
        return 2 + drink.getCalorie();
    }
}