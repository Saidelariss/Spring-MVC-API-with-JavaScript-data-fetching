package patients.local.patients_mvc_javascript.web;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import patients.local.patients_mvc_javascript.entities.Patient;
import patients.local.patients_mvc_javascript.repositories.PatientRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;

    @GetMapping(path = "/patients")
    public List<Patient> patients(@RequestParam(name = "page", defaultValue = "0") int page ,
                                  @RequestParam(name = "size" ,defaultValue = "5") int size ){
        //List<Patient> listePatients =  patientRepository.findAll();
        Page<Patient> patientPage = patientRepository.findAll(PageRequest.of(page,size));
        return patientPage.getContent();
    }
}
