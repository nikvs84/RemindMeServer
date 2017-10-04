package com.nikvs84.remindme.server.service;

import com.nikvs84.remindme.server.entity.Remind;
import com.nikvs84.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    RemindRepository remindRepository;

    @Override
    public Remind findById(long id) {
        return remindRepository.findById(id);
    }

    @Override
    public List<Remind> getAll() {
        return remindRepository.findAll();
    }

    @Override
    public Remind save(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    @Override
    public void remove(long id) {
        remindRepository.deleteById(id);
    }
}
