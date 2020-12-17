/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.mysql.v2020_01_01.Servers;
import com.microsoft.azure.management.mysql.v2020_01_01.Replicas;
import com.microsoft.azure.management.mysql.v2020_01_01.FirewallRules;
import com.microsoft.azure.management.mysql.v2020_01_01.VirtualNetworkRules;
import com.microsoft.azure.management.mysql.v2020_01_01.Databases;
import com.microsoft.azure.management.mysql.v2020_01_01.Configurations;
import com.microsoft.azure.management.mysql.v2020_01_01.LogFiles;
import com.microsoft.azure.management.mysql.v2020_01_01.ServerAdministrators;
import com.microsoft.azure.management.mysql.v2020_01_01.LocationBasedPerformanceTiers;
import com.microsoft.azure.management.mysql.v2020_01_01.CheckNameAvailabilitys;
import com.microsoft.azure.management.mysql.v2020_01_01.Operations;
import com.microsoft.azure.management.mysql.v2020_01_01.ServerSecurityAlertPolicies;
import com.microsoft.azure.management.mysql.v2020_01_01.QueryTexts;
import com.microsoft.azure.management.mysql.v2020_01_01.TopQueryStatistics;
import com.microsoft.azure.management.mysql.v2020_01_01.WaitStatistics;
import com.microsoft.azure.management.mysql.v2020_01_01.Advisors;
import com.microsoft.azure.management.mysql.v2020_01_01.RecommendedActions;
import com.microsoft.azure.management.mysql.v2020_01_01.LocationBasedRecommendedActionSessionsOperationStatus;
import com.microsoft.azure.management.mysql.v2020_01_01.LocationBasedRecommendedActionSessionsResults;
import com.microsoft.azure.management.mysql.v2020_01_01.PrivateEndpointConnections;
import com.microsoft.azure.management.mysql.v2020_01_01.PrivateLinkResources;
import com.microsoft.azure.management.mysql.v2020_01_01.ServerKeys;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure MySQL resource management.
 */
public final class MySQLManager extends ManagerCore<MySQLManager, MySQLManagementClientImpl> {
    private Servers servers;
    private Replicas replicas;
    private FirewallRules firewallRules;
    private VirtualNetworkRules virtualNetworkRules;
    private Databases databases;
    private Configurations configurations;
    private LogFiles logFiles;
    private ServerAdministrators serverAdministrators;
    private LocationBasedPerformanceTiers locationBasedPerformanceTiers;
    private CheckNameAvailabilitys checkNameAvailabilitys;
    private Operations operations;
    private ServerSecurityAlertPolicies serverSecurityAlertPolicies;
    private QueryTexts queryTexts;
    private TopQueryStatistics topQueryStatistics;
    private WaitStatistics waitStatistics;
    private Advisors advisors;
    private RecommendedActions recommendedActions;
    private LocationBasedRecommendedActionSessionsOperationStatus locationBasedRecommendedActionSessionsOperationStatus;
    private LocationBasedRecommendedActionSessionsResults locationBasedRecommendedActionSessionsResults;
    private PrivateEndpointConnections privateEndpointConnections;
    private PrivateLinkResources privateLinkResources;
    private ServerKeys serverKeys;
    /**
    * Get a Configurable instance that can be used to create MySQLManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new MySQLManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of MySQLManager that exposes MySQL resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the MySQLManager
    */
    public static MySQLManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new MySQLManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of MySQLManager that exposes MySQL resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the MySQLManager
    */
    public static MySQLManager authenticate(RestClient restClient, String subscriptionId) {
        return new MySQLManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of MySQLManager that exposes MySQL management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing MySQL management API entry points that work across subscriptions
        */
        MySQLManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Servers.
     */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(this);
        }
        return this.servers;
    }

    /**
     * @return Entry point to manage Replicas.
     */
    public Replicas replicas() {
        if (this.replicas == null) {
            this.replicas = new ReplicasImpl(this);
        }
        return this.replicas;
    }

    /**
     * @return Entry point to manage FirewallRules.
     */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(this);
        }
        return this.firewallRules;
    }

    /**
     * @return Entry point to manage VirtualNetworkRules.
     */
    public VirtualNetworkRules virtualNetworkRules() {
        if (this.virtualNetworkRules == null) {
            this.virtualNetworkRules = new VirtualNetworkRulesImpl(this);
        }
        return this.virtualNetworkRules;
    }

    /**
     * @return Entry point to manage Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(this);
        }
        return this.databases;
    }

    /**
     * @return Entry point to manage Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(this);
        }
        return this.configurations;
    }

    /**
     * @return Entry point to manage LogFiles.
     */
    public LogFiles logFiles() {
        if (this.logFiles == null) {
            this.logFiles = new LogFilesImpl(this);
        }
        return this.logFiles;
    }

    /**
     * @return Entry point to manage ServerAdministrators.
     */
    public ServerAdministrators serverAdministrators() {
        if (this.serverAdministrators == null) {
            this.serverAdministrators = new ServerAdministratorsImpl(this);
        }
        return this.serverAdministrators;
    }

    /**
     * @return Entry point to manage LocationBasedPerformanceTiers.
     */
    public LocationBasedPerformanceTiers locationBasedPerformanceTiers() {
        if (this.locationBasedPerformanceTiers == null) {
            this.locationBasedPerformanceTiers = new LocationBasedPerformanceTiersImpl(this);
        }
        return this.locationBasedPerformanceTiers;
    }

    /**
     * @return Entry point to manage CheckNameAvailabilitys.
     */
    public CheckNameAvailabilitys checkNameAvailabilitys() {
        if (this.checkNameAvailabilitys == null) {
            this.checkNameAvailabilitys = new CheckNameAvailabilitysImpl(this);
        }
        return this.checkNameAvailabilitys;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage ServerSecurityAlertPolicies.
     */
    public ServerSecurityAlertPolicies serverSecurityAlertPolicies() {
        if (this.serverSecurityAlertPolicies == null) {
            this.serverSecurityAlertPolicies = new ServerSecurityAlertPoliciesImpl(this);
        }
        return this.serverSecurityAlertPolicies;
    }

    /**
     * @return Entry point to manage QueryTexts.
     */
    public QueryTexts queryTexts() {
        if (this.queryTexts == null) {
            this.queryTexts = new QueryTextsImpl(this);
        }
        return this.queryTexts;
    }

    /**
     * @return Entry point to manage TopQueryStatistics.
     */
    public TopQueryStatistics topQueryStatistics() {
        if (this.topQueryStatistics == null) {
            this.topQueryStatistics = new TopQueryStatisticsImpl(this);
        }
        return this.topQueryStatistics;
    }

    /**
     * @return Entry point to manage WaitStatistics.
     */
    public WaitStatistics waitStatistics() {
        if (this.waitStatistics == null) {
            this.waitStatistics = new WaitStatisticsImpl(this);
        }
        return this.waitStatistics;
    }

    /**
     * @return Entry point to manage Advisors.
     */
    public Advisors advisors() {
        if (this.advisors == null) {
            this.advisors = new AdvisorsImpl(this);
        }
        return this.advisors;
    }

    /**
     * @return Entry point to manage RecommendedActions.
     */
    public RecommendedActions recommendedActions() {
        if (this.recommendedActions == null) {
            this.recommendedActions = new RecommendedActionsImpl(this);
        }
        return this.recommendedActions;
    }

    /**
     * @return Entry point to manage LocationBasedRecommendedActionSessionsOperationStatus.
     */
    public LocationBasedRecommendedActionSessionsOperationStatus locationBasedRecommendedActionSessionsOperationStatus() {
        if (this.locationBasedRecommendedActionSessionsOperationStatus == null) {
            this.locationBasedRecommendedActionSessionsOperationStatus = new LocationBasedRecommendedActionSessionsOperationStatusImpl(this);
        }
        return this.locationBasedRecommendedActionSessionsOperationStatus;
    }

    /**
     * @return Entry point to manage LocationBasedRecommendedActionSessionsResults.
     */
    public LocationBasedRecommendedActionSessionsResults locationBasedRecommendedActionSessionsResults() {
        if (this.locationBasedRecommendedActionSessionsResults == null) {
            this.locationBasedRecommendedActionSessionsResults = new LocationBasedRecommendedActionSessionsResultsImpl(this);
        }
        return this.locationBasedRecommendedActionSessionsResults;
    }

    /**
     * @return Entry point to manage PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections = new PrivateEndpointConnectionsImpl(this);
        }
        return this.privateEndpointConnections;
    }

    /**
     * @return Entry point to manage PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(this);
        }
        return this.privateLinkResources;
    }

    /**
     * @return Entry point to manage ServerKeys.
     */
    public ServerKeys serverKeys() {
        if (this.serverKeys == null) {
            this.serverKeys = new ServerKeysImpl(this);
        }
        return this.serverKeys;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public MySQLManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return MySQLManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private MySQLManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new MySQLManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}