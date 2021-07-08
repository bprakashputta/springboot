package com.linkedin.learning.springboot.data.repository;

import com.linkedin.learning.springboot.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
