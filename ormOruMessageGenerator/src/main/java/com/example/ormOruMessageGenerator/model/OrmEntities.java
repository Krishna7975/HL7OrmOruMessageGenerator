package com.example.ormOruMessageGenerator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrmEntities
{

    private String namespaceID;
    private String sendApplication;
    private String sendFacility;
    private String receivingFacility;
    private String patientID;
    private String patientName;
    private String familyname;
    private String doctorName;
    private String gender;
    private String patientVistiorsID;
    private String patientInOut;
    private String orctype;
    private String orderSendingNumber;
    private String orderReceivingNumber;
    private String obrType;

}
