package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entyti.DecWork;

public interface DecWorkRepository extends JpaRepository<DecWork, Integer> {
	@Query("Select w From DecWork d ,Decentraliza de , Workk w  Where d.idde=de.idDe and d.idwork=w.idWork and de.levell='truong phong'and de.idDepartment=1 and (de.idDepartment=w.idDepartment or de.idEmpl=w.idEmpl)")
	Optional<DecWork> E();
}
