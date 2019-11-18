package com.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entyti.Department;
import com.entyti.Employee;
import com.entyti.Workk;

public interface WorkkRepository extends JpaRepository<Workk, Integer> {

<<<<<<< HEAD
	
	//trưởng phòng Xem được công việc của phòng ban nó
	 @Query(value = "(SELECT w.* FROM Workk w , Employee e where  w.id_empl=e.id_empl and e.id_department = ?1) union (SELECT w.* FROM Workk w where w.id_department=?1)" , nativeQuery = true)
	 List<Workk>  managerViewWork(Department id);
	 
	 //Nhân viên thì xem được công việc của từng nhân viên đó
	 @Query("SELECT w FROM Workk w where w.idEmpl=?1")
	 List<Workk> emplViewWork (Employee id);
	 
	 //admin,truongphong xem việc đã giao 
	 @Query("SELECT w FROM Workk w where w.assignerr=?1")
	 List<Workk> adminWatchWork (Employee id);
	
=======
//	 @Query("SELECT w FROM Workk  w  where  w.idEmpl.idEmpl= ?1 ")
//	 List<Workk>  findTitleById(Integer id);
>>>>>>> 0bb2606b83d087b02d3af6638179d3d82b6f7858
}
