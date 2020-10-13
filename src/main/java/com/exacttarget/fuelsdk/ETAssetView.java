/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.RestObject;
import com.google.gson.annotations.Expose;
import lombok.Data;

/**
 * An <code>ETAsset</code> object represents aa asset
 * in the Salesforce Marketing Cloud.
 */

@RestObject(path = "asset/v1/content/assets/{id}/channelviews/{viewname}",
            primaryKey = "id",
            collection = "items",
            totalCount = "count")
@Data
public class ETAssetView extends ETRestObject{

    @Expose
    @ExternalName("id")
    private String id = null;

    @Expose
    @ExternalName("compiled")
    private String compiled = null;

}
