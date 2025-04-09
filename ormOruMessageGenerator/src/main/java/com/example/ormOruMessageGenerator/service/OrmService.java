package com.example.ormOruMessageGenerator.service;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v23.message.ADT_A01;
import ca.uhn.hl7v2.model.v23.segment.MSH;
import ca.uhn.hl7v2.model.v23.segment.PID;
import ca.uhn.hl7v2.parser.Parser;
import com.example.ormOruMessageGenerator.model.OrmEntities;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
public class OrmService {

    private final OrmEntities ormEntities;
    @SneakyThrows
    public ADT_A01 create_ADT_A01() throws Exception{
        try {
            ADT_A01 adt = new ADT_A01();
            adt.initQuickstart("ADT", "A01", "p");

            MSH msh = adt.getMSH();
            msh.getMsh3_SendingApplication().getNamespaceID().setValue(ormEntities.getNamespaceID());
            msh.getMsh4_SendingFacility().getNamespaceID().setValue(ormEntities.getSendFacility());
            msh.getMsh6_ReceivingFacility().getNamespaceID().setValue(ormEntities.getReceivingFacility());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM_DD_YYYY");

            PID pid = adt.getPID();
            pid.getPatientName(0).getFamilyName().setValue(ormEntities.getPatientName());
            pid.getPatientName(0).getGivenName().setValue(ormEntities.getFamilyname());
            pid.getSex().setValue(ormEntities.getGender());

            HapiContext context = new DefaultHapiContext();
                Parser parser = context.getPipeParser();
                String encodedMessage = parser.encode(adt);
                log.info("printing value"+encodedMessage);

        }catch (Exception exception){
            log.info("exception failed to create " +exception);
        }
        return null;
    }
}