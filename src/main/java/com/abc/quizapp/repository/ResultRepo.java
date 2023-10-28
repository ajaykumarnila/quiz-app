package com.abc.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abc.quizapp.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
