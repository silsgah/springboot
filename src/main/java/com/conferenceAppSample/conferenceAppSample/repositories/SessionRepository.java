package com.conferenceAppSample.conferenceAppSample.repositories;

import com.conferenceAppSample.conferenceAppSample.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SessionRepository  extends JpaRepository<Session, Long> {
}
