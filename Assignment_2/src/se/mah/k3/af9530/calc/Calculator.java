package se.mah.k3.af9530.calc;

	/**Class that simulates a calculator*/
	public class Calculator {
		private String operator;
		private double result;
		private double operand;
		private boolean calcMode;
		
		/**Creates  a new calculator instance*/
		public Calculator() {
			this.operator = "";
			this.result = 0;
			this.operand = 0; //http://en.wikipedia.org/wiki/Operand
			this.calcMode=true;
		}
		
		/** returns the operator */
		public String getOperator(){
			return this.operator;
		}
		
		/**returns result*/
		public double getResult(){
			if (result !=0){
			return result;
			}
			else{
				return Double.valueOf(result);
			}
		}
		//så här borde jag gjort... :(
//		public String getResult(){
//			if (result !=0){
//			return Double.toString(result);
//			}
//			else{
//				return Double.toString(result);
//			}
//		}
		public double getOperand(){
			return this.operand;	
		}
		
		double getNumber(String display) {
			return Double.parseDouble(display);
		}


			//Pressed Number on Calculator
		public void numberButtonPressed(int number){
			if(operand !=0){
		  this.operand = (this.operand*10) + number;
			}
			else{
				this.operand = number;
			}
		}
		
		/**clears all including operand and result*/
		public void clear(){
			this.operator = "";
			this.result = 0;
			this.operand = 0;
			
		}
		
		public void plus(){
		   this.result = (result + operand);
		   this.operand = 0;
		   this.operator = "+";
		   
		}
		
		public void minus(){
			if (result != 0){
			result = (result - operand);
			}
			else {
				result = operand;
			}
			operand = 0;
			operator = "-";
		}
		
		public void mult(){
			if (result != 0){ //if the number on the screen is not zero
			result = (result * operand); //multiply with the number entered
			}
			else{
				result = operand; //otherwise put it in the display as is
			}
			operand = 0;
			operator = "*";
		}
		public void div(){
			if (result != 0){
			result = (result/operand);
			}
			else {
				result = operand;
			}
			operand = 0;
			operator = "/";
		}
		
		public void equals(){
			if (operator.equals("*")){
				result = result * operand;
			}else if(operator.equals("-")){
				result = result - operand;
			}else if(operator.equals("+")){
				result = result + operand;
			}else if(operator.equals("/")){
				result = result / operand;
			}
			operand = 0;
			calcMode=false;			
		}



		
	}

