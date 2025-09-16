public class LimeJuice extends LiquorDecorator{
    public LimeJuice(Liquor drink){
        this.drink = drink;
    }
    public int getCalorie(){
        return 8 + drink.getCalorie();
    }
}