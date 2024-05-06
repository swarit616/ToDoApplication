package com.CRUD.ToDo.App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.ToDo.App.Model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>
{

}