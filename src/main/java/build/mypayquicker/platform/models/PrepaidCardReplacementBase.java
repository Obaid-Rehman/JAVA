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
 * This is a model class for PrepaidCardReplacementBase type.
 */
public class PrepaidCardReplacementBase {
    private String cardPackage;
    private String programToken;
    private PrepaidCardReplacementReasonTypesEnum cardReplacementReason;

    /**
     * Default constructor.
     */
    public PrepaidCardReplacementBase() {
    }

    /**
     * Initialization constructor.
     * @param  programToken  String value for programToken.
     * @param  cardPackage  String value for cardPackage.
     * @param  cardReplacementReason  PrepaidCardReplacementReasonTypesEnum value for
     *         cardReplacementReason.
     */
    public PrepaidCardReplacementBase(
            String programToken,
            String cardPackage,
            PrepaidCardReplacementReasonTypesEnum cardReplacementReason) {
        this.cardPackage = cardPackage;
        this.programToken = programToken;
        this.cardReplacementReason = cardReplacementReason;
    }

    /**
     * Getter for CardPackage.
     * Package for the card being displayed (&lt;i&gt;Virtual&lt;,i&gt;) or &lt;i&gt;Produced (physical)&lt;/i&gt;
     * @return Returns the String
     */
    @JsonGetter("cardPackage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardPackage() {
        return cardPackage;
    }

    /**
     * Setter for CardPackage.
     * Package for the card being displayed (&lt;i&gt;Virtual&lt;,i&gt;) or &lt;i&gt;Produced (physical)&lt;/i&gt;
     * @param cardPackage Value for String
     */
    @JsonSetter("cardPackage")
    public void setCardPackage(String cardPackage) {
        this.cardPackage = cardPackage;
    }

    /**
     * Getter for ProgramToken.
     * Token representing a program
     * @return Returns the String
     */
    @JsonGetter("programToken")
    public String getProgramToken() {
        return programToken;
    }

    /**
     * Setter for ProgramToken.
     * Token representing a program
     * @param programToken Value for String
     */
    @JsonSetter("programToken")
    public void setProgramToken(String programToken) {
        this.programToken = programToken;
    }

    /**
     * Getter for CardReplacementReason.
     * Reason for card replacement. In certain programs, the replacement reason code impacts
     * replacement cost and responsibility.
     * @return Returns the PrepaidCardReplacementReasonTypesEnum
     */
    @JsonGetter("cardReplacementReason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidCardReplacementReasonTypesEnum getCardReplacementReason() {
        return cardReplacementReason;
    }

    /**
     * Setter for CardReplacementReason.
     * Reason for card replacement. In certain programs, the replacement reason code impacts
     * replacement cost and responsibility.
     * @param cardReplacementReason Value for PrepaidCardReplacementReasonTypesEnum
     */
    @JsonSetter("cardReplacementReason")
    public void setCardReplacementReason(PrepaidCardReplacementReasonTypesEnum cardReplacementReason) {
        this.cardReplacementReason = cardReplacementReason;
    }

    /**
     * Converts this PrepaidCardReplacementBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidCardReplacementBase [" + "programToken=" + programToken + ", cardPackage="
                + cardPackage + ", cardReplacementReason=" + cardReplacementReason + "]";
    }

    /**
     * Builds a new {@link PrepaidCardReplacementBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidCardReplacementBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(programToken)
                .cardPackage(getCardPackage())
                .cardReplacementReason(getCardReplacementReason());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidCardReplacementBase}.
     */
    public static class Builder {
        private String programToken;
        private String cardPackage;
        private PrepaidCardReplacementReasonTypesEnum cardReplacementReason;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  programToken  String value for programToken.
         */
        public Builder(String programToken) {
            this.programToken = programToken;
        }

        /**
         * Setter for programToken.
         * @param  programToken  String value for programToken.
         * @return Builder
         */
        public Builder programToken(String programToken) {
            this.programToken = programToken;
            return this;
        }

        /**
         * Setter for cardPackage.
         * @param  cardPackage  String value for cardPackage.
         * @return Builder
         */
        public Builder cardPackage(String cardPackage) {
            this.cardPackage = cardPackage;
            return this;
        }

        /**
         * Setter for cardReplacementReason.
         * @param  cardReplacementReason  PrepaidCardReplacementReasonTypesEnum value for
         *         cardReplacementReason.
         * @return Builder
         */
        public Builder cardReplacementReason(
                PrepaidCardReplacementReasonTypesEnum cardReplacementReason) {
            this.cardReplacementReason = cardReplacementReason;
            return this;
        }

        /**
         * Builds a new {@link PrepaidCardReplacementBase} object using the set fields.
         * @return {@link PrepaidCardReplacementBase}
         */
        public PrepaidCardReplacementBase build() {
            return new PrepaidCardReplacementBase(programToken, cardPackage, cardReplacementReason);
        }
    }
}
