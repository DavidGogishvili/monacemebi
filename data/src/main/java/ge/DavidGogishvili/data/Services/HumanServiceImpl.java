package ge.DavidGogishvili.data.Services;


import ge.DavidGogishvili.data.Entities.Humans;
import ge.DavidGogishvili.data.Models.HumanCreateModel;
import ge.DavidGogishvili.data.Repositories.HumansRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HumanServiceImpl implements HumanService {

    private final HumansRepo humansRepo;



    @Override
    public Humans createHuman(HumanCreateModel humanCreateModel) {
        var humans = new Humans();
        humans.setGender(String.valueOf(humanCreateModel.gender()));
        humans.setName(humanCreateModel.name());
        humans.setFamilyName(humanCreateModel.familyName());
        humans.setAge(humanCreateModel.age());
        humansRepo.save(humans);
        return humans;
    }
}
