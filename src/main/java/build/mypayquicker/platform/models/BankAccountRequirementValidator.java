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
 * This is a model class for BankAccountRequirementValidator type.
 */
public class BankAccountRequirementValidator {
    private ValidatorTypesEnum validatorType;
    private String expression;

    /**
     * Default constructor.
     */
    public BankAccountRequirementValidator() {
    }

    /**
     * Initialization constructor.
     * @param  expression  String value for expression.
     * @param  validatorType  ValidatorTypesEnum value for validatorType.
     */
    public BankAccountRequirementValidator(
            String expression,
            ValidatorTypesEnum validatorType) {
        this.validatorType = validatorType;
        this.expression = expression;
    }

    /**
     * Getter for ValidatorType.
     * @return Returns the ValidatorTypesEnum
     */
    @JsonGetter("validatorType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ValidatorTypesEnum getValidatorType() {
        return validatorType;
    }

    /**
     * Setter for ValidatorType.
     * @param validatorType Value for ValidatorTypesEnum
     */
    @JsonSetter("validatorType")
    public void setValidatorType(ValidatorTypesEnum validatorType) {
        this.validatorType = validatorType;
    }

    /**
     * Getter for Expression.
     * Validation regular expression
     * @return Returns the String
     */
    @JsonGetter("expression")
    public String getExpression() {
        return expression;
    }

    /**
     * Setter for Expression.
     * Validation regular expression
     * @param expression Value for String
     */
    @JsonSetter("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Converts this BankAccountRequirementValidator into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountRequirementValidator [" + "expression=" + expression + ", validatorType="
                + validatorType + "]";
    }

    /**
     * Builds a new {@link BankAccountRequirementValidator.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountRequirementValidator.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(expression)
                .validatorType(getValidatorType());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountRequirementValidator}.
     */
    public static class Builder {
        private String expression;
        private ValidatorTypesEnum validatorType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  expression  String value for expression.
         */
        public Builder(String expression) {
            this.expression = expression;
        }

        /**
         * Setter for expression.
         * @param  expression  String value for expression.
         * @return Builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Setter for validatorType.
         * @param  validatorType  ValidatorTypesEnum value for validatorType.
         * @return Builder
         */
        public Builder validatorType(ValidatorTypesEnum validatorType) {
            this.validatorType = validatorType;
            return this;
        }

        /**
         * Builds a new {@link BankAccountRequirementValidator} object using the set fields.
         * @return {@link BankAccountRequirementValidator}
         */
        public BankAccountRequirementValidator build() {
            return new BankAccountRequirementValidator(expression, validatorType);
        }
    }
}
