package com.kachadi.web.repo;

import com.kachadi.web.domain.ErrorMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: weimeng
 * Date: 2018/3/26 13:39
 */
@Repository
public interface ErrorMessageRepo extends JpaRepository<ErrorMessage, String> {

}
