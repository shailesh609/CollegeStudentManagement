package com.WebApp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.WebApp.model.students;

@Repository
@EnableJpaRepositories
public interface studentRepository extends JpaRepository<students,Integer>{

	@Query("from students where college_id=?1 ")
	List<students> findStudentByCollege(int clg_id);
}
