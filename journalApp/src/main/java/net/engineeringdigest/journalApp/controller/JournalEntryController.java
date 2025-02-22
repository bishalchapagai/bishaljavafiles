package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/_JournalEntry")
public class JournalEntryController {

    private HashMap<Long,JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public ArrayList<JournalEntry> getAll(){

        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean post(@RequestBody JournalEntry Entry){
    //journalEntries.put(Entry.getId(),Entry);
    return true;
    }

    @GetMapping("/Id/{myId}")
    public JournalEntry getJournalEntryByID(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @DeleteMapping("/Id/{myId}")
    public JournalEntry deleteJournalEntryByID(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }

    @PutMapping("/Id/{myId}")
    public JournalEntry putJournalEntryByID(@PathVariable Long myId,@RequestBody JournalEntry myEntry){
        return journalEntries.put(myId,myEntry);
    }
}
