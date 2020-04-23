import java.util.Objects;

public class Drink {
    public String NAME;
    public int PRICE;
    public Drink(String strName, int nPrice){
        NAME=strName;
        PRICE=nPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(NAME, drink.NAME);//проверяем напитки по имени
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, PRICE);
    }
}


