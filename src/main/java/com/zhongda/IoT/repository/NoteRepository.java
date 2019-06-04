package com.zhongda.IoT.repository;

import com.zhongda.IoT.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * author 钱波.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
