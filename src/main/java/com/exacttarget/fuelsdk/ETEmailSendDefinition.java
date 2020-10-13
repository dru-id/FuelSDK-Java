/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.InternalProperty;
import com.exacttarget.fuelsdk.annotations.SoapObject;
import com.exacttarget.fuelsdk.internal.EmailSendDefinition;
import lombok.Data;

/**
 * An <code>ETTriggeredSendSummary</code> represents a Triggered Send Summary
 * in the Salesforce Marketing Cloud. 
 */

@SoapObject(internalType = EmailSendDefinition.class)
@Data
public class ETEmailSendDefinition extends ETSoapObject{
    
    @ExternalName("id")
    private String id = null;

    @ExternalName("email")
    @InternalProperty("Email.ID")
    private ETEmail email = null;

}
