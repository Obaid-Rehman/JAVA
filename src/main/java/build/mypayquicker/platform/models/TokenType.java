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
 * This is a model class for TokenType type.
 */
public class TokenType {
    private TokenTypesEnum tokenType;

    /**
     * Default constructor.
     */
    public TokenType() {
    }

    /**
     * Initialization constructor.
     * @param  tokenType  TokenTypesEnum value for tokenType.
     */
    public TokenType(
            TokenTypesEnum tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Getter for TokenType.
     * Types of resources represented by a token
     * @return Returns the TokenTypesEnum
     */
    @JsonGetter("tokenType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenTypesEnum getTokenType() {
        return tokenType;
    }

    /**
     * Setter for TokenType.
     * Types of resources represented by a token
     * @param tokenType Value for TokenTypesEnum
     */
    @JsonSetter("tokenType")
    public void setTokenType(TokenTypesEnum tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Converts this TokenType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenType [" + "tokenType=" + tokenType + "]";
    }

    /**
     * Builds a new {@link TokenType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tokenType(getTokenType());
        return builder;
    }

    /**
     * Class to build instances of {@link TokenType}.
     */
    public static class Builder {
        private TokenTypesEnum tokenType;



        /**
         * Setter for tokenType.
         * @param  tokenType  TokenTypesEnum value for tokenType.
         * @return Builder
         */
        public Builder tokenType(TokenTypesEnum tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Builds a new {@link TokenType} object using the set fields.
         * @return {@link TokenType}
         */
        public TokenType build() {
            return new TokenType(tokenType);
        }
    }
}
