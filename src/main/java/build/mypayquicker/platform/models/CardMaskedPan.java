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
 * This is a model class for CardMaskedPan type.
 */
public class CardMaskedPan {
    private String cardNumber;

    /**
     * Default constructor.
     */
    public CardMaskedPan() {
    }

    /**
     * Initialization constructor.
     * @param  cardNumber  String value for cardNumber.
     */
    public CardMaskedPan(
            String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Getter for CardNumber.
     * Masked card number with only the first 6 and last 4 digits visible
     * @return Returns the String
     */
    @JsonGetter("cardNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter for CardNumber.
     * Masked card number with only the first 6 and last 4 digits visible
     * @param cardNumber Value for String
     */
    @JsonSetter("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Converts this CardMaskedPan into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardMaskedPan [" + "cardNumber=" + cardNumber + "]";
    }

    /**
     * Builds a new {@link CardMaskedPan.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardMaskedPan.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardNumber(getCardNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link CardMaskedPan}.
     */
    public static class Builder {
        private String cardNumber;



        /**
         * Setter for cardNumber.
         * @param  cardNumber  String value for cardNumber.
         * @return Builder
         */
        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * Builds a new {@link CardMaskedPan} object using the set fields.
         * @return {@link CardMaskedPan}
         */
        public CardMaskedPan build() {
            return new CardMaskedPan(cardNumber);
        }
    }
}
