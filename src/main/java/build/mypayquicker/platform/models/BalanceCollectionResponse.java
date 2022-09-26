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
 * This is a model class for BalanceCollectionResponse type.
 */
public class BalanceCollectionResponse {
    private List<Balance> payload;
    private List<HaetosParams> links;

    /**
     * Default constructor.
     */
    public BalanceCollectionResponse() {
    }

    /**
     * Initialization constructor.
     * @param  payload  List of Balance value for payload.
     * @param  links  List of HaetosParams value for links.
     */
    public BalanceCollectionResponse(
            List<Balance> payload,
            List<HaetosParams> links) {
        this.payload = payload;
        this.links = links;
    }

    /**
     * Getter for Payload.
     * @return Returns the List of Balance
     */
    @JsonGetter("payload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Balance> getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for List of Balance
     */
    @JsonSetter("payload")
    public void setPayload(List<Balance> payload) {
        this.payload = payload;
    }

    /**
     * Getter for Links.
     * @return Returns the List of HaetosParams
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<HaetosParams> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for List of HaetosParams
     */
    @JsonSetter("links")
    public void setLinks(List<HaetosParams> links) {
        this.links = links;
    }

    /**
     * Converts this BalanceCollectionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BalanceCollectionResponse [" + "payload=" + payload + ", links=" + links + "]";
    }

    /**
     * Builds a new {@link BalanceCollectionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BalanceCollectionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payload(getPayload())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link BalanceCollectionResponse}.
     */
    public static class Builder {
        private List<Balance> payload;
        private List<HaetosParams> links;



        /**
         * Setter for payload.
         * @param  payload  List of Balance value for payload.
         * @return Builder
         */
        public Builder payload(List<Balance> payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of HaetosParams value for links.
         * @return Builder
         */
        public Builder links(List<HaetosParams> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link BalanceCollectionResponse} object using the set fields.
         * @return {@link BalanceCollectionResponse}
         */
        public BalanceCollectionResponse build() {
            return new BalanceCollectionResponse(payload, links);
        }
    }
}