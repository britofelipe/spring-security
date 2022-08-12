package br.ufc.mandacaru.springProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.mandacaru.springProject.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

	List<Feedback> findByProductId(int id);
}