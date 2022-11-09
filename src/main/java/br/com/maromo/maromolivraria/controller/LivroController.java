package br.com.maromo.maromolivraria.controller;

import br.com.maromo.maromolivraria.model.Livro;
import br.com.maromo.maromolivraria.repository.LivroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository livroRepository;


    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping
    public List<Livro> listar(){
        return livroRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Livro adicionar(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void delete(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.GONE)
    public Livro atualizar(@RequestBody Livro livro){
        return livroRepository.save(livro);

    }

}
