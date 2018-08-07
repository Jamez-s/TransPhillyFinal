package com.septaroutes.demo.User;


import com.septaroutes.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	public User findByEmail(String email);

	User findOne(long id);
}
