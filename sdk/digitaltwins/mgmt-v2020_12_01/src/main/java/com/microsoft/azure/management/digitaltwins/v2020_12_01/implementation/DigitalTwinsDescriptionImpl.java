/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.DigitalTwinsDescription;
import rx.Observable;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.DigitalTwinsPatchDescription;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.DigitalTwinsIdentity;
import org.joda.time.DateTime;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.ProvisioningState;
import java.util.List;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.PublicNetworkAccess;
import java.util.ArrayList;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateEndpointConnection;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.DigitalTwinsPatchProperties;
import rx.functions.Func1;

class DigitalTwinsDescriptionImpl extends GroupableResourceCoreImpl<DigitalTwinsDescription, DigitalTwinsDescriptionInner, DigitalTwinsDescriptionImpl, DigitalTwinsManager> implements DigitalTwinsDescription, DigitalTwinsDescription.Definition, DigitalTwinsDescription.Update {
    private DigitalTwinsPatchDescription updateParameter;
    DigitalTwinsDescriptionImpl(String name, DigitalTwinsDescriptionInner inner, DigitalTwinsManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DigitalTwinsPatchDescription();
    }

    @Override
    public Observable<DigitalTwinsDescription> createResourceAsync() {
        DigitalTwinsInner client = this.manager().inner().digitalTwins();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DigitalTwinsDescriptionInner, DigitalTwinsDescriptionInner>() {
               @Override
               public DigitalTwinsDescriptionInner call(DigitalTwinsDescriptionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DigitalTwinsDescription> updateResourceAsync() {
        DigitalTwinsInner client = this.manager().inner().digitalTwins();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DigitalTwinsDescriptionInner, DigitalTwinsDescriptionInner>() {
               @Override
               public DigitalTwinsDescriptionInner call(DigitalTwinsDescriptionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DigitalTwinsDescriptionInner> getInnerAsync() {
        DigitalTwinsInner client = this.manager().inner().digitalTwins();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DigitalTwinsPatchDescription();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public DigitalTwinsIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public DateTime lastUpdatedTime() {
        return this.inner().lastUpdatedTime();
    }

    @Override
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> lst = new ArrayList<PrivateEndpointConnection>();
        if (this.inner().privateEndpointConnections() != null) {
            for (PrivateEndpointConnectionInner inner : this.inner().privateEndpointConnections()) {
                lst.add( new PrivateEndpointConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicNetworkAccess publicNetworkAccess() {
        return this.inner().publicNetworkAccess();
    }

    @Override
    public DigitalTwinsDescriptionImpl withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.inner().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    @Override
    public DigitalTwinsDescriptionImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.inner().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    @Override
    public DigitalTwinsDescriptionImpl withProperties(DigitalTwinsPatchProperties properties) {
        this.updateParameter.withProperties(properties);
        return this;
    }

    @Override
    public DigitalTwinsDescriptionImpl withIdentity(DigitalTwinsIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

}