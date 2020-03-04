package controller;

import models.FareGraphRequest;
import models.FareGraphResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static Constants.Constants.FARE_GRAPH_PATH;


@RestController
public class FareController {

    @ResponseBody
    @RequestMapping(FARE_GRAPH_PATH)
    public FareGraphResponse getPolicy(FareGraphRequest fareGraphRequest) {
            return null ;
    }
}
