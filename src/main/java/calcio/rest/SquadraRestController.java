package calcio.rest;

import calcio.model.dao.CalciatoreRepository;
import calcio.model.dao.SquadraRepository;
import calcio.model.entity.Squadra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nexse on 18/05/2017.
 */
@RestController
@RequestMapping(path="/squadra")
public class SquadraRestController {
    @Autowired
    private SquadraRepository squadraRepository;
    @Autowired
    private CalciatoreRepository calciatoreRepository;

    @GetMapping(path = "/insert")
    public String insert(@RequestParam String nome, @RequestParam String citta) {

        Squadra squadra = new Squadra();
        squadra.setName(nome);
        squadra.setCitta(citta);

        squadraRepository.save(squadra);

        return "saved";
    }

    @GetMapping(path = "/findAll")
    public @ResponseBody
    Iterable<Squadra> findAll() {

        return squadraRepository.findAll();
    }

    @GetMapping(path = "/findById")
    public @ResponseBody
    Squadra findById(@RequestParam Integer id) {

        return squadraRepository.findSquadraById(id);
    }
}
