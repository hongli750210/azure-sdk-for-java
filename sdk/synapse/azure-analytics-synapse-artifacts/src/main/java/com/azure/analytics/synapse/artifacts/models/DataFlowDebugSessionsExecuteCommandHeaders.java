// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataFlowDebugSessionsExecuteCommandHeaders model. */
@Fluent
public final class DataFlowDebugSessionsExecuteCommandHeaders {
    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the DataFlowDebugSessionsExecuteCommandHeaders object itself.
     */
    public DataFlowDebugSessionsExecuteCommandHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}