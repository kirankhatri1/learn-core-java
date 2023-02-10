package com.kiran.oops;

public class EducationLoan extends Loan {

public void getUniversityDetails() {
 System.out.println("map is ready");
}

public static void main(String[] args) {
 EducationLoan c = new EducationLoan();
 c.getRequiredCurrentAccount();
 c.getPropertyDeposit();
 c.getUniversityDetails();
}


}
