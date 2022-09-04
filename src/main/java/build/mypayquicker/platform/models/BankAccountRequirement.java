/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BankAccountRequirement type.
 */
public class BankAccountRequirement {
    private CountryTypesEnum bankCountry;
    private CurrencyTypesEnum bankCurrency;
    private CountryTypesEnum sourceCountry;
    private CurrencyTypesEnum sourceCurrency;
    private List<BankAccountRequiredFields> requirements;
    private MonetaryFormatted quote;

    /**
     * Default constructor.
     */
    public BankAccountRequirement() {
    }

    /**
     * Initialization constructor.
     * @param  bankCountry  CountryTypesEnum value for bankCountry.
     * @param  bankCurrency  CurrencyTypesEnum value for bankCurrency.
     * @param  sourceCountry  CountryTypesEnum value for sourceCountry.
     * @param  sourceCurrency  CurrencyTypesEnum value for sourceCurrency.
     * @param  requirements  List of BankAccountRequiredFields value for requirements.
     * @param  quote  MonetaryFormatted value for quote.
     */
    public BankAccountRequirement(
            CountryTypesEnum bankCountry,
            CurrencyTypesEnum bankCurrency,
            CountryTypesEnum sourceCountry,
            CurrencyTypesEnum sourceCurrency,
            List<BankAccountRequiredFields> requirements,
            MonetaryFormatted quote) {
        this.bankCountry = bankCountry;
        this.bankCurrency = bankCurrency;
        this.sourceCountry = sourceCountry;
        this.sourceCurrency = sourceCurrency;
        this.requirements = requirements;
        this.quote = quote;
    }

    /**
     * Getter for BankCountry.
     * Two-digit country code types
     * @return Returns the CountryTypesEnum
     */
    @JsonGetter("bankCountry")
    public CountryTypesEnum getBankCountry() {
        return bankCountry;
    }

    /**
     * Setter for BankCountry.
     * Two-digit country code types
     * @param bankCountry Value for CountryTypesEnum
     */
    @JsonSetter("bankCountry")
    public void setBankCountry(CountryTypesEnum bankCountry) {
        this.bankCountry = bankCountry;
    }

    /**
     * Getter for BankCurrency.
     * Currency code type for the object
     * @return Returns the CurrencyTypesEnum
     */
    @JsonGetter("bankCurrency")
    public CurrencyTypesEnum getBankCurrency() {
        return bankCurrency;
    }

    /**
     * Setter for BankCurrency.
     * Currency code type for the object
     * @param bankCurrency Value for CurrencyTypesEnum
     */
    @JsonSetter("bankCurrency")
    public void setBankCurrency(CurrencyTypesEnum bankCurrency) {
        this.bankCurrency = bankCurrency;
    }

    /**
     * Getter for SourceCountry.
     * Two-digit country code types
     * @return Returns the CountryTypesEnum
     */
    @JsonGetter("sourceCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CountryTypesEnum getSourceCountry() {
        return sourceCountry;
    }

    /**
     * Setter for SourceCountry.
     * Two-digit country code types
     * @param sourceCountry Value for CountryTypesEnum
     */
    @JsonSetter("sourceCountry")
    public void setSourceCountry(CountryTypesEnum sourceCountry) {
        this.sourceCountry = sourceCountry;
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
     * Getter for Requirements.
     * @return Returns the List of BankAccountRequiredFields
     */
    @JsonGetter("requirements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BankAccountRequiredFields> getRequirements() {
        return requirements;
    }

    /**
     * Setter for Requirements.
     * @param requirements Value for List of BankAccountRequiredFields
     */
    @JsonSetter("requirements")
    public void setRequirements(List<BankAccountRequiredFields> requirements) {
        this.requirements = requirements;
    }

    /**
     * Getter for Quote.
     * Object representing monies, including currency, decimal, and formatted amounts
     * @return Returns the MonetaryFormatted
     */
    @JsonGetter("quote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MonetaryFormatted getQuote() {
        return quote;
    }

    /**
     * Setter for Quote.
     * Object representing monies, including currency, decimal, and formatted amounts
     * @param quote Value for MonetaryFormatted
     */
    @JsonSetter("quote")
    public void setQuote(MonetaryFormatted quote) {
        this.quote = quote;
    }

    /**
     * Converts this BankAccountRequirement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountRequirement [" + "bankCountry=" + bankCountry + ", bankCurrency="
                + bankCurrency + ", sourceCountry=" + sourceCountry + ", sourceCurrency="
                + sourceCurrency + ", requirements=" + requirements + ", quote=" + quote + "]";
    }

    /**
     * Builds a new {@link BankAccountRequirement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountRequirement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bankCountry, bankCurrency)
                .sourceCountry(getSourceCountry())
                .sourceCurrency(getSourceCurrency())
                .requirements(getRequirements())
                .quote(getQuote());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountRequirement}.
     */
    public static class Builder {
        private CountryTypesEnum bankCountry;
        private CurrencyTypesEnum bankCurrency;
        private CountryTypesEnum sourceCountry;
        private CurrencyTypesEnum sourceCurrency;
        private List<BankAccountRequiredFields> requirements;
        private MonetaryFormatted quote;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bankCountry  CountryTypesEnum value for bankCountry.
         * @param  bankCurrency  CurrencyTypesEnum value for bankCurrency.
         */
        public Builder(CountryTypesEnum bankCountry, CurrencyTypesEnum bankCurrency) {
            this.bankCountry = bankCountry;
            this.bankCurrency = bankCurrency;
        }

        /**
         * Setter for bankCountry.
         * @param  bankCountry  CountryTypesEnum value for bankCountry.
         * @return Builder
         */
        public Builder bankCountry(CountryTypesEnum bankCountry) {
            this.bankCountry = bankCountry;
            return this;
        }

        /**
         * Setter for bankCurrency.
         * @param  bankCurrency  CurrencyTypesEnum value for bankCurrency.
         * @return Builder
         */
        public Builder bankCurrency(CurrencyTypesEnum bankCurrency) {
            this.bankCurrency = bankCurrency;
            return this;
        }

        /**
         * Setter for sourceCountry.
         * @param  sourceCountry  CountryTypesEnum value for sourceCountry.
         * @return Builder
         */
        public Builder sourceCountry(CountryTypesEnum sourceCountry) {
            this.sourceCountry = sourceCountry;
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
         * Setter for requirements.
         * @param  requirements  List of BankAccountRequiredFields value for requirements.
         * @return Builder
         */
        public Builder requirements(List<BankAccountRequiredFields> requirements) {
            this.requirements = requirements;
            return this;
        }

        /**
         * Setter for quote.
         * @param  quote  MonetaryFormatted value for quote.
         * @return Builder
         */
        public Builder quote(MonetaryFormatted quote) {
            this.quote = quote;
            return this;
        }

        /**
         * Builds a new {@link BankAccountRequirement} object using the set fields.
         * @return {@link BankAccountRequirement}
         */
        public BankAccountRequirement build() {
            return new BankAccountRequirement(bankCountry, bankCurrency, sourceCountry,
                    sourceCurrency, requirements, quote);
        }
    }
}
