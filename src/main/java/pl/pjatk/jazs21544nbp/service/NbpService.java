package pl.pjatk.jazs21544nbp.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs21544nbp.NbpRepository;
import pl.pjatk.jazs21544nbp.model.NbpRequest;


import java.util.Date;

@Service
public class NbpService {
    private RestTemplate restTemplate;
    private NbpRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }
    //http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}

    public NbpRequest apiRequest(String startDate, String endDate){
        String api = "http://api.nbp.pl/api/cenyzlota/" + startDate + "/" + endDate;
//        NbpRequest res = restTemplate.getForObject(api, NbpRequest.class);
//        NbpRequest res = new NbpRequest();
//        nbpRepository.save(res);
        return res;
    }
}
