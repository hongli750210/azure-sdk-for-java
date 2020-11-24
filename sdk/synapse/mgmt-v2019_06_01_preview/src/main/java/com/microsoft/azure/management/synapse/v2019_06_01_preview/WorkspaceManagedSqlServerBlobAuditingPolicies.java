/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.WorkspaceManagedSqlServerBlobAuditingPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspaceManagedSqlServerBlobAuditingPolicies.
 */
public interface WorkspaceManagedSqlServerBlobAuditingPolicies extends SupportsCreating<ServerBlobAuditingPolicy.DefinitionStages.Blank>, HasInner<WorkspaceManagedSqlServerBlobAuditingPoliciesInner> {
    /**
     * Get server's blob auditing policy.
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerBlobAuditingPolicy> getAsync(String resourceGroupName, String workspaceName);

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerBlobAuditingPolicy> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName);

}