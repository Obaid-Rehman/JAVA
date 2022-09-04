/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for KeyValuePairBankFieldTypesString type.
 */
public class KeyValuePairBankFieldTypesString {
    private BankAccountFieldTypesEnum key;
    private String value;

    /**
     * Default constructor.
     */
    public KeyValuePairBankFieldTypesString() {
    }

    /**
     * Initialization constructor.
     * @param  key  BankAccountFieldTypesEnum value for key.
     * @param  value  String value for value.
     */
    public KeyValuePairBankFieldTypesString(
            BankAccountFieldTypesEnum key,
            String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for Key.
     * Classifies account field types
     * @return Returns the BankAccountFieldTypesEnum
     */
    @JsonGetter("key")
    public BankAccountFieldTypesEnum getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * Classifies account field types
     * @param key Value for BankAccountFieldTypesEnum
     */
    @JsonSetter("key")
    public void setKey(BankAccountFieldTypesEnum key) {
        this.key = key;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this KeyValuePairBankFieldTypesString into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "KeyValuePairBankFieldTypesString [" + "key=" + key + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link KeyValuePairBankFieldTypesString.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link KeyValuePairBankFieldTypesString.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, value);
        return builder;
    }

    /**
     * Class to build instances of {@link KeyValuePairBankFieldTypesString}.
     */
    public static class Builder {
        private BankAccountFieldTypesEnum key;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  BankAccountFieldTypesEnum value for key.
         * @param  value  String value for value.
         */
        public Builder(BankAccountFieldTypesEnum key, String value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Setter for key.
         * @param  key  BankAccountFieldTypesEnum value for key.
         * @return Builder
         */
        public Builder key(BankAccountFieldTypesEnum key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link KeyValuePairBankFieldTypesString} object using the set fields.
         * @return {@link KeyValuePairBankFieldTypesString}
         */
        public KeyValuePairBankFieldTypesString build() {
            return new KeyValuePairBankFieldTypesString(key, value);
        }
    }
}
