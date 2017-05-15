package calcio.rest;

import calcio.model.entity.Squadra;
import calcio.model.DAO.SquadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nexse on 12/05/2017.
 */
@RestController
@RequestMapping(path="/")
public class RestControllers {

    @Autowired
    private SquadraRepository squadraRepository;

    @GetMapping(path="/")
    public String work() {

        return "work";
    }

    @GetMapping(path="/findAll")
    public @ResponseBody Iterable<Squadra> findAll() {

        return squadraRepository.findAll();
    }


}
