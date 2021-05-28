package br.com.alura.agenda.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import br.com.alura.agenda.model.Aluno;

@Dao
public interface RoomAlunoDAO {
    //Quando se coloca esse @Insert o Room entende que esse método vai ser uma implementação que
    // vai pegar o argumento que está recebendo e vai salvar no banco de dados. É claro, esse
    // argumento precisa ser uma entidade

    @Insert
    void salva(Aluno aluno);

    @Query("SELECT * FROM aluno")
    List<Aluno> todos();

    @Delete
    void remove(Aluno aluno);
}
