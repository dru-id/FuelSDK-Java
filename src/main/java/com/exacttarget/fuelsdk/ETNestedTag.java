/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.RestObject;
import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

/**
 * An <code>ETAsset</code> object represents aa asset
 * in the Salesforce Marketing Cloud.
 */

@RestObject(path = "/hub/v1/nestedtags/{tagId}",
            primaryKey = "id",
            collection = "items",
            totalCount = "count")
public class ETNestedTag extends ETRestObject{

    @Getter @Setter
    @Expose
    @ExternalName("id")
    private String id = null;

    @Getter @Setter
    @Expose
    @ExternalName("name")
    private String name = null;

    @Getter @Setter
    @Expose
    @ExternalName("description")
    private String description = null;
}
