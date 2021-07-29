package com.frabelovix.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frabelovix.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
