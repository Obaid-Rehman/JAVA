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
 * This is a model class for SourceMonetaryRequired type.
 */
public class SourceMonetaryRequired {
    private Double sourceAmount;
    private CurrencyTypesEnum sourceCurrency;

    /**
     * Default constructor.
     */
    public SourceMonetaryRequired() {
    }

    /**
     * Initialization constructor.
     * @param  sourceAmount  Double value for sourceAmount.
     * @param  sourceCurrency  CurrencyTypesEnum value for sourceCurrency.
     */
    public SourceMonetaryRequired(
            Double sourceAmount,
            CurrencyTypesEnum sourceCurrency) {
        this.sourceAmount = sourceAmount;
        this.sourceCurrency = sourceCurrency;
    }

    /**
     * Getter for SourceAmount.
     * Amount of the transfer in the specified currency.
     * @return Returns the Double
     */
    @JsonGetter("sourceAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getSourceAmount() {
        return sourceAmount;
    }

    /**
     * Setter for SourceAmount.
     * Amount of the transfer in the specified currency.
     * @param sourceAmount Value for Double
     */
    @JsonSetter("sourceAmount")
    public void setSourceAmount(Double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    /**
     * Getter for SourceCurrency.
     * Currency code type for the object
     * @return Returns the CurrencyTypesEnum
     */
    @JsonGetter("sourceCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyTypesEnum getSourceCurrency() {
        return sourceCurrency;
    }

    /**
     * Setter for SourceCurrency.
     * Currency code type for the object
     * @param sourceCurrency Value for CurrencyTypesEnum
     */
    @JsonSetter("sourceCurrency")
    public void setSourceCurrency(CurrencyTypesEnum sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    /**
     * Converts this SourceMonetaryRequired into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SourceMonetaryRequired [" + "sourceAmount=" + sourceAmount + ", sourceCurrency="
                + sourceCurrency + "]";
    }

    /**
     * Builds a new {@link SourceMonetaryRequired.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SourceMonetaryRequired.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sourceAmount(getSourceAmount())
                .sourceCurrency(getSourceCurrency());
        return builder;
    }

    /**
     * Class to build instances of {@link SourceMonetaryRequired}.
     */
    public static class Builder {
        private Double sourceAmount;
        private CurrencyTypesEnum sourceCurrency;



        /**
         * Setter for sourceAmount.
         * @param  sourceAmount  Double value for sourceAmount.
         * @return Builder
         */
        public Builder sourceAmount(Double sourceAmount) {
            this.sourceAmount = sourceAmount;
            return this;
        }

        /**
         * Setter for sourceCurrency.
         * @param  sourceCurrency  CurrencyTypesEnum value for sourceCurrency.
         * @return Builder
         */
        public Builder sourceCurrency(CurrencyTypesEnum sourceCurrency) {
            this.sourceCurrency = sourceCurrency;
            return this;
        }

        /**
         * Builds a new {@link SourceMonetaryRequired} object using the set fields.
         * @return {@link SourceMonetaryRequired}
         */
        public SourceMonetaryRequired build() {
            return new SourceMonetaryRequired(sourceAmount, sourceCurrency);
        }
    }
}