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
 * This is a model class for IdentityVerificationProviderRawOutput type.
 */
public class IdentityVerificationProviderRawOutput {
    private String raw;

    /**
     * Default constructor.
     */
    public IdentityVerificationProviderRawOutput() {
    }

    /**
     * Initialization constructor.
     * @param  raw  String value for raw.
     */
    public IdentityVerificationProviderRawOutput(
            String raw) {
        this.raw = raw;
    }

    /**
     * Getter for Raw.
     * Contains the raw (unprocessed) output from the IDV provider. Format of the raw output can
     * vary widely and is not documented. *For reference/debugging only
     * @return Returns the String
     */
    @JsonGetter("raw")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRaw() {
        return raw;
    }

    /**
     * Setter for Raw.
     * Contains the raw (unprocessed) output from the IDV provider. Format of the raw output can
     * vary widely and is not documented. *For reference/debugging only
     * @param raw Value for String
     */
    @JsonSetter("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    /**
     * Converts this IdentityVerificationProviderRawOutput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IdentityVerificationProviderRawOutput [" + "raw=" + raw + "]";
    }

    /**
     * Builds a new {@link IdentityVerificationProviderRawOutput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IdentityVerificationProviderRawOutput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .raw(getRaw());
        return builder;
    }

    /**
     * Class to build instances of {@link IdentityVerificationProviderRawOutput}.
     */
    public static class Builder {
        private String raw;



        /**
         * Setter for raw.
         * @param  raw  String value for raw.
         * @return Builder
         */
        public Builder raw(String raw) {
            this.raw = raw;
            return this;
        }

        /**
         * Builds a new {@link IdentityVerificationProviderRawOutput} object using the set fields.
         * @return {@link IdentityVerificationProviderRawOutput}
         */
        public IdentityVerificationProviderRawOutput build() {
            return new IdentityVerificationProviderRawOutput(raw);
        }
    }
}
