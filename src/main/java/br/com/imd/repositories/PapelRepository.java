package br.com.imd.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.imd.domain.Papel;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long>{

}