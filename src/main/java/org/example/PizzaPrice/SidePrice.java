package org.example.PizzaPrice;


import org.example.ENUMS.Side;

public class SidePrice
{
    private Side sideItem;

    public SidePrice(Side sideItem) {
        this.sideItem = sideItem;
    }

    public Side getSideItem() {
        return sideItem;
    }

    public void setSideItem(Side sideItem) {
        this.sideItem = sideItem;
    }

    public double getPrice()
    {
        double price;
        switch (sideItem)
        {
            case GARLIC_KNOTS:
                price = 1.5;
                break;
            default:
                price = 0;
        }
        return price;
    }
}
