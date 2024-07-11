package ge.DavidGogishvili.data.Services;


import ge.DavidGogishvili.data.Entities.Humans;
import ge.DavidGogishvili.data.Models.HumanCreateModel;

public interface HumanService {


    Humans createHuman(HumanCreateModel humanCreateModel);

}
