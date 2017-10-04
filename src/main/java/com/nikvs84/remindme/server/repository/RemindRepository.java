package com.nikvs84.remindme.server.repository;

import com.nikvs84.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {

}
