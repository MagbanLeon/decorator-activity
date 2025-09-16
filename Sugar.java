public class Sugar extends LiquorDecorator{
    public Sugar(Liquor drink){
        this.drink = drink;
    }
    public int getCalorie(){
        return 300 + drink.getCalorie();
    }
}