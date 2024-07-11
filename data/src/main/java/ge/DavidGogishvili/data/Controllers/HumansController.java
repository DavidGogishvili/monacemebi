package ge.DavidGogishvili.data.Controllers;


import ge.DavidGogishvili.data.Entities.Humans;
import ge.DavidGogishvili.data.Models.HumanCreateModel;
import ge.DavidGogishvili.data.Models.HumanSearchModel;
import ge.DavidGogishvili.data.Repositories.HumansRepo;
import ge.DavidGogishvili.data.Services.HumanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("humans")
public class HumansController {

    private final HumansRepo humansRepo;
    private final HumanService humanService;


    @PostMapping("/create")
    public Humans createHuman(@RequestBody HumanCreateModel humanCreateModel) {
        return humanService.createHuman(humanCreateModel);
    }


    @GetMapping("/find")
    public List<Humans> findAllHumans() {
        return humansRepo.findAll();
    }

    @PostMapping("/search")
    public List<Humans> searchHumans(@RequestBody HumanSearchModel humanSearchModel) {
        return humansRepo.findHumansByCriteria(humanSearchModel.name(),
                humanSearchModel.age(),
                humanSearchModel.gender(),
                humanSearchModel.familyName());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHuman(@PathVariable Integer id) {
        humansRepo.deleteById(id);
    }


}
