// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents an output file produced. */
@Fluent
public final class OutputFile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutputFile.class);

    /*
     * The list of labels that describe how the encoder should multiplex video
     * and audio into an output file. For example, if the encoder is producing
     * two video layers with labels v1 and v2, and one audio layer with label
     * a1, then an array like '[v1, a1]' tells the encoder to produce an output
     * file with the video track represented by v1 and the audio track
     * represented by a1.
     */
    @JsonProperty(value = "labels", required = true)
    private List<String> labels;

    /**
     * Get the labels property: The list of labels that describe how the encoder should multiplex video and audio into
     * an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio
     * layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video
     * track represented by v1 and the audio track represented by a1.
     *
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: The list of labels that describe how the encoder should multiplex video and audio into
     * an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio
     * layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video
     * track represented by v1 and the audio track represented by a1.
     *
     * @param labels the labels value to set.
     * @return the OutputFile object itself.
     */
    public OutputFile withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (labels() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property labels in model OutputFile"));
        }
    }
}