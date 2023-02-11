package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    public boolean isaddChees = false;
    public boolean isaddtopping = false;

    public boolean isbill = false;

    public boolean istake = false;





    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price =300;
            this.topping = 70;
        }
            else
        {
            this.price=400;
            this.topping =120;

        }
            this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(!isaddChees)
       {
           this.price+=80;
           isaddChees = true;
       }
    }

    public void addExtraToppings(){
       if(!isaddtopping)
       {
           this.price+=this.topping;
           isaddtopping=true;
       }
    }

    public void addTakeaway(){
     if(!istake)
     {
         this.price+=20;
         istake=true;
     }
    }

    public String getBill(){
        if(!isbill)
        {
            if(isaddChees)
            {
                this.bill+="Extra Cheese Added: 80"+"\n";
            }
            if(isaddtopping)
            {
                this.bill+="Extra Toppings Added: "+this.topping+"\n";
            }
            if(istake)
            {
                this.bill+="Paperbag Added: 20";
            }
            isbill = true;
            return this.bill+="Total Price: "+this.price;

        }
        return "";


    }
}
