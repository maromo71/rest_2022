package br.com.maromo.maromolivraria.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;

    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private int ano;

    @Column(nullable = false)
    private String editora;

    @Column(nullable = false)
    private String isbn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Livro livro = (Livro) o;
        return idLivro != null && Objects.equals(idLivro, livro.idLivro);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

