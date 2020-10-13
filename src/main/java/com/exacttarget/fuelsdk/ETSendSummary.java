/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.SoapObject;
import com.exacttarget.fuelsdk.internal.SendSummary;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * An <code>ETTriggeredSendSummary</code> represents a Triggered Send Summary
 * in the Salesforce Marketing Cloud. 
 */

@SoapObject(internalType = SendSummary.class)
@Data
@EqualsAndHashCode(of = "sendID")
public class ETSendSummary extends ETSoapObject {

    //@ExternalName("id")
    private String id = null;

    @ExternalName("sendID")
    private String sendID = null;

    @ExternalName("totalSent")
    private Long totalSent;

    @ExternalName("createdDate")
    private Date createdDate = null;

    @ExternalName("modifiedDate")
    private Date modifiedDate = null;

    @ExternalName("deliveredTime")
    private String deliveredTime = null;
}
