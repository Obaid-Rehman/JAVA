/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.models;

import build.mypayquicker.platform.DateTimeHelper;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;

/**
 * This is a model class for Payment type.
 */
public class Payment {
    private double amount;
    private CurrencyTypesEnum currency;
    private String sourceToken;
    private String destinationToken;
    private String notes;
    private String memo;
    private PaymentPurposeTypesEnum purpose;
    private String clientPaymentId;
    private Boolean autoAcceptQuote;
    private LocalDateTime expires;
    private LocalDateTime notBefore;
    private LocalDateTime notAfter;
    private TransferStatusTypesEnum status;

    /**
     * Default constructor.
     */
    public Payment() {
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
     * @param  expires  LocalDateTime value for expires.
     * @param  notBefore  LocalDateTime value for notBefore.
     * @param  notAfter  LocalDateTime value for notAfter.
     * @param  status  TransferStatusTypesEnum value for status.
     */
    public Payment(
            double amount,
            CurrencyTypesEnum currency,
            String sourceToken,
            String destinationToken,
            String notes,
            String memo,
            PaymentPurposeTypesEnum purpose,
            String clientPaymentId,
            Boolean autoAcceptQuote,
            LocalDateTime expires,
            LocalDateTime notBefore,
            LocalDateTime notAfter,
            TransferStatusTypesEnum status) {
        this.amount = amount;
        this.currency = currency;
        this.sourceToken = sourceToken;
        this.destinationToken = destinationToken;
        this.notes = notes;
        this.memo = memo;
        this.purpose = purpose;
        this.clientPaymentId = clientPaymentId;
        this.autoAcceptQuote = autoAcceptQuote;
        this.expires = expires;
        this.notBefore = notBefore;
        this.notAfter = notAfter;
        this.status = status;
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
     * Getter for Expires.
     * Quote expiration, ISO-8601 format, UTC by default unless overridden.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expires")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpires() {
        return expires;
    }

    /**
     * Setter for Expires.
     * Quote expiration, ISO-8601 format, UTC by default unless overridden.
     * @param expires Value for LocalDateTime
     */
    @JsonSetter("expires")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpires(LocalDateTime expires) {
        this.expires = expires;
    }

    /**
     * Getter for NotBefore.
     * Transfer is scheduled and will not process before this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notBefore")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotBefore() {
        return notBefore;
    }

    /**
     * Setter for NotBefore.
     * Transfer is scheduled and will not process before this time.
     * @param notBefore Value for LocalDateTime
     */
    @JsonSetter("notBefore")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotBefore(LocalDateTime notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * Getter for NotAfter.
     * Transfer expires if not completed prior to this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notAfter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotAfter() {
        return notAfter;
    }

    /**
     * Setter for NotAfter.
     * Transfer expires if not completed prior to this time.
     * @param notAfter Value for LocalDateTime
     */
    @JsonSetter("notAfter")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotAfter(LocalDateTime notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * Getter for Status.
     * Current status of a transfer
     * @return Returns the TransferStatusTypesEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransferStatusTypesEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of a transfer
     * @param status Value for TransferStatusTypesEnum
     */
    @JsonSetter("status")
    public void setStatus(TransferStatusTypesEnum status) {
        this.status = status;
    }

    /**
     * Converts this Payment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Payment [" + "amount=" + amount + ", currency=" + currency + ", sourceToken="
                + sourceToken + ", destinationToken=" + destinationToken + ", notes=" + notes
                + ", memo=" + memo + ", purpose=" + purpose + ", clientPaymentId=" + clientPaymentId
                + ", autoAcceptQuote=" + autoAcceptQuote + ", expires=" + expires + ", notBefore="
                + notBefore + ", notAfter=" + notAfter + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link Payment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Payment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, currency)
                .sourceToken(getSourceToken())
                .destinationToken(getDestinationToken())
                .notes(getNotes())
                .memo(getMemo())
                .purpose(getPurpose())
                .clientPaymentId(getClientPaymentId())
                .autoAcceptQuote(getAutoAcceptQuote())
                .expires(getExpires())
                .notBefore(getNotBefore())
                .notAfter(getNotAfter())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link Payment}.
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
        private LocalDateTime expires;
        private LocalDateTime notBefore;
        private LocalDateTime notAfter;
        private TransferStatusTypesEnum status;

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
         * Setter for expires.
         * @param  expires  LocalDateTime value for expires.
         * @return Builder
         */
        public Builder expires(LocalDateTime expires) {
            this.expires = expires;
            return this;
        }

        /**
         * Setter for notBefore.
         * @param  notBefore  LocalDateTime value for notBefore.
         * @return Builder
         */
        public Builder notBefore(LocalDateTime notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * Setter for notAfter.
         * @param  notAfter  LocalDateTime value for notAfter.
         * @return Builder
         */
        public Builder notAfter(LocalDateTime notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  TransferStatusTypesEnum value for status.
         * @return Builder
         */
        public Builder status(TransferStatusTypesEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link Payment} object using the set fields.
         * @return {@link Payment}
         */
        public Payment build() {
            return new Payment(amount, currency, sourceToken, destinationToken, notes, memo,
                    purpose, clientPaymentId, autoAcceptQuote, expires, notBefore, notAfter,
                    status);
        }
    }
}
