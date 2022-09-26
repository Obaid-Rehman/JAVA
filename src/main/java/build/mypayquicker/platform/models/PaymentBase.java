/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentBase type.
 */
public class PaymentBase {
    private double amount;
    private CurrencyTypesEnum currency;
    private String sourceToken;
    private String destinationToken;
    private String notes;
    private String memo;
    private PaymentPurposeTypesEnum purpose;
    private String clientPaymentId;
    private Boolean autoAcceptQuote;

    /**
     * Default constructor.
     */
    public PaymentBase() {
    }

    /**
     * Initialization constructor.
     * @param  amount  double value for amount.
     * @param  currency  CurrencyTypesEnum value for currency.
     * @param  sourceToken  String value for sourceToken.
     * @param  destinationToken  String value for destinationToken.
     * @param  notes  String value for notes.
     * @param  memo  String value for memo.
     * @param  purpose  PaymentPurposeTypesEnum value for purpose.
     * @param  clientPaymentId  String value for clientPaymentId.
     * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
     */
    public PaymentBase(
            double amount,
            CurrencyTypesEnum currency,
            String sourceToken,
            String destinationToken,
            String notes,
            String memo,
            PaymentPurposeTypesEnum purpose,
            String clientPaymentId,
            Boolean autoAcceptQuote) {
        this.amount = amount;
        this.currency = currency;
        this.sourceToken = sourceToken;
        this.destinationToken = destinationToken;
        this.notes = notes;
        this.memo = memo;
        this.purpose = purpose;
        this.clientPaymentId = clientPaymentId;
        this.autoAcceptQuote = autoAcceptQuote;
    }

    /**
     * Getter for Amount.
     * Amount of the transfer in the specified currency.
     * @return Returns the double
     */
    @JsonGetter("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount of the transfer in the specified currency.
     * @param amount Value for double
     */
    @JsonSetter("amount")
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * Currency code type for the object
     * @return Returns the CurrencyTypesEnum
     */
    @JsonGetter("currency")
    public CurrencyTypesEnum getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Currency code type for the object
     * @param currency Value for CurrencyTypesEnum
     */
    @JsonSetter("currency")
    public void setCurrency(CurrencyTypesEnum currency) {
        this.currency = currency;
    }

    /**
     * Getter for SourceToken.
     * Unique identifier representing the source of funds.
     * @return Returns the String
     */
    @JsonGetter("sourceToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceToken() {
        return sourceToken;
    }

    /**
     * Setter for SourceToken.
     * Unique identifier representing the source of funds.
     * @param sourceToken Value for String
     */
    @JsonSetter("sourceToken")
    public void setSourceToken(String sourceToken) {
        this.sourceToken = sourceToken;
    }

    /**
     * Getter for DestinationToken.
     * Unique identifier representing the destination of funds.
     * @return Returns the String
     */
    @JsonGetter("destinationToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationToken() {
        return destinationToken;
    }

    /**
     * Setter for DestinationToken.
     * Unique identifier representing the destination of funds.
     * @param destinationToken Value for String
     */
    @JsonSetter("destinationToken")
    public void setDestinationToken(String destinationToken) {
        this.destinationToken = destinationToken;
    }

    /**
     * Getter for Notes.
     * Optional comments visible to the user.
     * @return Returns the String
     */
    @JsonGetter("notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNotes() {
        return notes;
    }

    /**
     * Setter for Notes.
     * Optional comments visible to the user.
     * @param notes Value for String
     */
    @JsonSetter("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Getter for Memo.
     * Optional internal memo not visible to the user.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * Optional internal memo not visible to the user.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Purpose.
     * Used to identify the purpose of a payment and impacts reporting and calculated taxable
     * earnings (if utilizing tax services)
     * @return Returns the PaymentPurposeTypesEnum
     */
    @JsonGetter("purpose")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentPurposeTypesEnum getPurpose() {
        return purpose;
    }

    /**
     * Setter for Purpose.
     * Used to identify the purpose of a payment and impacts reporting and calculated taxable
     * earnings (if utilizing tax services)
     * @param purpose Value for PaymentPurposeTypesEnum
     */
    @JsonSetter("purpose")
    public void setPurpose(PaymentPurposeTypesEnum purpose) {
        this.purpose = purpose;
    }

    /**
     * Getter for ClientPaymentId.
     * Unique value provided by the client for the payment.
     * @return Returns the String
     */
    @JsonGetter("clientPaymentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientPaymentId() {
        return clientPaymentId;
    }

    /**
     * Setter for ClientPaymentId.
     * Unique value provided by the client for the payment.
     * @param clientPaymentId Value for String
     */
    @JsonSetter("clientPaymentId")
    public void setClientPaymentId(String clientPaymentId) {
        this.clientPaymentId = clientPaymentId;
    }

    /**
     * Getter for AutoAcceptQuote.
     * Determines whether the quote is automatically accepted or if a POST utilizing the token for
     * the quote is required.
     * @return Returns the Boolean
     */
    @JsonGetter("autoAcceptQuote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoAcceptQuote() {
        return autoAcceptQuote;
    }

    /**
     * Setter for AutoAcceptQuote.
     * Determines whether the quote is automatically accepted or if a POST utilizing the token for
     * the quote is required.
     * @param autoAcceptQuote Value for Boolean
     */
    @JsonSetter("autoAcceptQuote")
    public void setAutoAcceptQuote(Boolean autoAcceptQuote) {
        this.autoAcceptQuote = autoAcceptQuote;
    }

    /**
     * Converts this PaymentBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentBase [" + "amount=" + amount + ", currency=" + currency + ", sourceToken="
                + sourceToken + ", destinationToken=" + destinationToken + ", notes=" + notes
                + ", memo=" + memo + ", purpose=" + purpose + ", clientPaymentId=" + clientPaymentId
                + ", autoAcceptQuote=" + autoAcceptQuote + "]";
    }

    /**
     * Builds a new {@link PaymentBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, currency)
                .sourceToken(getSourceToken())
                .destinationToken(getDestinationToken())
                .notes(getNotes())
                .memo(getMemo())
                .purpose(getPurpose())
                .clientPaymentId(getClientPaymentId())
                .autoAcceptQuote(getAutoAcceptQuote());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentBase}.
     */
    public static class Builder {
        private double amount;
        private CurrencyTypesEnum currency;
        private String sourceToken;
        private String destinationToken;
        private String notes;
        private String memo;
        private PaymentPurposeTypesEnum purpose;
        private String clientPaymentId;
        private Boolean autoAcceptQuote;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  double value for amount.
         * @param  currency  CurrencyTypesEnum value for currency.
         */
        public Builder(double amount, CurrencyTypesEnum currency) {
            this.amount = amount;
            this.currency = currency;
        }

        /**
         * Setter for amount.
         * @param  amount  double value for amount.
         * @return Builder
         */
        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  CurrencyTypesEnum value for currency.
         * @return Builder
         */
        public Builder currency(CurrencyTypesEnum currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for sourceToken.
         * @param  sourceToken  String value for sourceToken.
         * @return Builder
         */
        public Builder sourceToken(String sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }

        /**
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
            return this;
        }

        /**
         * Setter for notes.
         * @param  notes  String value for notes.
         * @return Builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for purpose.
         * @param  purpose  PaymentPurposeTypesEnum value for purpose.
         * @return Builder
         */
        public Builder purpose(PaymentPurposeTypesEnum purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * Setter for clientPaymentId.
         * @param  clientPaymentId  String value for clientPaymentId.
         * @return Builder
         */
        public Builder clientPaymentId(String clientPaymentId) {
            this.clientPaymentId = clientPaymentId;
            return this;
        }

        /**
         * Setter for autoAcceptQuote.
         * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
         * @return Builder
         */
        public Builder autoAcceptQuote(Boolean autoAcceptQuote) {
            this.autoAcceptQuote = autoAcceptQuote;
            return this;
        }

        /**
         * Builds a new {@link PaymentBase} object using the set fields.
         * @return {@link PaymentBase}
         */
        public PaymentBase build() {
            return new PaymentBase(amount, currency, sourceToken, destinationToken, notes, memo,
                    purpose, clientPaymentId, autoAcceptQuote);
        }
    }
}