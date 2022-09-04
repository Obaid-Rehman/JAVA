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
 * This is a model class for EmailAddress type.
 */
public class EmailAddress {
    private String email;

    /**
     * Default constructor.
     */
    public EmailAddress() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     */
    public EmailAddress(
            String email) {
        this.email = email;
    }

    /**
     * Getter for Email.
     * Email address for the user account
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Email address for the user account
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Converts this EmailAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EmailAddress [" + "email=" + email + "]";
    }

    /**
     * Builds a new {@link EmailAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EmailAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .email(getEmail());
        return builder;
    }

    /**
     * Class to build instances of {@link EmailAddress}.
     */
    public static class Builder {
        private String email;



        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Builds a new {@link EmailAddress} object using the set fields.
         * @return {@link EmailAddress}
         */
        public EmailAddress build() {
            return new EmailAddress(email);
        }
    }
}
