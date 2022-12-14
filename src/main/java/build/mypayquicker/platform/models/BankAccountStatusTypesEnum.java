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
 * BankAccountStatusTypesEnum to be used.
 */
public enum BankAccountStatusTypesEnum {
    DELETED,

    ACTIVE,

    PENDING_VERIFICATION;


    private static TreeMap<String, BankAccountStatusTypesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DELETED.value = "DELETED";
        ACTIVE.value = "ACTIVE";
        PENDING_VERIFICATION.value = "PENDING_VERIFICATION";

        valueMap.put("DELETED", DELETED);
        valueMap.put("ACTIVE", ACTIVE);
        valueMap.put("PENDING_VERIFICATION", PENDING_VERIFICATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static BankAccountStatusTypesEnum fromString(String toConvert) {
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
     * Convert list of BankAccountStatusTypesEnum values to list of string values.
     * @param toConvert The list of BankAccountStatusTypesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankAccountStatusTypesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankAccountStatusTypesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 