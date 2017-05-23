package calcio.rest;

import calcio.model.dao.CalciatoreRepository;
import calcio.model.entity.Calciatore;
import calcio.model.entity.Squadra;
import calcio.model.dao.SquadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nexse on 12/05/2017.
 */
/*@RestController
@RequestMapping(path = "/")*/
public class MainRestController {

    @Autowired
    private SquadraRepository squadraRepository;

    @Autowired
    private CalciatoreRepository calciatoreRepository;


    @GetMapping(path = "/")
    public String deviceControl(Device device) {
        if (device.isMobile()) {
            return "work with mobile";
        } else if (device.isTablet()) {
            return "work with table";
        }
        return "work";
    }














}
