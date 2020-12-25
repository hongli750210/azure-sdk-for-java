// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A tag of a saved search. */
@Fluent
public final class Tag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Tag.class);

    /*
     * The tag name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The tag value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: The tag name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The tag name.
     *
     * @param name the name value to set.
     * @return the Tag object itself.
     */
    public Tag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The tag value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The tag value.
     *
     * @param value the value value to set.
     * @return the Tag object itself.
     */
    public Tag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Tag"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property value in model Tag"));
        }
    }
}