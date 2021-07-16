// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for LiveEvents Get. */
public final class LiveEventsGetSamples {
    /**
     * Sample code: Get a LiveEvent by name.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getALiveEventByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .liveEvents()
            .getWithResponse("mediaresources", "slitestmedia10", "myLiveEvent1", Context.NONE);
    }
}
