package com.codercms.ImportExcelDemo.Repositories;

import com.codercms.ImportExcelDemo.Entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
    @Override
    List<StudentEntity> findAll();
}
