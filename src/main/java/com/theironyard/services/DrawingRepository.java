package com.theironyard.services;

import com.theironyard.entities.Drawing;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by ericweidman on 4/3/16.
 */
public interface DrawingRepository extends CrudRepository<Drawing, Integer> {
    List<Drawing> findByUser (User user);
}
