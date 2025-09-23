package com.cjc.springbootcrudapp.app1.repoi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cjc.springbootcrudapp.app1.model.Author;

@Repository
public interface AuthorRepositary extends CrudRepository<Author,Integer>
{
  public List<Author> findByUsernameAndPassword(String username,String password);
}
