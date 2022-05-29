package com.any.Any.Repo;

import com.any.Any.Model.AddingQuestions;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddingQues extends CrudRepository<AddingQuestions, Long> {
    Long deleteById(long id);
//    @Modifying
//    @Query("delete from jobs_info u where u.nick = ?1")
//    void deleteUsersByFirstName(String nick);
}
