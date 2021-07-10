package com.dio.sistemadecontrole.controller;

import com.dio.sistemadecontrole.model.JornadaTrabalho;
import com.dio.sistemadecontrole.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController                                 //faz uma requisicao GET, ou POST solicitando uma lista de ususarios e recebe um JSON
@RequestMapping("/jornada")                     //caminho da URL que chega nesta classe
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping                                                                                //@PostMapping: assim que o caminho chegar em /jornada e fizer uma requisicao POST , já vai chamar createJornada
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {        //RequestBody faz com que seja mandado um objeto tipo Jornada via POST
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")                                                                                                 //passa o id pelo caminho
    public ResponseEntity<JornadaTrabalho> getJornadaBYId(@PathVariable("idJornada") long idJornada) throws Exception {         //pega o id passado pelo caminho
        return  ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @PostMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteBYId(@PathVariable("idJornada") long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }

}
