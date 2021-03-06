package com.theironyard.services;

import com.theironyard.entities.Comment;
import com.theironyard.entities.Drawing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ericweidman on 4/11/16.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
    List<Comment> findAllByDrawingId(int id);
}
