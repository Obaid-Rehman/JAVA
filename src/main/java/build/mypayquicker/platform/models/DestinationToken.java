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
 * This is a model class for DestinationToken type.
 */
public class DestinationToken {
    private String destinationToken;

    /**
     * Default constructor.
     */
    public DestinationToken() {
    }

    /**
     * Initialization constructor.
     * @param  destinationToken  String value for destinationToken.
     */
    public DestinationToken(
            String destinationToken) {
        this.destinationToken = destinationToken;
    }

    /**
     * Getter for DestinationToken.
     * Unique identifier representing the destination of funds.
     * @return Returns the String
     */
    @JsonGetter("destinationToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationToken() {
        return destinationToken;
    }

    /**
     * Setter for DestinationToken.
     * Unique identifier representing the destination of funds.
     * @param destinationToken Value for String
     */
    @JsonSetter("destinationToken")
    public void setDestinationToken(String destinationToken) {
        this.destinationToken = destinationToken;
    }

    /**
     * Converts this DestinationToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DestinationToken [" + "destinationToken=" + destinationToken + "]";
    }

    /**
     * Builds a new {@link DestinationToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DestinationToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .destinationToken(getDestinationToken());
        return builder;
    }

    /**
     * Class to build instances of {@link DestinationToken}.
     */
    public static class Builder {
        private String destinationToken;



        /**
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
            return this;
        }

        /**
         * Builds a new {@link DestinationToken} object using the set fields.
         * @return {@link DestinationToken}
         */
        public DestinationToken build() {
            return new DestinationToken(destinationToken);
        }
    }
}