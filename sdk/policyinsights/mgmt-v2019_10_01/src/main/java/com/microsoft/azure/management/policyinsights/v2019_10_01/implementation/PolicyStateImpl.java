/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01.implementation;

import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyState;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.policyinsights.v2019_10_01.ComponentStateDetails;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyEvaluationDetails;
import org.joda.time.DateTime;

class PolicyStateImpl extends WrapperImpl<PolicyStateInner> implements PolicyState {
    private final PolicyInsightsManager manager;
    PolicyStateImpl(PolicyStateInner inner, PolicyInsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public String complianceState() {
        return this.inner().complianceState();
    }

    @Override
    public List<ComponentStateDetails> components() {
        return this.inner().components();
    }

    @Override
    public String effectiveParameters() {
        return this.inner().effectiveParameters();
    }

    @Override
    public Boolean isCompliant() {
        return this.inner().isCompliant();
    }

    @Override
    public String managementGroupIds() {
        return this.inner().managementGroupIds();
    }

    @Override
    public String odatacontext() {
        return this.inner().odatacontext();
    }

    @Override
    public String odataid() {
        return this.inner().odataid();
    }

    @Override
    public String policyAssignmentId() {
        return this.inner().policyAssignmentId();
    }

    @Override
    public String policyAssignmentName() {
        return this.inner().policyAssignmentName();
    }

    @Override
    public String policyAssignmentOwner() {
        return this.inner().policyAssignmentOwner();
    }

    @Override
    public String policyAssignmentParameters() {
        return this.inner().policyAssignmentParameters();
    }

    @Override
    public String policyAssignmentScope() {
        return this.inner().policyAssignmentScope();
    }

    @Override
    public String policyAssignmentVersion() {
        return this.inner().policyAssignmentVersion();
    }

    @Override
    public String policyDefinitionAction() {
        return this.inner().policyDefinitionAction();
    }

    @Override
    public String policyDefinitionCategory() {
        return this.inner().policyDefinitionCategory();
    }

    @Override
    public List<String> policyDefinitionGroupNames() {
        return this.inner().policyDefinitionGroupNames();
    }

    @Override
    public String policyDefinitionId() {
        return this.inner().policyDefinitionId();
    }

    @Override
    public String policyDefinitionName() {
        return this.inner().policyDefinitionName();
    }

    @Override
    public String policyDefinitionReferenceId() {
        return this.inner().policyDefinitionReferenceId();
    }

    @Override
    public String policyDefinitionVersion() {
        return this.inner().policyDefinitionVersion();
    }

    @Override
    public PolicyEvaluationDetails policyEvaluationDetails() {
        return this.inner().policyEvaluationDetails();
    }

    @Override
    public String policySetDefinitionCategory() {
        return this.inner().policySetDefinitionCategory();
    }

    @Override
    public String policySetDefinitionId() {
        return this.inner().policySetDefinitionId();
    }

    @Override
    public String policySetDefinitionName() {
        return this.inner().policySetDefinitionName();
    }

    @Override
    public String policySetDefinitionOwner() {
        return this.inner().policySetDefinitionOwner();
    }

    @Override
    public String policySetDefinitionParameters() {
        return this.inner().policySetDefinitionParameters();
    }

    @Override
    public String policySetDefinitionVersion() {
        return this.inner().policySetDefinitionVersion();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
    }

    @Override
    public String resourceLocation() {
        return this.inner().resourceLocation();
    }

    @Override
    public String resourceTags() {
        return this.inner().resourceTags();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public DateTime timestamp() {
        return this.inner().timestamp();
    }

}