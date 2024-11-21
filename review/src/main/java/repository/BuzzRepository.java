package repository;

import model.BuzzModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BuzzRepository extends JpaRepository<BuzzModel, Integer> {

}
