/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterntshirt;

import interfaces.IPayment;
import models.Color;
import models.Fabric;
import models.Size;
import models.TShirt;

/**
 *
 * @author George.Pasparakis
 */
public class StrategyPatternTShirt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TShirt tshirt = new TShirt("MARCO POLO", Color.RED, Size.XS, Fabric.WOOL);
        StrategyPatternTShirt myMainClass = new StrategyPatternTShirt();
        
        // CreditDebitCard
        IPayment payment = new CreditDebitCard();
        myMainClass.makeAnOrder(tshirt, payment);
        
        // MoneyBankTransfer
        payment = new MoneyBankTransfer();
        myMainClass.makeAnOrder(tshirt, payment);
        
        // Cash
    }
    
    public void makeAnOrder(TShirt tshirt, IPayment payment) {
        payment.pay(320f);
        
        
    }
    
}
