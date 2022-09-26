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
 * This is a model class for UserStatus type.
 */
public class UserStatus {
    private UserStatusTypesEnum status;

    /**
     * Default constructor.
     */
    public UserStatus() {
    }

    /**
     * Initialization constructor.
     * @param  status  UserStatusTypesEnum value for status.
     */
    public UserStatus(
            UserStatusTypesEnum status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * Current status of the user
     * @return Returns the UserStatusTypesEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserStatusTypesEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of the user
     * @param status Value for UserStatusTypesEnum
     */
    @JsonSetter("status")
    public void setStatus(UserStatusTypesEnum status) {
        this.status = status;
    }

    /**
     * Converts this UserStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserStatus [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link UserStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link UserStatus}.
     */
    public static class Builder {
        private UserStatusTypesEnum status;



        /**
         * Setter for status.
         * @param  status  UserStatusTypesEnum value for status.
         * @return Builder
         */
        public Builder status(UserStatusTypesEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link UserStatus} object using the set fields.
         * @return {@link UserStatus}
         */
        public UserStatus build() {
            return new UserStatus(status);
        }
    }
}