package com.nikvs84.remindme.server.service;

import com.nikvs84.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {
    Remind findById(long id);

    List<Remind> getAll();

    Remind save(Remind remind);

    void remove(long id);
}
