package org.trananh.shoppingappbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.trananh.shoppingappbackend.model.StructureValue;

public interface StructureValueRepository extends JpaRepository<StructureValue, String>{
	@Query(value = "select * from structure_values where type = ?1", nativeQuery=true)
	List<StructureValue> findByType(int type);
	
	@Query(value = "select * from structure_values where parent_id = ?1", nativeQuery=true)
	List<StructureValue> findByparentId(String parentId);
	
	@Query(value = "select * from structure_values where type = ?1 and level = ?2", nativeQuery=true)
	List<StructureValue> findByTypeAndLevel(int type, int level);
}
