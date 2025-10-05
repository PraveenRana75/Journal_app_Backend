package com.Brajpandit.jurnalApp.Controler;

import com.Brajpandit.jurnalApp.Entity.JurnalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.HashMap;

import java.util.Map;

@RestController
@RequestMapping(/"jurnal")
public class JurnaEntryControler {

    private Map<Long, JurnalEntry> jurnalEntries = new HashMap<>()

     @GetMapping
    public List<JurnalEntry>getAll(){
        return new ArrayList<>(jurnalEntries.values());

    }




}
