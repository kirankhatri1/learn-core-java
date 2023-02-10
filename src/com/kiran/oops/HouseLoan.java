package com.kiran.oops;

import java.util.ArrayList;

public class HouseLoan extends Loan {

// There may be a chance of raising ambiguity problems.
//Interfaces having dummy declarations and they won't have implementations hence no
//ambiguity problem

public void getHouseMap() {
 System.out.println("map is ready");
}

public static void main(String[] args) {
 HouseLoan c = new HouseLoan();
 c.getRequiredCurrentAccount();
 c.getPropertyDeposit();
 c.getHouseMap();
 ArrayList<String> a = new ArrayList();

}

}
