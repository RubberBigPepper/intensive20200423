import java.util.LinkedList;

public class CoffeeMachine {
    private LinkedList<Drink> listDrinks=new LinkedList<>();
    private int amountMoney;

    public CoffeeMachine(int nAmount){
        addDrinkToList("капуччино", 150);
        addDrinkToList("эспрессо", 120);
        addDrinkToList("вода", 10);
        addDrinkToList("молоко", 50);
        addDrinkToList("сок", 70);
        amountMoney=nAmount;
    }

    private void addDrinkToList(String strName, int nPrice){
        Drink cDrink=new Drink(strName,nPrice);
        if(listDrinks.indexOf(cDrink)<0)//добавляем уникальный напиток, проверяем есть ли такой напиток
            listDrinks.add(cDrink);
    }
    public void checkPrices(LinkedList<Drink> drinks, int nAmount){
        for(Drink oneDrink:drinks){
            printInfo(oneDrink,nAmount);
        }
    }
    private void printInfo(Drink oneDrink, int nAmount){
        if(nAmount>=oneDrink.PRICE)
            System.out.println("Вы можете купить "+oneDrink.NAME);
        else
            System.out.println("Вы НЕ можете купить "+oneDrink.NAME);
    }

    public void checkPrices(){
        checkPrices(listDrinks,amountMoney);
    }
}

