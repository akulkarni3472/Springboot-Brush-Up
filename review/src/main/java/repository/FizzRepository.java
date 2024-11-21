package repository;

import model.FizzModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FizzRepository extends JpaRepository<FizzModel, Integer> {
	
}
