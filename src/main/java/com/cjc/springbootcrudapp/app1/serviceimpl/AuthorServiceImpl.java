package com.cjc.springbootcrudapp.app1.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.springbootcrudapp.app1.model.Author;
import com.cjc.springbootcrudapp.app1.repoi.AuthorRepositary;
import com.cjc.springbootcrudapp.app1.servicei.AuthorServiceI;

@Service
public class AuthorServiceImpl implements AuthorServiceI
{
	
	@Autowired
	AuthorRepositary ar;

	@Override
	public void saveAuthor(Author a) 
	{
		System.out.println("In Service");
		ar.save(a);
		System.out.println("Out Service");
		
	}

	@Override
	public List<Author> loginAuthor(String username, String password) 
	{
		if(username.equals("Admin") && password.equals("Admin"))
		{
			List<Author> l = (List<Author>) ar.findAll();
			return l;
		}
		else
		{
			List<Author> l = ar.findByUsernameAndPassword(username, password);
			return l;
		}
	}

	@Override
	public List<Author> deleteAuthor(int id) 
	{
		ar.deleteById(id);
		
		List<Author> l = (List<Author>) ar.findAll();
		return l;
	}

	@Override
	public Author editAuthor(int id) {
		
		Optional<Author> l = ar.findById(id);
		if(l.isPresent())
		{
			Author a = l.get();
			return a;
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Author> updateAuthor(Author a) {
		
		ar.save(a);
		
		List<Author> l = (List<Author>) ar.findAll();
		
		return l;
	}

}
