package com.ketan.jpaManyToMany.respository;

import com.ketan.jpaManyToMany.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer>
{

}
