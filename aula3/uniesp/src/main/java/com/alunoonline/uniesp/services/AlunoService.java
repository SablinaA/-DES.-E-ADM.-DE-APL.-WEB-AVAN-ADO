package com.alunoonline.uniesp.services;
import com.alunoonline.uniesp.models.Aluno;
import com.alunoonline.uniesp.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public Aluno create(Aluno aluno){
       return repository.save(aluno);

    }
}
