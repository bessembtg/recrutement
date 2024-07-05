package com.sancella.recrutement.repositry;

import com.sancella.recrutement.entity.ListeDeCv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListeDeCvRepository extends CrudRepository<ListeDeCv, Integer> {
}
