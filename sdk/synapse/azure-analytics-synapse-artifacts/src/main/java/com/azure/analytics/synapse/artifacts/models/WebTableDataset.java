// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The dataset points to a HTML table in the web page. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebTable")
@JsonFlatten
@Fluent
public class WebTableDataset extends Dataset {
    /*
     * The zero-based index of the table in the web page. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.index", required = true)
    private Object index;

    /*
     * The relative URL to the web page from the linked service URL. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.path")
    private Object path;

    /**
     * Get the index property: The zero-based index of the table in the web page. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @return the index value.
     */
    public Object getIndex() {
        return this.index;
    }

    /**
     * Set the index property: The zero-based index of the table in the web page. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @param index the index value to set.
     * @return the WebTableDataset object itself.
     */
    public WebTableDataset setIndex(Object index) {
        this.index = index;
        return this;
    }

    /**
     * Get the path property: The relative URL to the web page from the linked service URL. Type: string (or Expression
     * with resultType string).
     *
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The relative URL to the web page from the linked service URL. Type: string (or Expression
     * with resultType string).
     *
     * @param path the path value to set.
     * @return the WebTableDataset object itself.
     */
    public WebTableDataset setPath(Object path) {
        this.path = path;
        return this;
    }
}