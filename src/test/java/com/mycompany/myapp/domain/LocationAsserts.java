package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertLocationAllPropertiesEquals(Location expected, Location actual) {
        assertLocationAutoGeneratedPropertiesEquals(expected, actual);
        assertLocationAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertLocationAllUpdatablePropertiesEquals(Location expected, Location actual) {
        assertLocationUpdatableFieldsEquals(expected, actual);
        assertLocationUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertLocationAutoGeneratedPropertiesEquals(Location expected, Location actual) {
        assertThat(actual)
            .as("Verify Location auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertLocationUpdatableFieldsEquals(Location expected, Location actual) {
        assertThat(actual)
            .as("Verify Location relevant properties")
            .satisfies(a -> assertThat(a.getStreetAddress()).as("check streetAddress").isEqualTo(expected.getStreetAddress()))
            .satisfies(a -> assertThat(a.getPostalCode()).as("check postalCode").isEqualTo(expected.getPostalCode()))
            .satisfies(a -> assertThat(a.getCity()).as("check city").isEqualTo(expected.getCity()))
            .satisfies(a -> assertThat(a.getStateProvince()).as("check stateProvince").isEqualTo(expected.getStateProvince()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertLocationUpdatableRelationshipsEquals(Location expected, Location actual) {
        assertThat(actual)
            .as("Verify Location relationships")
            .satisfies(a -> assertThat(a.getCountry()).as("check country").isEqualTo(expected.getCountry()));
    }
}
