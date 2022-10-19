/**
 * 
 */
package com.cogent.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.bean.Product02;


/**
 * @author Greg N.
 * @date :
 * 
 */
@Repository
public interface ProdRepo extends JpaRepository<Product02, Integer> {

}