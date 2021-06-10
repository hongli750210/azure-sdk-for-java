// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This is used to represent the various nodes of the distributed container. */
@Fluent
public final class DistributedNodesInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DistributedNodesInfo.class);

    /*
     * Name of the node under a distributed container.
     */
    @JsonProperty(value = "nodeName")
    private String nodeName;

    /*
     * Status of this Node.
     * Failed | Succeeded
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Error Details if the Status is non-success.
     */
    @JsonProperty(value = "errorDetail")
    private ErrorDetail errorDetail;

    /**
     * Get the nodeName property: Name of the node under a distributed container.
     *
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node under a distributed container.
     *
     * @param nodeName the nodeName value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the status property: Status of this Node. Failed | Succeeded.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of this Node. Failed | Succeeded.
     *
     * @param status the status value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorDetail property: Error Details if the Status is non-success.
     *
     * @return the errorDetail value.
     */
    public ErrorDetail errorDetail() {
        return this.errorDetail;
    }

    /**
     * Set the errorDetail property: Error Details if the Status is non-success.
     *
     * @param errorDetail the errorDetail value to set.
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorDetail() != null) {
            errorDetail().validate();
        }
    }
}
