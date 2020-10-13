/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.InternalProperty;
import com.exacttarget.fuelsdk.annotations.SoapObject;
import com.exacttarget.fuelsdk.internal.Send;
import lombok.Data;

import java.util.Date;

/**
 * An <code>ETTriggeredSendSummary</code> represents a Triggered Send Summary
 * in the Salesforce Marketing Cloud. 
 */

@SoapObject(internalType = Send.class)
@Data
public class ETSend extends ETSoapObject {

    @ExternalName("id")
    private String id = null;

    @ExternalName("email")
    @InternalProperty("Email.ID")
    private ETEmail email = null;

    @ExternalName("emailName")
    private String emailName;

    @ExternalName("uniqueClicks")
    private Long uniqueClicks;

    @ExternalName("uniqueOpens")
    private Long uniqueOpens;

    @ExternalName("unsubscribes")
    private Long unsubscribes;

    @ExternalName("sendDate")
    private Date sendDate;

    @ExternalName("additional")
    private String additional;

    @ExternalName("hardBounces")
    private Long hardBounces;

}
