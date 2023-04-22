package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;
import pl.sda.OrangeJavaPL2.service.BreadService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/breads")
@RequiredArgsConstructor
public class BreadRestController {

    private final BreadService breadService;

    // example:    localhost:<port>/api/breads
    @GetMapping()
    public List<Bread> getAllBreads() {
        return breadService.getAllBreads();
    }


    //PostMapping without mapping error codes returning to client
//    @PostMapping()
//    void addBread(@RequestBody Bread bread) { // @RequestBody to map to bread
//        breadRepository.addBread(bread);
//    } //
    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {
        return breadService.addBread(bread);
    }
}
