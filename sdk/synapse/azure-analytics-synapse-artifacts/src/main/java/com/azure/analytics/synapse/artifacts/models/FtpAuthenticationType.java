// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FtpAuthenticationType. */
public final class FtpAuthenticationType extends ExpandableStringEnum<FtpAuthenticationType> {
    /** Static value Basic for FtpAuthenticationType. */
    public static final FtpAuthenticationType BASIC = fromString("Basic");

    /** Static value Anonymous for FtpAuthenticationType. */
    public static final FtpAuthenticationType ANONYMOUS = fromString("Anonymous");

    /**
     * Creates or finds a FtpAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FtpAuthenticationType.
     */
    @JsonCreator
    public static FtpAuthenticationType fromString(String name) {
        return fromString(name, FtpAuthenticationType.class);
    }

    /** @return known FtpAuthenticationType values. */
    public static Collection<FtpAuthenticationType> values() {
        return values(FtpAuthenticationType.class);
    }
}