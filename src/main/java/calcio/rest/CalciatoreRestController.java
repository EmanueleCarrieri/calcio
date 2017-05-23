package calcio.rest;

import calcio.model.dao.CalciatoreRepository;
import calcio.model.dao.SquadraRepository;
import calcio.model.entity.Calciatore;
import calcio.model.entity.Squadra;
import com.mysql.jdbc.exceptions.MySQLDataException;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 * Created by nexse on 18/05/2017.
 */
@RestController
@RequestMapping(path = "/calciatore")
public class CalciatoreRestController {
    @Autowired
    private CalciatoreRepository calciatoreRepository;
    @Autowired
    private SquadraRepository squadraRepository;

    @GetMapping(path = "/insert")
    public String insert(@RequestParam String nome, @RequestParam int numero, @RequestParam Integer idSquadra) {

        Calciatore calciatore = new Calciatore();
        calciatore.setNome(nome);
        calciatore.setNumero(numero);
        calciatore.setSquadra(squadraRepository.findSquadraById(idSquadra));
        System.out.println(calciatore.toString());
        try {
            calciatoreRepository.save(calciatore);
        }catch (HibernateException hibernateExc){
            hibernateExc.printStackTrace();
        }

        return "saved";
    }

    @GetMapping(path = "/findAll")
    public Iterable<Calciatore> findAll() {

        return calciatoreRepository.findAll();
    }

    @GetMapping(path = "/findById")
    public Calciatore findById(@RequestParam Integer id) {

        return calciatoreRepository.findCalciatoreById(id);
    }

    @GetMapping(path = "/findByNome")
    public Calciatore findByNome(@RequestParam String nome) {

        return calciatoreRepository.findCalciatoreByNome(nome);
    }
}
