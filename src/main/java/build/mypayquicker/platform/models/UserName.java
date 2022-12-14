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
 * This is a model class for UserName type.
 */
public class UserName {
    private String firstName;
    private String lastName;

    /**
     * Default constructor.
     */
    public UserName() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     */
    public UserName(
            String firstName,
            String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Getter for FirstName.
     * User's first name. &lt;i&gt;Required&lt;/i&gt; if the user is registered as an individual.
     * @return Returns the String
     */
    @JsonGetter("firstName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * User's first name. &lt;i&gt;Required&lt;/i&gt; if the user is registered as an individual.
     * @param firstName Value for String
     */
    @JsonSetter("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * User's last name. &lt;i&gt;Required&lt;/i&gt; if the user is registered as an individual.
     * @return Returns the String
     */
    @JsonGetter("lastName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * User's last name. &lt;i&gt;Required&lt;/i&gt; if the user is registered as an individual.
     * @param lastName Value for String
     */
    @JsonSetter("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Converts this UserName into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserName [" + "firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    /**
     * Builds a new {@link UserName.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserName.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName());
        return builder;
    }

    /**
     * Class to build instances of {@link UserName}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;



        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Builds a new {@link UserName} object using the set fields.
         * @return {@link UserName}
         */
        public UserName build() {
            return new UserName(firstName, lastName);
        }
    }
}
