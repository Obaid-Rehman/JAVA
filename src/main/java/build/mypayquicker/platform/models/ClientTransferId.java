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
 * This is a model class for ClientTransferId type.
 */
public class ClientTransferId {
    private String clientTransferId;

    /**
     * Default constructor.
     */
    public ClientTransferId() {
    }

    /**
     * Initialization constructor.
     * @param  clientTransferId  String value for clientTransferId.
     */
    public ClientTransferId(
            String clientTransferId) {
        this.clientTransferId = clientTransferId;
    }

    /**
     * Getter for ClientTransferId.
     * Unique value provided by the client for the transfer.
     * @return Returns the String
     */
    @JsonGetter("clientTransferId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientTransferId() {
        return clientTransferId;
    }

    /**
     * Setter for ClientTransferId.
     * Unique value provided by the client for the transfer.
     * @param clientTransferId Value for String
     */
    @JsonSetter("clientTransferId")
    public void setClientTransferId(String clientTransferId) {
        this.clientTransferId = clientTransferId;
    }

    /**
     * Converts this ClientTransferId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ClientTransferId [" + "clientTransferId=" + clientTransferId + "]";
    }

    /**
     * Builds a new {@link ClientTransferId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ClientTransferId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .clientTransferId(getClientTransferId());
        return builder;
    }

    /**
     * Class to build instances of {@link ClientTransferId}.
     */
    public static class Builder {
        private String clientTransferId;



        /**
         * Setter for clientTransferId.
         * @param  clientTransferId  String value for clientTransferId.
         * @return Builder
         */
        public Builder clientTransferId(String clientTransferId) {
            this.clientTransferId = clientTransferId;
            return this;
        }

        /**
         * Builds a new {@link ClientTransferId} object using the set fields.
         * @return {@link ClientTransferId}
         */
        public ClientTransferId build() {
            return new ClientTransferId(clientTransferId);
        }
    }
}
