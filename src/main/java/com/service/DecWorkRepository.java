package com.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entyti.DecWork;

public interface DecWorkRepository extends JpaRepository<DecWork, Integer> {
	@Query("Select w From DecWork d ,Decentraliza de , Workk w  Where d.idde=de.idDe and d.idwork=w.idWork and de.levell='nhan vien' and (de.idDepartment=w.idDepartment or de.idEmpl=w.idEmpl)")
	Optional<List<DecWork>> E();
}
