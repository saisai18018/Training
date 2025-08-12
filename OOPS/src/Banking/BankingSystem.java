package Banking;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterestCalculator interestCalculator = new InterestCalculator() {

            public double calculateInterest(double principal, double rate, int time) {
            	
                return (principal * rate * time) / 100;
            }
        };
        
        
        double interest = interestCalculator.calculateInterest(10000, 5, 2);
        System.out.println("Simple Interest: " + interest);

        
        // EMI Calculator Interface Anonymous Class 
        
        // Formula [P x R x (1+R)^N] / [(1+R)^N ]
        
        EMICalculator emiCalculator = new EMICalculator() {

            public double calculateEMI(double principal, double annualRate, int months) {
            	
                double monthlyRate = annualRate / (12 * 100);
                return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
                       (Math.pow(1 + monthlyRate, months) - 1);
            }
        };
        
        
        double emi = emiCalculator.calculateEMI(500000, 7.5, 60);
        System.out.printf("Monthly EMI: ", emi);

        
        // Currency Converter Interface Anonymous Class
        
        
        CurrencyConverter currencyConverter = new CurrencyConverter() {

            public double convertToUSD(double inrAmount) {
            	
                double exchangeRate = 86.53; 
                return inrAmount / exchangeRate;
            }
        };
        
        
        double usd = currencyConverter.convertToUSD(86.53);
        System.out.printf("Converted USD: ", usd);
	}

}
