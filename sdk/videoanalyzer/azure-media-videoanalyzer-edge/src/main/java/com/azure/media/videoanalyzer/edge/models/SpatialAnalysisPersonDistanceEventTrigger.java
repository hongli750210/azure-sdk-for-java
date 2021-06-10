// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SpatialAnalysisPersonDistanceEventTrigger. */
public final class SpatialAnalysisPersonDistanceEventTrigger
        extends ExpandableStringEnum<SpatialAnalysisPersonDistanceEventTrigger> {
    /** Static value event for SpatialAnalysisPersonDistanceEventTrigger. */
    public static final SpatialAnalysisPersonDistanceEventTrigger EVENT = fromString("event");

    /** Static value interval for SpatialAnalysisPersonDistanceEventTrigger. */
    public static final SpatialAnalysisPersonDistanceEventTrigger INTERVAL = fromString("interval");

    /**
     * Creates or finds a SpatialAnalysisPersonDistanceEventTrigger from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SpatialAnalysisPersonDistanceEventTrigger.
     */
    @JsonCreator
    public static SpatialAnalysisPersonDistanceEventTrigger fromString(String name) {
        return fromString(name, SpatialAnalysisPersonDistanceEventTrigger.class);
    }

    /** @return known SpatialAnalysisPersonDistanceEventTrigger values. */
    public static Collection<SpatialAnalysisPersonDistanceEventTrigger> values() {
        return values(SpatialAnalysisPersonDistanceEventTrigger.class);
    }
}
