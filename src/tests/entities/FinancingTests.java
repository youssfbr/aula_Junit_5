package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {

        // arrange

        // action
        final Financing financing = new Financing(100000.0 , 2000.0 , 80);

        // assertion
        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());

    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        // arrange

        // action

        // assertion
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Financing financing = new Financing(100000.0 , 2000.0 , 20);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {

        // arrange
        final Financing financing = new Financing(100000.0 , 2000.0 , 80);

        // action
        financing.setTotalAmount(90000.0);

        // assert
        Assertions.assertEquals(90000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Financing financing = new Financing(100000.0 , 2000.0 , 20);
            financing.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {

        // arrange
        final Financing financing = new Financing(100000.0 , 2000.0 , 80);

        // action
        financing.setIncome(2100.0);

        // assert
        Assertions.assertEquals(2100.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Financing financing = new Financing(100000.0 , 2000.0 , 20);
            financing.setIncome(1900.0);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {

        // arrange
        final Financing financing = new Financing(100000.0 , 2000.0 , 80);

        // action
        financing.setMonths(81);

        // assert
        Assertions.assertEquals(81, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Financing financing = new Financing(100000.0 , 2000.0 , 20);
            financing.setMonths(79);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly() {

        // arrange
        final Financing financing = new Financing(100000.0 , 2000.0 , 80);

        // assert
        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly() {

        // arrange
        final Financing financing = new Financing(100000.0 , 2000.0 , 80);

        // assert
        Assertions.assertEquals(1000.0, financing.quota());
    }

}
