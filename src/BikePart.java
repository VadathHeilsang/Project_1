public class BikePart {
    public String partName="";
    public String partNumber="";
    public String price="";
    public String salesPrice="";
    public boolean onSale=false;

    public BikePart(String partName, String partNumber, String price, String salesPrice, boolean onSale)
    {
        this.partName=partName;
        this.partNumber=partNumber;
        this.price=price;
        this.salesPrice=salesPrice;
        this.onSale=onSale;
    }

    public String getPartName(){
        return partName;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public String getPrice(){
        return price;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public boolean isOnSale(){
        return onSale;
    }
}
