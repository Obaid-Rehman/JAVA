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
 * This is a model class for Address type.
 */
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String addressLine5;
    private String city;
    private String region;
    private CountryTypesEnum country;
    private String postalCode;
    private String premiseNumber;
    private AddressTypesEnum addressType;

    /**
     * Default constructor.
     */
    public Address() {
    }

    /**
     * Initialization constructor.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressLine3  String value for addressLine3.
     * @param  addressLine4  String value for addressLine4.
     * @param  addressLine5  String value for addressLine5.
     * @param  city  String value for city.
     * @param  region  String value for region.
     * @param  country  CountryTypesEnum value for country.
     * @param  postalCode  String value for postalCode.
     * @param  premiseNumber  String value for premiseNumber.
     * @param  addressType  AddressTypesEnum value for addressType.
     */
    public Address(
            String addressLine1,
            String addressLine2,
            String addressLine3,
            String addressLine4,
            String addressLine5,
            String city,
            String region,
            CountryTypesEnum country,
            String postalCode,
            String premiseNumber,
            AddressTypesEnum addressType) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.addressLine5 = addressLine5;
        this.city = city;
        this.region = region;
        this.country = country;
        this.postalCode = postalCode;
        this.premiseNumber = premiseNumber;
        this.addressType = addressType;
    }

    /**
     * Getter for AddressLine1.
     * First line of the address that specifies street number, street name, and building name
     * @return Returns the String
     */
    @JsonGetter("addressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * First line of the address that specifies street number, street name, and building name
     * @param addressLine1 Value for String
     */
    @JsonSetter("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressLine2.
     * Second line of the address that specifies the apartment, suite, or space number (or any other
     * designation not literally part of the physical address)
     * @return Returns the String
     */
    @JsonGetter("addressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for AddressLine2.
     * Second line of the address that specifies the apartment, suite, or space number (or any other
     * designation not literally part of the physical address)
     * @param addressLine2 Value for String
     */
    @JsonSetter("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter for AddressLine3.
     * Third line of the address that specifies the international or business addresses that do not
     * fit on addressLine2
     * @return Returns the String
     */
    @JsonGetter("addressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Setter for AddressLine3.
     * Third line of the address that specifies the international or business addresses that do not
     * fit on addressLine2
     * @param addressLine3 Value for String
     */
    @JsonSetter("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * Getter for AddressLine4.
     * Fourth line of the address, if any
     * @return Returns the String
     */
    @JsonGetter("addressLine4")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Setter for AddressLine4.
     * Fourth line of the address, if any
     * @param addressLine4 Value for String
     */
    @JsonSetter("addressLine4")
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    /**
     * Getter for AddressLine5.
     * Fifth line of the address, if any
     * @return Returns the String
     */
    @JsonGetter("addressLine5")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Setter for AddressLine5.
     * Fifth line of the address, if any
     * @param addressLine5 Value for String
     */
    @JsonSetter("addressLine5")
    public void setAddressLine5(String addressLine5) {
        this.addressLine5 = addressLine5;
    }

    /**
     * Getter for City.
     * City or town of the business address
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City or town of the business address
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Region.
     * State, province, or territory of the business address
     * @return Returns the String
     */
    @JsonGetter("region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Setter for Region.
     * State, province, or territory of the business address
     * @param region Value for String
     */
    @JsonSetter("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for Country.
     * Two-digit country code types
     * @return Returns the CountryTypesEnum
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CountryTypesEnum getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Two-digit country code types
     * @param country Value for CountryTypesEnum
     */
    @JsonSetter("country")
    public void setCountry(CountryTypesEnum country) {
        this.country = country;
    }

    /**
     * Getter for PostalCode.
     * Series of letters, digits, or both, included in a postal address for the purpose of sorting
     * mail
     * @return Returns the String
     */
    @JsonGetter("postalCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter for PostalCode.
     * Series of letters, digits, or both, included in a postal address for the purpose of sorting
     * mail
     * @param postalCode Value for String
     */
    @JsonSetter("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for PremiseNumber.
     * House or building number of the business address
     * @return Returns the String
     */
    @JsonGetter("premiseNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPremiseNumber() {
        return premiseNumber;
    }

    /**
     * Setter for PremiseNumber.
     * House or building number of the business address
     * @param premiseNumber Value for String
     */
    @JsonSetter("premiseNumber")
    public void setPremiseNumber(String premiseNumber) {
        this.premiseNumber = premiseNumber;
    }

    /**
     * Getter for AddressType.
     * Classifies the address type (&lt;i&gt;Home&lt;/i&gt;, &lt;i&gt;Business&lt;/i&gt;, &lt;i&gt;Billing&lt;/i&gt;, &lt;i&gt;Shipping&lt;/i&gt;)
     * @return Returns the AddressTypesEnum
     */
    @JsonGetter("addressType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressTypesEnum getAddressType() {
        return addressType;
    }

    /**
     * Setter for AddressType.
     * Classifies the address type (&lt;i&gt;Home&lt;/i&gt;, &lt;i&gt;Business&lt;/i&gt;, &lt;i&gt;Billing&lt;/i&gt;, &lt;i&gt;Shipping&lt;/i&gt;)
     * @param addressType Value for AddressTypesEnum
     */
    @JsonSetter("addressType")
    public void setAddressType(AddressTypesEnum addressType) {
        this.addressType = addressType;
    }

    /**
     * Converts this Address into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Address [" + "addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
                + ", addressLine3=" + addressLine3 + ", addressLine4=" + addressLine4
                + ", addressLine5=" + addressLine5 + ", city=" + city + ", region=" + region
                + ", country=" + country + ", postalCode=" + postalCode + ", premiseNumber="
                + premiseNumber + ", addressType=" + addressType + "]";
    }

    /**
     * Builds a new {@link Address.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Address.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .addressLine1(getAddressLine1())
                .addressLine2(getAddressLine2())
                .addressLine3(getAddressLine3())
                .addressLine4(getAddressLine4())
                .addressLine5(getAddressLine5())
                .city(getCity())
                .region(getRegion())
                .country(getCountry())
                .postalCode(getPostalCode())
                .premiseNumber(getPremiseNumber())
                .addressType(getAddressType());
        return builder;
    }

    /**
     * Class to build instances of {@link Address}.
     */
    public static class Builder {
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private String addressLine5;
        private String city;
        private String region;
        private CountryTypesEnum country;
        private String postalCode;
        private String premiseNumber;
        private AddressTypesEnum addressType;



        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        /**
         * Setter for addressLine3.
         * @param  addressLine3  String value for addressLine3.
         * @return Builder
         */
        public Builder addressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        /**
         * Setter for addressLine4.
         * @param  addressLine4  String value for addressLine4.
         * @return Builder
         */
        public Builder addressLine4(String addressLine4) {
            this.addressLine4 = addressLine4;
            return this;
        }

        /**
         * Setter for addressLine5.
         * @param  addressLine5  String value for addressLine5.
         * @return Builder
         */
        public Builder addressLine5(String addressLine5) {
            this.addressLine5 = addressLine5;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for region.
         * @param  region  String value for region.
         * @return Builder
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  CountryTypesEnum value for country.
         * @return Builder
         */
        public Builder country(CountryTypesEnum country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for postalCode.
         * @param  postalCode  String value for postalCode.
         * @return Builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Setter for premiseNumber.
         * @param  premiseNumber  String value for premiseNumber.
         * @return Builder
         */
        public Builder premiseNumber(String premiseNumber) {
            this.premiseNumber = premiseNumber;
            return this;
        }

        /**
         * Setter for addressType.
         * @param  addressType  AddressTypesEnum value for addressType.
         * @return Builder
         */
        public Builder addressType(AddressTypesEnum addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * Builds a new {@link Address} object using the set fields.
         * @return {@link Address}
         */
        public Address build() {
            return new Address(addressLine1, addressLine2, addressLine3, addressLine4, addressLine5,
                    city, region, country, postalCode, premiseNumber, addressType);
        }
    }
}