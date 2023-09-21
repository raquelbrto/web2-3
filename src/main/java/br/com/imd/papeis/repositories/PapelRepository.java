package br.com.imd.papeis.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.imd.papeis.domain.Papel;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long>{

}