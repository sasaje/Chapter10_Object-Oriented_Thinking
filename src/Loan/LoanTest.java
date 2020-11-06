package Loan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void getAnnualInterestRate() {
        Loan loan1 = new Loan();
        assertEquals(2.5,loan1.getAnnualInterestRate());
    }

    @Test
    void setAnnualInterestRate() {
        Loan loan2 = new Loan();
        loan2.setAnnualInterestRate(3.5);
        assertEquals(3.5, loan2.getAnnualInterestRate());
    }

    @Test
    void getNumberOfYears() {
        Loan loan3 = new Loan();
        assertEquals(1,loan3.getNumberOfYears());
    }

    @Test
    void setNumberOfYears() {
        Loan loan4 = new Loan();
        loan4.setNumberOfYears(2);
        assertEquals(2,loan4.getNumberOfYears());
    }

    @Test
    void getLoanAmount() {
        Loan loan5 = new Loan();
        assertEquals(1000,loan5.getLoanAmount());
    }

    @Test
    void setLoanAmount() {
        Loan loan6 = new Loan();
        loan6.setLoanAmount(2000);
        assertEquals(2000,loan6.getLoanAmount());
    }

    @Test
    void getMonthlyPayment() {
        Loan loan7 = new Loan(8.25,5,1000);
        assertEquals(20.40, loan7.getMonthlyPayment(), 0.01);
    }

    @Test
    void getTotalPayment() {
        Loan loan8 = new Loan();
        assertEquals(1013.60, loan8.getTotalPayment(), 0.01);
    }

    @Test // OBS! Denne metode kan ikke testes.
    void getLoanDate() {
        Loan loan9 = new Loan();
        assertEquals(10, loan9.getLoanDate());
    }
}