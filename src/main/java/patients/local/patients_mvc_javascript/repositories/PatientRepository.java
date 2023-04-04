package patients.local.patients_mvc_javascript.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import patients.local.patients_mvc_javascript.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findAll(Pageable pageable);
}
