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
 * This is a model class for FxObject type.
 */
public class FxObject {
    private Double destinationAmount;
    private CurrencyTypesEnum destinationCurrency;
    private Double sourceAmount;
    private CurrencyTypesEnum sourceCurrency;
    private Double rate;

    /**
     * Default constructor.
     */
    public FxObject() {
    }

    /**
     * Initialization constructor.
     * @param  destinationAmount  Double value for destinationAmount.
     * @param  destinationCurrency  CurrencyTypesEnum value for destinationCurrency.
     * @param  sourceAmount  Double value for sourceAmount.
     * @param  sourceCurrency  CurrencyTypesEnum value for sourceCurrency.
     * @param  rate  Double value for rate.
     */
    public FxObject(
            Double destinationAmount,
            CurrencyTypesEnum destinationCurrency,
            Double sourceAmount,
            CurrencyTypesEnum sourceCurrency,
            Double rate) {
        this.destinationAmount = destinationAmount;
        this.destinationCurrency = destinationCurrency;
        this.sourceAmount = sourceAmount;
        this.sourceCurrency = sourceCurrency;
        this.rate = rate;
    }

    /**
     * Getter for DestinationAmount.
     * Amount transferred to the destination
     * @return Returns the Double
     */
    @JsonGetter("destinationAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDestinationAmount() {
        return destinationAmount;
    }

    /**
     * Setter for DestinationAmount.
     * Amount transferred to the destination
     * @param destinationAmount Value for Double
     */
    @JsonSetter("destinationAmount")
    public void setDestinationAmount(Double destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    /**
     * Getter for DestinationCurrency.
     * Currency code type for the object
     * @return Returns the CurrencyTypesEnum
     */
    @JsonGetter("destinationCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyTypesEnum getDestinationCurrency() {
        return destinationCurrency;
    }

    /**
     * Setter for DestinationCurrency.
     * Currency code type for the object
     * @param destinationCurrency Value for CurrencyTypesEnum
     */
    @JsonSetter("destinationCurrency")
    public void setDestinationCurrency(CurrencyTypesEnum destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
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
     * Getter for Rate.
     * Exchange rate
     * @return Returns the Double
     */
    @JsonGetter("rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getRate() {
        return rate;
    }

    /**
     * Setter for Rate.
     * Exchange rate
     * @param rate Value for Double
     */
    @JsonSetter("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * Converts this FxObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FxObject [" + "destinationAmount=" + destinationAmount + ", destinationCurrency="
                + destinationCurrency + ", sourceAmount=" + sourceAmount + ", sourceCurrency="
                + sourceCurrency + ", rate=" + rate + "]";
    }

    /**
     * Builds a new {@link FxObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FxObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .destinationAmount(getDestinationAmount())
                .destinationCurrency(getDestinationCurrency())
                .sourceAmount(getSourceAmount())
                .sourceCurrency(getSourceCurrency())
                .rate(getRate());
        return builder;
    }

    /**
     * Class to build instances of {@link FxObject}.
     */
    public static class Builder {
        private Double destinationAmount;
        private CurrencyTypesEnum destinationCurrency;
        private Double sourceAmount;
        private CurrencyTypesEnum sourceCurrency;
        private Double rate;



        /**
         * Setter for destinationAmount.
         * @param  destinationAmount  Double value for destinationAmount.
         * @return Builder
         */
        public Builder destinationAmount(Double destinationAmount) {
            this.destinationAmount = destinationAmount;
            return this;
        }

        /**
         * Setter for destinationCurrency.
         * @param  destinationCurrency  CurrencyTypesEnum value for destinationCurrency.
         * @return Builder
         */
        public Builder destinationCurrency(CurrencyTypesEnum destinationCurrency) {
            this.destinationCurrency = destinationCurrency;
            return this;
        }

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
         * Setter for rate.
         * @param  rate  Double value for rate.
         * @return Builder
         */
        public Builder rate(Double rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Builds a new {@link FxObject} object using the set fields.
         * @return {@link FxObject}
         */
        public FxObject build() {
            return new FxObject(destinationAmount, destinationCurrency, sourceAmount,
                    sourceCurrency, rate);
        }
    }
}