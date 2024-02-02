package com.Consultant.demo.Repository;

import com.Consultant.demo.Model.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Consultant,Long> {

}
