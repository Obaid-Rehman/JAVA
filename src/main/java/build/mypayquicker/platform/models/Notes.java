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
 * This is a model class for Notes type.
 */
public class Notes {
    private String notes;

    /**
     * Default constructor.
     */
    public Notes() {
    }

    /**
     * Initialization constructor.
     * @param  notes  String value for notes.
     */
    public Notes(
            String notes) {
        this.notes = notes;
    }

    /**
     * Getter for Notes.
     * Optional comments visible to the user.
     * @return Returns the String
     */
    @JsonGetter("notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNotes() {
        return notes;
    }

    /**
     * Setter for Notes.
     * Optional comments visible to the user.
     * @param notes Value for String
     */
    @JsonSetter("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Converts this Notes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Notes [" + "notes=" + notes + "]";
    }

    /**
     * Builds a new {@link Notes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Notes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .notes(getNotes());
        return builder;
    }

    /**
     * Class to build instances of {@link Notes}.
     */
    public static class Builder {
        private String notes;



        /**
         * Setter for notes.
         * @param  notes  String value for notes.
         * @return Builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        /**
         * Builds a new {@link Notes} object using the set fields.
         * @return {@link Notes}
         */
        public Notes build() {
            return new Notes(notes);
        }
    }
}
