package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.course_registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface courseregistry_Repo extends JpaRepository<course_registry,Integer> {
}
