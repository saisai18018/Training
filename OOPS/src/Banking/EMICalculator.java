package Banking;

public interface EMICalculator {
	
    double calculateEMI(double principal, double annualRate, int months);
}
