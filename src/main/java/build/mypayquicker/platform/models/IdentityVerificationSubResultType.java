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
 * This is a model class for IdentityVerificationSubResultType type.
 */
public class IdentityVerificationSubResultType {
    private IdentityVerificationResultSubTypesEnum idvSubResult;

    /**
     * Default constructor.
     */
    public IdentityVerificationSubResultType() {
    }

    /**
     * Initialization constructor.
     * @param  idvSubResult  IdentityVerificationResultSubTypesEnum value for idvSubResult.
     */
    public IdentityVerificationSubResultType(
            IdentityVerificationResultSubTypesEnum idvSubResult) {
        this.idvSubResult = idvSubResult;
    }

    /**
     * Getter for IdvSubResult.
     * If used by a provider, sub-results that give additional insight into the results, including
     * whether they result was &lt;i&gt;Soft&lt;/i&gt; or &lt;i&gt;Hard&lt;/i&gt;. &lt;i&gt;Soft&lt;/i&gt; results may have additional
     * recourse that can be leveraged to validate a user’s identity.
     * @return Returns the IdentityVerificationResultSubTypesEnum
     */
    @JsonGetter("idvSubResult")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IdentityVerificationResultSubTypesEnum getIdvSubResult() {
        return idvSubResult;
    }

    /**
     * Setter for IdvSubResult.
     * If used by a provider, sub-results that give additional insight into the results, including
     * whether they result was &lt;i&gt;Soft&lt;/i&gt; or &lt;i&gt;Hard&lt;/i&gt;. &lt;i&gt;Soft&lt;/i&gt; results may have additional
     * recourse that can be leveraged to validate a user’s identity.
     * @param idvSubResult Value for IdentityVerificationResultSubTypesEnum
     */
    @JsonSetter("idvSubResult")
    public void setIdvSubResult(IdentityVerificationResultSubTypesEnum idvSubResult) {
        this.idvSubResult = idvSubResult;
    }

    /**
     * Converts this IdentityVerificationSubResultType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IdentityVerificationSubResultType [" + "idvSubResult=" + idvSubResult + "]";
    }

    /**
     * Builds a new {@link IdentityVerificationSubResultType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IdentityVerificationSubResultType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .idvSubResult(getIdvSubResult());
        return builder;
    }

    /**
     * Class to build instances of {@link IdentityVerificationSubResultType}.
     */
    public static class Builder {
        private IdentityVerificationResultSubTypesEnum idvSubResult;



        /**
         * Setter for idvSubResult.
         * @param  idvSubResult  IdentityVerificationResultSubTypesEnum value for idvSubResult.
         * @return Builder
         */
        public Builder idvSubResult(IdentityVerificationResultSubTypesEnum idvSubResult) {
            this.idvSubResult = idvSubResult;
            return this;
        }

        /**
         * Builds a new {@link IdentityVerificationSubResultType} object using the set fields.
         * @return {@link IdentityVerificationSubResultType}
         */
        public IdentityVerificationSubResultType build() {
            return new IdentityVerificationSubResultType(idvSubResult);
        }
    }
}
