package calcio.rest;

import calcio.model.dao.CalciatoreRepository;
import calcio.model.dao.SquadraRepository;
import calcio.model.dao.StatisticaRepository;
import calcio.model.entity.Statistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nexse on 18/05/2017.
 */
@RestController
@RequestMapping(path = "/statistica")
public class StatisticaRestController {

    @Autowired
    private StatisticaRepository statisticaRepository;
    @Autowired
    private SquadraRepository squadraRepository;
    @Autowired
    private CalciatoreRepository calciatoreRepository;

    @GetMapping(path = "/findAll")
    public Iterable<Statistica> findAll() {
        return statisticaRepository.findAll();
    }

    @GetMapping(path = "/insertByGiocatoreId")
    public String insertByGiocatoreId(@RequestParam int idGiocatore, @RequestParam int partiteGiocate, @RequestParam int numReti) {

        Statistica statistica = new Statistica();
        statistica.setPartiteGiocate(partiteGiocate);
        statistica.setNumeroReti(numReti);
        statistica.setCalciatore(calciatoreRepository.findCalciatoreById(idGiocatore));
        statisticaRepository.save(statistica);

        return "saved";
    }

    @PostMapping(path = "/insertByJson")
    public String insertByJSON(@RequestBody Statistica statistica) {

        statisticaRepository.save(statistica);

        return statistica.toString();
    }

}
