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
 * NamespaceEnum to be used.
 */
public enum NamespaceEnum {
    ENUM_BANKACCOUNTSUPDATEDSTATUSAPPROVED,

    ENUM_PREPAIDCARDSCREATED,

    ENUM_TRANSFERSACCEPTED;


    private static TreeMap<String, NamespaceEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_BANKACCOUNTSUPDATEDSTATUSAPPROVED.value = "BANKACCOUNTS.UPDATED.STATUS.APPROVED";
        ENUM_PREPAIDCARDSCREATED.value = "PREPAIDCARDS.CREATED";
        ENUM_TRANSFERSACCEPTED.value = "TRANSFERS.ACCEPTED";

        valueMap.put("BANKACCOUNTS.UPDATED.STATUS.APPROVED", ENUM_BANKACCOUNTSUPDATEDSTATUSAPPROVED);
        valueMap.put("PREPAIDCARDS.CREATED", ENUM_PREPAIDCARDSCREATED);
        valueMap.put("TRANSFERS.ACCEPTED", ENUM_TRANSFERSACCEPTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static NamespaceEnum fromString(String toConvert) {
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
     * Convert list of NamespaceEnum values to list of string values.
     * @param toConvert The list of NamespaceEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NamespaceEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NamespaceEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 