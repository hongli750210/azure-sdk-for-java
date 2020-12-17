// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.PipelineRunsImpl;
import com.azure.analytics.synapse.artifacts.models.ActivityRunsQueryResponse;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.PipelineRun;
import com.azure.analytics.synapse.artifacts.models.PipelineRunsQueryResponse;
import com.azure.analytics.synapse.artifacts.models.RunFilterParameters;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class PipelineRunAsyncClient {
    private final PipelineRunsImpl serviceClient;

    /**
     * Initializes an instance of PipelineRuns client.
     *
     * @param serviceClient the service client implementation.
     */
    PipelineRunAsyncClient(PipelineRunsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineRunsQueryResponse>> queryPipelineRunsByWorkspaceWithResponse(
            RunFilterParameters filterParameters) {
        return this.serviceClient.queryPipelineRunsByWorkspaceWithResponseAsync(filterParameters);
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineRunsQueryResponse> queryPipelineRunsByWorkspace(RunFilterParameters filterParameters) {
        return this.serviceClient.queryPipelineRunsByWorkspaceAsync(filterParameters);
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineRun>> getPipelineRunWithResponse(String runId) {
        return this.serviceClient.getPipelineRunWithResponseAsync(runId);
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineRun> getPipelineRun(String runId) {
        return this.serviceClient.getPipelineRunAsync(runId);
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ActivityRunsQueryResponse>> queryActivityRunsWithResponse(
            String pipelineName, String runId, RunFilterParameters filterParameters) {
        return this.serviceClient.queryActivityRunsWithResponseAsync(pipelineName, runId, filterParameters);
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActivityRunsQueryResponse> queryActivityRuns(
            String pipelineName, String runId, RunFilterParameters filterParameters) {
        return this.serviceClient.queryActivityRunsAsync(pipelineName, runId, filterParameters);
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelPipelineRunWithResponse(String runId, Boolean isRecursive) {
        return this.serviceClient.cancelPipelineRunWithResponseAsync(runId, isRecursive);
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelPipelineRun(String runId, Boolean isRecursive) {
        return this.serviceClient.cancelPipelineRunAsync(runId, isRecursive);
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelPipelineRun(String runId) {
        return this.serviceClient.cancelPipelineRunAsync(runId);
    }
}