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
 * IdentityVerificationProviderTypesEnum to be used.
 */
public enum IdentityVerificationProviderTypesEnum {
    W2,

    IDOLOGY,

    BANK,

    EQUIFAX,

    OFAC,

    LEXUS_NEXUS;


    private static TreeMap<String, IdentityVerificationProviderTypesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        W2.value = "W2";
        IDOLOGY.value = "IDOLOGY";
        BANK.value = "BANK";
        EQUIFAX.value = "EQUIFAX";
        OFAC.value = "OFAC";
        LEXUS_NEXUS.value = "LEXUS_NEXUS";

        valueMap.put("W2", W2);
        valueMap.put("IDOLOGY", IDOLOGY);
        valueMap.put("BANK", BANK);
        valueMap.put("EQUIFAX", EQUIFAX);
        valueMap.put("OFAC", OFAC);
        valueMap.put("LEXUS_NEXUS", LEXUS_NEXUS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static IdentityVerificationProviderTypesEnum fromString(String toConvert) {
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
     * Convert list of IdentityVerificationProviderTypesEnum values to list of string values.
     * @param toConvert The list of IdentityVerificationProviderTypesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<IdentityVerificationProviderTypesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (IdentityVerificationProviderTypesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 