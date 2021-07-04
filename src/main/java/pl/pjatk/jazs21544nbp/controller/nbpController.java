package pl.pjatk.jazs21544nbp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.jazs21544nbp.model.NbpRequest;
import pl.pjatk.jazs21544nbp.service.NbpService;

import java.util.Date;

@RestController
@RequestMapping("/nbp")
public class nbpController {
    private NbpService nbpService;

    public nbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{startDate}/{endDate}")
    public ResponseEntity<NbpRequest> getGold(@PathVariable String startDate, @PathVariable String endDate){
        return ResponseEntity.ok(nbpService.apiRequest(startDate, endDate));
    }

}
