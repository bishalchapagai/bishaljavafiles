package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.Service.JournalEntryService;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public ArrayList<JournalEntry> getAll(){
        return null;
    }

    @PostMapping("/post")
    public JournalEntry post(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
        
    }

    @GetMapping("/Id/{myId}")
    public Optional<JournalEntry> getJournalEntryByID(@PathVariable ObjectId myId) {
        return Optional.ofNullable(journalEntryService.findById(myId).orElse(null));
    }

    @DeleteMapping("/Id/{myId}")
    public boolean deleteJournalEntryByID(@PathVariable ObjectId myId){
         journalEntryService.deleteById(myId);
         return true;
    }

    @PutMapping("/Id/{myId}")
    public JournalEntry putJournalEntryByID(@PathVariable ObjectId myId,@RequestBody JournalEntry myEntry) {
        JournalEntry old= journalEntryService.findById(myId).orElse(null);
        if(old!=null){
            old.setTitle(myEntry.getTitle()!=null && myEntry.getTitle().equals("")? myEntry.getTitle() : old.getTitle());
            old.setContent(myEntry.getContent()!=null && myEntry.getContent().equals("")? myEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
        }
}

