// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Tag attributes. */
@JsonFlatten
@Fluent
public class TagProperties {
    /*
     * Image name
     */
    @JsonProperty(value = "imageName")
    private String repository;

    /*
     * Tag name
     */
    @JsonProperty(value = "tag.name")
    private String name;

    /*
     * Tag digest
     */
    @JsonProperty(value = "tag.digest")
    private String digest;

    /*
     * Tag created time
     */
    @JsonProperty(value = "tag.createdTime")
    private OffsetDateTime createdOn;

    /*
     * Tag last update time
     */
    @JsonProperty(value = "tag.lastUpdateTime")
    private OffsetDateTime lastUpdatedOn;

    /*
     * Changeable attributes
     */
    @JsonProperty(value = "tag.changeableAttributes")
    private ContentProperties writeableProperties;

    /**
     * Get the repository property: Image name.
     *
     * @return the repository value.
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Set the repository property: Image name.
     *
     * @param repository the repository value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties setRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the name property: Tag name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Tag name.
     *
     * @param name the name value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the digest property: Tag digest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: Tag digest.
     *
     * @param digest the digest value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the createdOn property: Tag created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: Tag created time.
     *
     * @param createdOn the createdOn value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the lastUpdatedOn property: Tag last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Set the lastUpdatedOn property: Tag last update time.
     *
     * @param lastUpdatedOn the lastUpdatedOn value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties setLastUpdatedOn(OffsetDateTime lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
        return this;
    }

    /**
     * Get the writeableProperties property: Changeable attributes.
     *
     * @return the writeableProperties value.
     */
    public ContentProperties getWriteableProperties() {
        return this.writeableProperties;
    }

    /**
     * Set the writeableProperties property: Changeable attributes.
     *
     * @param writeableProperties the writeableProperties value to set.
     * @return the TagProperties object itself.
     */
    public TagProperties setWriteableProperties(ContentProperties writeableProperties) {
        this.writeableProperties = writeableProperties;
        return this;
    }
}
