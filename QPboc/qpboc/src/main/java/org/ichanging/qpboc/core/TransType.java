package org.ichanging.qpboc.core;

/**
 * Created by ChangingP on 16/6/16.
 */
public enum TransType
{
    TRANS_GOODS_AND_SERVICES_DEBITS ,
    TRANS_CASH_DEBITS ,
    TRANS_ADJUSTMENT_DEBITS ,
    TRANS_CHEQUE_GUARANTEE_DEBITS ,
    TRANS_CHEQUE_VERIFICATION_DEBITS ,
    TRANS_EURO_CHEQUE_DEBITS ,
    TRANS_TRAVELLER_CHEQUE_DEBITS ,
    TRANS_LETTER_OF_CREDIT_DEBITS ,
    TRANS_POSTAL_BANKING_DEBITS ,
    TRANS_GOODS_AND_SERVICES_WITH_CASH_DEBITS ,

    TRANS_CASH_BACK ,
    TRANS_RETURN_CREDITS ,
    TRANS_DEPOSITS_CREDITS ,
    TRANS_ADJUSTMENT_CREDITS ,
    TRANS_CHEQUE_DEPOSIT_GUARANTEE ,
    TRANS_CHEQUE_DEPOSIT ,

    TRANS_AVAILABLE_FUNDS_INQUIRY ,
    TRANS_BALANCE_INQUIRY ,
    TRANS_ACCOUNT_VERIFICATION ,

    TRANS_CARDHOLDER_ACCOUNT_TRANSFER ,

    TRANS_LOAD ,
    TRANS_NOT_APPOINTED_LOAD ,
    TRANS_CASH_SAVING ,

    TRANS_PBOCLOG ,
    TRANS_OFFLINE_BALANCE
}