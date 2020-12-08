// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.DataFlowsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.DataFlowResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class DataFlowAsyncClient {
    private final DataFlowsImpl serviceClient;

    /**
     * Initializes an instance of DataFlows client.
     *
     * @param serviceClient the service client implementation.
     */
    DataFlowAsyncClient(DataFlowsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates or updates a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataFlowResource>> createOrUpdateDataFlowWithResponse(
            String dataFlowName, DataFlowResource dataFlow, String ifMatch) {
        return this.serviceClient.createOrUpdateDataFlowWithResponseAsync(dataFlowName, dataFlow, ifMatch);
    }

    /**
     * Creates or updates a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowResource> createOrUpdateDataFlow(
            String dataFlowName, DataFlowResource dataFlow, String ifMatch) {
        return this.serviceClient.createOrUpdateDataFlowAsync(dataFlowName, dataFlow, ifMatch);
    }

    /**
     * Creates or updates a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowResource> createOrUpdateDataFlow(String dataFlowName, DataFlowResource dataFlow) {
        return this.serviceClient.createOrUpdateDataFlowAsync(dataFlowName, dataFlow);
    }

    /**
     * Gets a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataFlowResource>> getDataFlowWithResponse(String dataFlowName, String ifNoneMatch) {
        return this.serviceClient.getDataFlowWithResponseAsync(dataFlowName, ifNoneMatch);
    }

    /**
     * Gets a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowResource> getDataFlow(String dataFlowName, String ifNoneMatch) {
        return this.serviceClient.getDataFlowAsync(dataFlowName, ifNoneMatch);
    }

    /**
     * Gets a data flow.
     *
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowResource> getDataFlow(String dataFlowName) {
        return this.serviceClient.getDataFlowAsync(dataFlowName);
    }

    /**
     * Deletes a data flow.
     *
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDataFlowWithResponse(String dataFlowName) {
        return this.serviceClient.deleteDataFlowWithResponseAsync(dataFlowName);
    }

    /**
     * Deletes a data flow.
     *
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataFlow(String dataFlowName) {
        return this.serviceClient.deleteDataFlowAsync(dataFlowName);
    }

    /**
     * Renames a dataflow.
     *
     * @param dataFlowName The data flow name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameDataFlowWithResponse(String dataFlowName, ArtifactRenameRequest request) {
        return this.serviceClient.renameDataFlowWithResponseAsync(dataFlowName, request);
    }

    /**
     * Renames a dataflow.
     *
     * @param dataFlowName The data flow name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameDataFlow(String dataFlowName, ArtifactRenameRequest request) {
        return this.serviceClient.renameDataFlowAsync(dataFlowName, request);
    }

    /**
     * Lists data flows.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<DataFlowResource>> getDataFlowsByWorkspaceSinglePage() {
        return this.serviceClient.getDataFlowsByWorkspaceSinglePageAsync();
    }

    /**
     * Lists data flows.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataFlowResource> getDataFlowsByWorkspace() {
        return this.serviceClient.getDataFlowsByWorkspaceAsync();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<DataFlowResource>> getDataFlowsByWorkspaceNextSinglePage(String nextLink) {
        return this.serviceClient.getDataFlowsByWorkspaceNextSinglePageAsync(nextLink);
    }
}