package com.worker.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import com.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
