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
 * This is a model class for KeyValuePairStringString type.
 */
public class KeyValuePairStringString {
    private String key;
    private String value;

    /**
     * Default constructor.
     */
    public KeyValuePairStringString() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  value  String value for value.
     */
    public KeyValuePairStringString(
            String key,
            String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this KeyValuePairStringString into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "KeyValuePairStringString [" + "key=" + key + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link KeyValuePairStringString.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link KeyValuePairStringString.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .key(getKey())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link KeyValuePairStringString}.
     */
    public static class Builder {
        private String key;
        private String value;



        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
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
         * Builds a new {@link KeyValuePairStringString} object using the set fields.
         * @return {@link KeyValuePairStringString}
         */
        public KeyValuePairStringString build() {
            return new KeyValuePairStringString(key, value);
        }
    }
}