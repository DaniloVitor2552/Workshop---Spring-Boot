package br.senai.sp.jandira.odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.odonto.model.Dentista;
//Jpa vai facilitar a vida do programador, no caso ele é responsavel pelo crud, nessa situacao esta inserindo no banco//
public interface DentistaRepository extends JpaRepository<Dentista, Long> {

	Dentista findByNome(String nome);

}
