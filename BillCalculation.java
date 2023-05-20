class BillCalculation{
	static void calculateBill(String prodName, int prodCost, int prodQuantity){
		int totalAmount;
		totalAmount = prodCost * prodQuantity;
		int iDiscount;
		iDiscount = totalAmount * 10/100;
		int finalPrice;
		finalPrice = totalAmount - iDiscount;
		System.out.println("Your total amount before discount for: "+ prodName + " is: "+ totalAmount);
		System.out.println("Your discount is: "+ iDiscount);
		System.out.println("Your final price: "+ finalPrice);
	}
	public static void main(String[] args){
	 BillCalculation.calculateBill("Coffee",20,5);
	 BillCalculation.calculateBill("Computer",150,44);
	 BillCalculation.calculateBill("Toys",55,100);
	}
}