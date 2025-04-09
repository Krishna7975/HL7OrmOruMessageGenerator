package com.example.ormOruMessageGenerator.controller;

import com.example.ormOruMessageGenerator.service.OrmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Hl7Controller
{
    private final OrmService ormService;

    public String orm() throws Exception {
    String get =String.valueOf(this.ormService.create_ADT_A01());
    return get;
    }
}
