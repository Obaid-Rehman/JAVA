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
 * This is a model class for BankAccountFields type.
 */
public class BankAccountFields {
    private BankAccountOwnershipTypesEnum bankAccountOwnershipType;
    private BankAccountTypesEnum type;
    private List<KeyValuePairBankFieldTypesString> fields;
    private CurrencyTypesEnum bankCurrency;
    private CountryTypesEnum bankCountry;
    private String description;

    /**
     * Default constructor.
     */
    public BankAccountFields() {
    }

    /**
     * Initialization constructor.
     * @param  bankAccountOwnershipType  BankAccountOwnershipTypesEnum value for
     *         bankAccountOwnershipType.
     * @param  type  BankAccountTypesEnum value for type.
     * @param  fields  List of KeyValuePairBankFieldTypesString value for fields.
     * @param  bankCurrency  CurrencyTypesEnum value for bankCurrency.
     * @param  bankCountry  CountryTypesEnum value for bankCountry.
     * @param  description  String value for description.
     */
    public BankAccountFields(
            BankAccountOwnershipTypesEnum bankAccountOwnershipType,
            BankAccountTypesEnum type,
            List<KeyValuePairBankFieldTypesString> fields,
            CurrencyTypesEnum bankCurrency,
            CountryTypesEnum bankCountry,
            String description) {
        this.bankAccountOwnershipType = bankAccountOwnershipType;
        this.type = type;
        this.fields = fields;
        this.bankCurrency = bankCurrency;
        this.bankCountry = bankCountry;
        this.description = description;
    }

    /**
     * Getter for BankAccountOwnershipType.
     * Account ownership types
     * @return Returns the BankAccountOwnershipTypesEnum
     */
    @JsonGetter("bankAccountOwnershipType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountOwnershipTypesEnum getBankAccountOwnershipType() {
        return bankAccountOwnershipType;
    }

    /**
     * Setter for BankAccountOwnershipType.
     * Account ownership types
     * @param bankAccountOwnershipType Value for BankAccountOwnershipTypesEnum
     */
    @JsonSetter("bankAccountOwnershipType")
    public void setBankAccountOwnershipType(BankAccountOwnershipTypesEnum bankAccountOwnershipType) {
        this.bankAccountOwnershipType = bankAccountOwnershipType;
    }

    /**
     * Getter for Type.
     * Financial purpose of the bank account (&lt;i&gt;Savings&lt;/i&gt;, &lt;i&gt;Investment&lt;/i&gt;)
     * @return Returns the BankAccountTypesEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountTypesEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Financial purpose of the bank account (&lt;i&gt;Savings&lt;/i&gt;, &lt;i&gt;Investment&lt;/i&gt;)
     * @param type Value for BankAccountTypesEnum
     */
    @JsonSetter("type")
    public void setType(BankAccountTypesEnum type) {
        this.type = type;
    }

    /**
     * Getter for Fields.
     * @return Returns the List of KeyValuePairBankFieldTypesString
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<KeyValuePairBankFieldTypesString> getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * @param fields Value for List of KeyValuePairBankFieldTypesString
     */
    @JsonSetter("fields")
    public void setFields(List<KeyValuePairBankFieldTypesString> fields) {
        this.fields = fields;
    }

    /**
     * Getter for BankCurrency.
     * Currency code type for the object
     * @return Returns the CurrencyTypesEnum
     */
    @JsonGetter("bankCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for BankCountry.
     * Two-digit country code types
     * @return Returns the CountryTypesEnum
     */
    @JsonGetter("bankCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Description.
     * User-supplied description of the bank account for reference
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * User-supplied description of the bank account for reference
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this BankAccountFields into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountFields [" + "bankAccountOwnershipType=" + bankAccountOwnershipType
                + ", type=" + type + ", fields=" + fields + ", bankCurrency=" + bankCurrency
                + ", bankCountry=" + bankCountry + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link BankAccountFields.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountFields.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankAccountOwnershipType(getBankAccountOwnershipType())
                .type(getType())
                .fields(getFields())
                .bankCurrency(getBankCurrency())
                .bankCountry(getBankCountry())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountFields}.
     */
    public static class Builder {
        private BankAccountOwnershipTypesEnum bankAccountOwnershipType;
        private BankAccountTypesEnum type;
        private List<KeyValuePairBankFieldTypesString> fields;
        private CurrencyTypesEnum bankCurrency;
        private CountryTypesEnum bankCountry;
        private String description;



        /**
         * Setter for bankAccountOwnershipType.
         * @param  bankAccountOwnershipType  BankAccountOwnershipTypesEnum value for
         *         bankAccountOwnershipType.
         * @return Builder
         */
        public Builder bankAccountOwnershipType(
                BankAccountOwnershipTypesEnum bankAccountOwnershipType) {
            this.bankAccountOwnershipType = bankAccountOwnershipType;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  BankAccountTypesEnum value for type.
         * @return Builder
         */
        public Builder type(BankAccountTypesEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for fields.
         * @param  fields  List of KeyValuePairBankFieldTypesString value for fields.
         * @return Builder
         */
        public Builder fields(List<KeyValuePairBankFieldTypesString> fields) {
            this.fields = fields;
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
         * Setter for bankCountry.
         * @param  bankCountry  CountryTypesEnum value for bankCountry.
         * @return Builder
         */
        public Builder bankCountry(CountryTypesEnum bankCountry) {
            this.bankCountry = bankCountry;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link BankAccountFields} object using the set fields.
         * @return {@link BankAccountFields}
         */
        public BankAccountFields build() {
            return new BankAccountFields(bankAccountOwnershipType, type, fields, bankCurrency,
                    bankCountry, description);
        }
    }
}
