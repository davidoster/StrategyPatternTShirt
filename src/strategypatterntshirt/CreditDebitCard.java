/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterntshirt;

import interfaces.IPayment;

/**
 *
 * @author George.Pasparakis
 */
public class CreditDebitCard implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Credit / Debit transaction!\n", amount);
        return(true);
    }
    
}
