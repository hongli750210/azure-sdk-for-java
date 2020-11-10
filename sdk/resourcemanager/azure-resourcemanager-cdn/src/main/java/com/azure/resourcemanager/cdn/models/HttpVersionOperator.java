// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HttpVersionOperator. */
public final class HttpVersionOperator extends ExpandableStringEnum<HttpVersionOperator> {
    /** Static value Equal for HttpVersionOperator. */
    public static final HttpVersionOperator EQUAL = fromString("Equal");

    /**
     * Creates or finds a HttpVersionOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HttpVersionOperator.
     */
    @JsonCreator
    public static HttpVersionOperator fromString(String name) {
        return fromString(name, HttpVersionOperator.class);
    }

    /** @return known HttpVersionOperator values. */
    public static Collection<HttpVersionOperator> values() {
        return values(HttpVersionOperator.class);
    }
}