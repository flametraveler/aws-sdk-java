/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateSkillFromUsersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateSkillFromUsersRequestMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationArn").build();
    private static final MarshallingInfo<String> SKILLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillId").build();

    private static final DisassociateSkillFromUsersRequestMarshaller instance = new DisassociateSkillFromUsersRequestMarshaller();

    public static DisassociateSkillFromUsersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateSkillFromUsersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateSkillFromUsersRequest.getOrganizationArn(), ORGANIZATIONARN_BINDING);
            protocolMarshaller.marshall(disassociateSkillFromUsersRequest.getSkillId(), SKILLID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
