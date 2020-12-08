// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Activity dependency information. */
@Fluent
public final class ActivityDependency {
    /*
     * Activity name.
     */
    @JsonProperty(value = "activity", required = true)
    private String activity;

    /*
     * Match-Condition for the dependency.
     */
    @JsonProperty(value = "dependencyConditions", required = true)
    private List<DependencyCondition> dependencyConditions;

    /*
     * Activity dependency information.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the activity property: Activity name.
     *
     * @return the activity value.
     */
    public String getActivity() {
        return this.activity;
    }

    /**
     * Set the activity property: Activity name.
     *
     * @param activity the activity value to set.
     * @return the ActivityDependency object itself.
     */
    public ActivityDependency setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    /**
     * Get the dependencyConditions property: Match-Condition for the dependency.
     *
     * @return the dependencyConditions value.
     */
    public List<DependencyCondition> getDependencyConditions() {
        return this.dependencyConditions;
    }

    /**
     * Set the dependencyConditions property: Match-Condition for the dependency.
     *
     * @param dependencyConditions the dependencyConditions value to set.
     * @return the ActivityDependency object itself.
     */
    public ActivityDependency setDependencyConditions(List<DependencyCondition> dependencyConditions) {
        this.dependencyConditions = dependencyConditions;
        return this;
    }

    /**
     * Get the additionalProperties property: Activity dependency information.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Activity dependency information.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ActivityDependency object itself.
     */
    public ActivityDependency setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}