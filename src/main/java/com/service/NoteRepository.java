package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entyti.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

}
