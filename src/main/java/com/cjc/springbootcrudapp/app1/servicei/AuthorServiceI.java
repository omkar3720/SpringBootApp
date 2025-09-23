package com.cjc.springbootcrudapp.app1.servicei;

import java.util.List;

import com.cjc.springbootcrudapp.app1.model.Author;

public interface AuthorServiceI {

	public void saveAuthor(Author a);

	public List<Author> loginAuthor(String username, String password);

	public List<Author> deleteAuthor(int id);

	public Author editAuthor(int id);

	public List<Author> updateAuthor(Author a);

}
