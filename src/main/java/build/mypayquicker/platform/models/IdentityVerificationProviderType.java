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
 * This is a model class for IdentityVerificationProviderType type.
 */
public class IdentityVerificationProviderType {
    private IdentityVerificationProviderTypesEnum idvProvider;

    /**
     * Default constructor.
     */
    public IdentityVerificationProviderType() {
    }

    /**
     * Initialization constructor.
     * @param  idvProvider  IdentityVerificationProviderTypesEnum value for idvProvider.
     */
    public IdentityVerificationProviderType(
            IdentityVerificationProviderTypesEnum idvProvider) {
        this.idvProvider = idvProvider;
    }

    /**
     * Getter for IdvProvider.
     * Provider types of verification that can be used for performing identity checks
     * @return Returns the IdentityVerificationProviderTypesEnum
     */
    @JsonGetter("idvProvider")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IdentityVerificationProviderTypesEnum getIdvProvider() {
        return idvProvider;
    }

    /**
     * Setter for IdvProvider.
     * Provider types of verification that can be used for performing identity checks
     * @param idvProvider Value for IdentityVerificationProviderTypesEnum
     */
    @JsonSetter("idvProvider")
    public void setIdvProvider(IdentityVerificationProviderTypesEnum idvProvider) {
        this.idvProvider = idvProvider;
    }

    /**
     * Converts this IdentityVerificationProviderType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IdentityVerificationProviderType [" + "idvProvider=" + idvProvider + "]";
    }

    /**
     * Builds a new {@link IdentityVerificationProviderType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IdentityVerificationProviderType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .idvProvider(getIdvProvider());
        return builder;
    }

    /**
     * Class to build instances of {@link IdentityVerificationProviderType}.
     */
    public static class Builder {
        private IdentityVerificationProviderTypesEnum idvProvider;



        /**
         * Setter for idvProvider.
         * @param  idvProvider  IdentityVerificationProviderTypesEnum value for idvProvider.
         * @return Builder
         */
        public Builder idvProvider(IdentityVerificationProviderTypesEnum idvProvider) {
            this.idvProvider = idvProvider;
            return this;
        }

        /**
         * Builds a new {@link IdentityVerificationProviderType} object using the set fields.
         * @return {@link IdentityVerificationProviderType}
         */
        public IdentityVerificationProviderType build() {
            return new IdentityVerificationProviderType(idvProvider);
        }
    }
}