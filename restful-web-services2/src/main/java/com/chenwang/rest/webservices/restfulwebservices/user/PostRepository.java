package com.chenwang.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// User是Entity, Integer是Primary Key的数据类型
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
