package com.cos.jwtex01.domain;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cos.jwtex01.domain.Diary;

// generic Long
public interface DiaryRepository extends JpaRepository<Diary, Long>{
	
	@Query(value = "SELECT * FROM Diary WHERE admin_no = ?1", nativeQuery = true)
	List<Map<String,Object>> findByAdmin_no(Long admin_no);
	
	
	@Query(value = "SELECT * FROM Diary WHERE diary_no = ?1", nativeQuery = true)
	Optional <Diary> findByDiary_no(Long diary_no);
	
	
}	

// git remote set-url origin https://github-rlagudals95@github.com/github-rlagudals95/github-repository-name.git

