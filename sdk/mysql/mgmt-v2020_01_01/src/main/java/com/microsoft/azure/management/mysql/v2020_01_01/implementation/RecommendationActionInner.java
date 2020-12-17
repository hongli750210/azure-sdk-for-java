/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a Recommendation Action.
 */
@JsonFlatten
public class RecommendationActionInner extends ProxyResource {
    /**
     * Advisor name.
     */
    @JsonProperty(value = "properties.advisorName")
    private String advisorName;

    /**
     * Recommendation action session identifier.
     */
    @JsonProperty(value = "properties.sessionId")
    private String sessionId;

    /**
     * Recommendation action identifier.
     */
    @JsonProperty(value = "properties.actionId")
    private Integer actionId;

    /**
     * Recommendation action creation time.
     */
    @JsonProperty(value = "properties.createdTime")
    private DateTime createdTime;

    /**
     * Recommendation action expiration time.
     */
    @JsonProperty(value = "properties.expirationTime")
    private DateTime expirationTime;

    /**
     * Recommendation action reason.
     */
    @JsonProperty(value = "properties.reason")
    private String reason;

    /**
     * Recommendation action type.
     */
    @JsonProperty(value = "properties.recommendationType")
    private String recommendationType;

    /**
     * Recommendation action details.
     */
    @JsonProperty(value = "properties.details")
    private Map<String, String> details;

    /**
     * Get advisor name.
     *
     * @return the advisorName value
     */
    public String advisorName() {
        return this.advisorName;
    }

    /**
     * Set advisor name.
     *
     * @param advisorName the advisorName value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withAdvisorName(String advisorName) {
        this.advisorName = advisorName;
        return this;
    }

    /**
     * Get recommendation action session identifier.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set recommendation action session identifier.
     *
     * @param sessionId the sessionId value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get recommendation action identifier.
     *
     * @return the actionId value
     */
    public Integer actionId() {
        return this.actionId;
    }

    /**
     * Set recommendation action identifier.
     *
     * @param actionId the actionId value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withActionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Get recommendation action creation time.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set recommendation action creation time.
     *
     * @param createdTime the createdTime value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get recommendation action expiration time.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set recommendation action expiration time.
     *
     * @param expirationTime the expirationTime value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get recommendation action reason.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set recommendation action reason.
     *
     * @param reason the reason value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get recommendation action type.
     *
     * @return the recommendationType value
     */
    public String recommendationType() {
        return this.recommendationType;
    }

    /**
     * Set recommendation action type.
     *
     * @param recommendationType the recommendationType value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withRecommendationType(String recommendationType) {
        this.recommendationType = recommendationType;
        return this;
    }

    /**
     * Get recommendation action details.
     *
     * @return the details value
     */
    public Map<String, String> details() {
        return this.details;
    }

    /**
     * Set recommendation action details.
     *
     * @param details the details value to set
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withDetails(Map<String, String> details) {
        this.details = details;
        return this;
    }

}