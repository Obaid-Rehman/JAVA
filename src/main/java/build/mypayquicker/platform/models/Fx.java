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
 * This is a model class for Fx type.
 */
public class Fx {
    private FxObject fx;

    /**
     * Default constructor.
     */
    public Fx() {
    }

    /**
     * Initialization constructor.
     * @param  fx  FxObject value for fx.
     */
    public Fx(
            FxObject fx) {
        this.fx = fx;
    }

    /**
     * Getter for Fx.
     * Currency conversion object details
     * @return Returns the FxObject
     */
    @JsonGetter("fx")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FxObject getFx() {
        return fx;
    }

    /**
     * Setter for Fx.
     * Currency conversion object details
     * @param fx Value for FxObject
     */
    @JsonSetter("fx")
    public void setFx(FxObject fx) {
        this.fx = fx;
    }

    /**
     * Converts this Fx into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Fx [" + "fx=" + fx + "]";
    }

    /**
     * Builds a new {@link Fx.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Fx.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fx(getFx());
        return builder;
    }

    /**
     * Class to build instances of {@link Fx}.
     */
    public static class Builder {
        private FxObject fx;



        /**
         * Setter for fx.
         * @param  fx  FxObject value for fx.
         * @return Builder
         */
        public Builder fx(FxObject fx) {
            this.fx = fx;
            return this;
        }

        /**
         * Builds a new {@link Fx} object using the set fields.
         * @return {@link Fx}
         */
        public Fx build() {
            return new Fx(fx);
        }
    }
}
