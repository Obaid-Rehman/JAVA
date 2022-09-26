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
 * This is a model class for Occupation type.
 */
public class Occupation {
    private OccupationTypesEnum occupation;

    /**
     * Default constructor.
     */
    public Occupation() {
    }

    /**
     * Initialization constructor.
     * @param  occupation  OccupationTypesEnum value for occupation.
     */
    public Occupation(
            OccupationTypesEnum occupation) {
        this.occupation = occupation;
    }

    /**
     * Getter for Occupation.
     * Type of occupation for the user
     * @return Returns the OccupationTypesEnum
     */
    @JsonGetter("occupation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OccupationTypesEnum getOccupation() {
        return occupation;
    }

    /**
     * Setter for Occupation.
     * Type of occupation for the user
     * @param occupation Value for OccupationTypesEnum
     */
    @JsonSetter("occupation")
    public void setOccupation(OccupationTypesEnum occupation) {
        this.occupation = occupation;
    }

    /**
     * Converts this Occupation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Occupation [" + "occupation=" + occupation + "]";
    }

    /**
     * Builds a new {@link Occupation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Occupation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .occupation(getOccupation());
        return builder;
    }

    /**
     * Class to build instances of {@link Occupation}.
     */
    public static class Builder {
        private OccupationTypesEnum occupation;



        /**
         * Setter for occupation.
         * @param  occupation  OccupationTypesEnum value for occupation.
         * @return Builder
         */
        public Builder occupation(OccupationTypesEnum occupation) {
            this.occupation = occupation;
            return this;
        }

        /**
         * Builds a new {@link Occupation} object using the set fields.
         * @return {@link Occupation}
         */
        public Occupation build() {
            return new Occupation(occupation);
        }
    }
}