

package com.example.zzz_fastfood_test1;


import javafx.event.ActionEvent;

import java.io.FileNotFoundException;

public class FastFoodController {
    private static OrderList menuList = new OrderList();


    //private static OrderList menuPrice = new OrderList();


    //boolean quit = false; //Boolean statement to quit application.
    //int selection = 0;  int variable to store users selection.



        public void btnHamburger (ActionEvent e){
            menuList.addOrderItem("Hamburger");
            menuList.addOrderPrice(8.50);
            System.out.println("Hamburger");
    }

        public void btnChickenTenders (ActionEvent e){
            menuList.addOrderItem("Chicken Tenders");
            menuList.addOrderPrice(9.00);
            System.out.println("Chicken Tenders");
    }

        public void btnHotDog (ActionEvent e){
            menuList.addOrderItem("Hot Dog");
            menuList.addOrderPrice(6.00);
            System.out.println("Hot Dog");
    }

        public void btnCheeseSteak (ActionEvent e){
            menuList.addOrderItem("Cheese Steak");
            menuList.addOrderPrice(10.25);
            System.out.println("Cheese Steak");
    }

        public void btnChickenCheeseSteak (ActionEvent e){
            menuList.addOrderItem("Chicken Cheese Steak");
            menuList.addOrderPrice(10.50);
            System.out.println("Chicken Cheese Steak");
    }


        public void btnVeggieBurger (ActionEvent e){
            menuList.addOrderItem("Veggie Burger");
            menuList.addOrderPrice(8.50);
            System.out.println("Veggie burger");

    }

        public void btnCheckOut (ActionEvent e) throws FileNotFoundException {
            menuList.printOrderList();

            //Platform.exit();

        }
        public void setSubTotal()
        {

        }





        }








