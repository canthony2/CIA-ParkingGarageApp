package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CustomerReceipt implements ReceiptStrategyObject {

    @Override
    public void setBusinessName(String businessName) {
        if(businessName == null || businessName.isEmpty()) {
            System.out.println("Please enter a valid business name");
        }
    }

}
