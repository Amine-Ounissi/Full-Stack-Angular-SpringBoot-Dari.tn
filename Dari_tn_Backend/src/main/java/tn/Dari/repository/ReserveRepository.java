package tn.Dari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.Dari.entities.Reserve;
@Repository
public interface ReserveRepository extends JpaRepository<Reserve,Long> {
}
