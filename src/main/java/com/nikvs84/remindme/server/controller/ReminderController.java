package com.nikvs84.remindme.server.controller;

import com.nikvs84.remindme.server.entity.Remind;
import com.nikvs84.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    public List<Remind> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    public Remind getRemindById(@PathVariable long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.POST)
    public void delete(@PathVariable("id") long deleteId) {
        service.remove(deleteId);
    }
}

