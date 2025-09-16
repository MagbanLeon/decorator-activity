//Decorator Activity
//Authored by Z He and Leon Magbanua
public class Main {
    public static void main(String[] args){
        Liquor oldFashioned = new Bourbon();
        oldFashioned = new Bitters(oldFashioned);
        oldFashioned = new Bitters(oldFashioned);
        oldFashioned = new Cherry(oldFashioned);
        oldFashioned = new Lime(oldFashioned);
        System.out.println("This drink has " + oldFashioned.getCalorie() + " calories!\n");

        Liquor vodkaGimlet = new Vodka();
        vodkaGimlet = new LimeJuice(vodkaGimlet);
        vodkaGimlet = new Lime(vodkaGimlet);
        System.out.println("This drink has " + vodkaGimlet.getCalorie() + " calories!\n");

        Liquor Manhattan = new Bourbon();
        Manhattan = new Vermouth(Manhattan);
        Manhattan = new Vermouth(Manhattan);
        Manhattan = new Cherry(Manhattan);
        Manhattan = new Bitters(Manhattan);
        System.out.println("This drink has " + Manhattan.getCalorie() + " calories!\n");

        Liquor TomCollins = new Gin();
        TomCollins = new LimeJuice(TomCollins);
        TomCollins = new LimeJuice(TomCollins);
        TomCollins = new Sugar(TomCollins);
        TomCollins = new Sugar(TomCollins);
        TomCollins = new Lime(TomCollins);
        System.out.println("This drink has " + TomCollins.getCalorie() + " calories!\n");
    }
}
