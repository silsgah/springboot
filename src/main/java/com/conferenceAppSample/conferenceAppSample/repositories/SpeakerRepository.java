package com.conferenceAppSample.conferenceAppSample.repositories;

import com.conferenceAppSample.conferenceAppSample.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
