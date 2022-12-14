/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * SideEnum to be used.
 */
public enum SideEnum {
    FRONT,

    BACK;


    private static TreeMap<String, SideEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        FRONT.value = "FRONT";
        BACK.value = "BACK";

        valueMap.put("FRONT", FRONT);
        valueMap.put("BACK", BACK);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SideEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of SideEnum values to list of string values.
     * @param toConvert The list of SideEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SideEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SideEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 