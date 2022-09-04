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
 * This is a model class for IdentityVerificationProviderReference type.
 */
public class IdentityVerificationProviderReference {
    private String idvProviderReference;

    /**
     * Default constructor.
     */
    public IdentityVerificationProviderReference() {
    }

    /**
     * Initialization constructor.
     * @param  idvProviderReference  String value for idvProviderReference.
     */
    public IdentityVerificationProviderReference(
            String idvProviderReference) {
        this.idvProviderReference = idvProviderReference;
    }

    /**
     * Getter for IdvProviderReference.
     * IDV provider unique ID for the IDV check performed
     * @return Returns the String
     */
    @JsonGetter("idvProviderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIdvProviderReference() {
        return idvProviderReference;
    }

    /**
     * Setter for IdvProviderReference.
     * IDV provider unique ID for the IDV check performed
     * @param idvProviderReference Value for String
     */
    @JsonSetter("idvProviderReference")
    public void setIdvProviderReference(String idvProviderReference) {
        this.idvProviderReference = idvProviderReference;
    }

    /**
     * Converts this IdentityVerificationProviderReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IdentityVerificationProviderReference [" + "idvProviderReference="
                + idvProviderReference + "]";
    }

    /**
     * Builds a new {@link IdentityVerificationProviderReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IdentityVerificationProviderReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .idvProviderReference(getIdvProviderReference());
        return builder;
    }

    /**
     * Class to build instances of {@link IdentityVerificationProviderReference}.
     */
    public static class Builder {
        private String idvProviderReference;



        /**
         * Setter for idvProviderReference.
         * @param  idvProviderReference  String value for idvProviderReference.
         * @return Builder
         */
        public Builder idvProviderReference(String idvProviderReference) {
            this.idvProviderReference = idvProviderReference;
            return this;
        }

        /**
         * Builds a new {@link IdentityVerificationProviderReference} object using the set fields.
         * @return {@link IdentityVerificationProviderReference}
         */
        public IdentityVerificationProviderReference build() {
            return new IdentityVerificationProviderReference(idvProviderReference);
        }
    }
}
