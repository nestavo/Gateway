package Elim.interf;

import org.springframework.data.jpa.repository.JpaRepository;

import Elim.modelo.Modeli;

public interface Inte extends JpaRepository<Modeli, Long>{

	void deleteById(long id);
}
