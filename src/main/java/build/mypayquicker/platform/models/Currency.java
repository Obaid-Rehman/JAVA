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
 * This is a model class for Currency type.
 */
public class Currency {
    private CurrencyTypesEnum currency;

    /**
     * Default constructor.
     */
    public Currency() {
    }

    /**
     * Initialization constructor.
     * @param  currency  CurrencyTypesEnum value for currency.
     */
    public Currency(
            CurrencyTypesEnum currency) {
        this.currency = currency;
    }

    /**
     * Getter for Currency.
     * Currency code type for the object
     * @return Returns the CurrencyTypesEnum
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this Currency into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Currency [" + "currency=" + currency + "]";
    }

    /**
     * Builds a new {@link Currency.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Currency.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currency(getCurrency());
        return builder;
    }

    /**
     * Class to build instances of {@link Currency}.
     */
    public static class Builder {
        private CurrencyTypesEnum currency;



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
         * Builds a new {@link Currency} object using the set fields.
         * @return {@link Currency}
         */
        public Currency build() {
            return new Currency(currency);
        }
    }
}
