public class Cherry extends LiquorDecorator{
    public Cherry(Liquor drink){
        this.drink = drink;
    }
    public int getCalorie(){
        return 40 + drink.getCalorie();
    }
}