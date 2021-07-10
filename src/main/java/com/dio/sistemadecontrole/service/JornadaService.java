package com.dio.sistemadecontrole.service;

import com.dio.sistemadecontrole.model.JornadaTrabalho;
import com.dio.sistemadecontrole.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;                            //precisara da dependencia repository

    @Autowired                                                      //faz a instancia da classe automaticamente, poderia colocar no de cima também
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);                         //update usa o mesmo metodo save
    }

    public void deleteJornada(long idJornada) {                                 //void nao retorna nada
        jornadaRepository.deleteById(idJornada);
    }

}
