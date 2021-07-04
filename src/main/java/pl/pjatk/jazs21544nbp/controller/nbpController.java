package pl.pjatk.jazs21544nbp.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.jazs21544nbp.GlobalExceptionHandler;
import pl.pjatk.jazs21544nbp.model.NbpRequest;
import pl.pjatk.jazs21544nbp.service.NbpService;


@RestController
@RequestMapping("/nbp")
public class nbpController {
    private NbpService nbpService;

    public nbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @ApiOperation(value =  "Get rate",
            response = NbpRequest.class,
            notes = "Get rate of gold")

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Good"),
            @ApiResponse(code = 404, message = "Date out of range"),
            @ApiResponse(code = 401, message = "You shouldn't see this"),
            @ApiResponse(code = 500, message = "Spring problem"),
    })
    @GetMapping("/{startDate}/{endDate}")
    public ResponseEntity<NbpRequest> getGold(@PathVariable String startDate, @PathVariable String endDate) throws GlobalExceptionHandler {
        return ResponseEntity.ok(nbpService.apiRequest(startDate, endDate));
    }

}
