package pl.driver.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.driver.driver.entity.Advice;

@Repository
public interface AdviceRepository extends JpaRepository<Advice, Long> {
}
