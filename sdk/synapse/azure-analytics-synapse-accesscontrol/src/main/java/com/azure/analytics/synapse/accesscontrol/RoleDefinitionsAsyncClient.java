// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol;

import com.azure.analytics.synapse.accesscontrol.implementation.RoleDefinitionsImpl;
import com.azure.analytics.synapse.accesscontrol.models.ErrorContractException;
import com.azure.analytics.synapse.accesscontrol.models.SynapseRoleDefinition;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AccessControlClient type. */
@ServiceClient(builder = AccessControlClientBuilder.class, isAsync = true)
public final class RoleDefinitionsAsyncClient {
    private final RoleDefinitionsImpl serviceClient;

    /**
     * Initializes an instance of RoleDefinitions client.
     *
     * @param serviceClient the service client implementation.
     */
    RoleDefinitionsAsyncClient(RoleDefinitionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List role definitions.
     *
     * @param isBuiltIn Is a Synapse Built-In Role or not.
     * @param scope Scope of the Synapse Built-in Role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Synapse roles available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<SynapseRoleDefinition>>> listRoleDefinitionsWithResponse(
            Boolean isBuiltIn, String scope) {
        return this.serviceClient.listRoleDefinitionsWithResponseAsync(isBuiltIn, scope);
    }

    /**
     * List role definitions.
     *
     * @param isBuiltIn Is a Synapse Built-In Role or not.
     * @param scope Scope of the Synapse Built-in Role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Synapse roles available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<SynapseRoleDefinition>> listRoleDefinitions(Boolean isBuiltIn, String scope) {
        return this.serviceClient.listRoleDefinitionsAsync(isBuiltIn, scope);
    }

    /**
     * List role definitions.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Synapse roles available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<SynapseRoleDefinition>> listRoleDefinitions() {
        return this.serviceClient.listRoleDefinitionsAsync();
    }

    /**
     * Get role definition by role definition Id.
     *
     * @param roleDefinitionId Synapse Built-In Role Definition Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by role definition Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynapseRoleDefinition>> getRoleDefinitionByIdWithResponse(String roleDefinitionId) {
        return this.serviceClient.getRoleDefinitionByIdWithResponseAsync(roleDefinitionId);
    }

    /**
     * Get role definition by role definition Id.
     *
     * @param roleDefinitionId Synapse Built-In Role Definition Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by role definition Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SynapseRoleDefinition> getRoleDefinitionById(String roleDefinitionId) {
        return this.serviceClient.getRoleDefinitionByIdAsync(roleDefinitionId);
    }

    /**
     * List rbac scopes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Synapse rbac scopes available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<String>>> listScopesWithResponse() {
        return this.serviceClient.listScopesWithResponseAsync();
    }

    /**
     * List rbac scopes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Synapse rbac scopes available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<String>> listScopes() {
        return this.serviceClient.listScopesAsync();
    }
}