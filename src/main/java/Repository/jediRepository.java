package Repository;


import Model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class jediRepository {
    private List<Model.Jedi> Jedi;

    public List<Jedi> getAllJedi(){
        Jedi = new ArrayList<>();
        Jedi.add(new Jedi("Luke", "Skywalker"));
        return Jedi;
    }

    public void add (final Jedi jedi){
        this.Jedi.add(jedi);

    }

}
