package com.sancella.recrutement.controller;

import com.sancella.recrutement.entity.ListeDeCv;
import com.sancella.recrutement.repositry.ListeDeCvRepository;
import com.sancella.recrutement.repositry.PlanningDesEntretiensRepository;
import com.sancella.recrutement.service.ListeDeCvService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.sancella.recrutement.entity.PlanningDesEntretiens;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(origins = "*")
public class ListeDeCvController {
    @Autowired
    private ListeDeCvRepository listeDeCvRepository;
    @Autowired
    PlanningDesEntretiensRepository planningDesEntretiensRepository;
    @Autowired
    private ListeDeCvService listeDeCvService;

    @GetMapping("/formCv")
    public String showForm(Model model) {
        model.addAttribute("cv", new ListeDeCv());
        return "formCv";
    }



    @PostMapping("/submitCv")
    public String submitCv(@ModelAttribute @Valid ListeDeCv cv, BindingResult result,
                           @RequestParam("cv") MultipartFile file, Model model) {

        try {
            // Convertir et ajouter le fichier à l'objet ListeDeCv
            cv.setCv(file.getBytes());
            cv.setDate(LocalDate.now());

            listeDeCvService.submitCv(cv); // Enregistrer le CV dans la base de données
        } catch (IOException e) {
            e.printStackTrace();
            return "error"; // Rediriger vers une page d'erreur en cas de problème
        }

        model.addAttribute("cv", cv);
        return "result";
    }

    @PostMapping("ajouterCondidat")
    public String ajouterCondidat(@RequestParam int id) {
        Optional<ListeDeCv> optionalCv = listeDeCvRepository.findById(id);
        if (optionalCv.isPresent()) {
            ListeDeCv cv = optionalCv.get();
            PlanningDesEntretiens entretien = new PlanningDesEntretiens();
            entretien.setNomPrenom(cv.getNomPrenom());
            entretien.setAge(cv.getAge());
            entretien.setRegion(cv.getRegion());
            entretien.setEtude(cv.getEtude());
            entretien.setDiplome(cv.getDiplome());
            entretien.setExperience(cv.getExperience());
            entretien.setCoordonnees(cv.getCoordonnees());
            entretien.setEmail(cv.getEmail());
            entretien.setRecommandationsDePoste(cv.getRecommandationsDePoste());
            entretien.setNumCv(cv.getNumCv());
            entretien.setCv_pdf(cv.getCv());
            entretien.setDate(cv.getDate());
            entretien.setSpecialite(cv.getSpecialite());
            cv.setEntretienTelephonique("Ajouté avec succès");
            listeDeCvRepository.save(cv);
            planningDesEntretiensRepository.save(entretien);
        }
        return "redirect:admin/tentretien";
    }
    @PostMapping("/download-cv/{cvId}")
    public ResponseEntity<byte[]> downloadCv(@PathVariable("cvId") Integer cvId) {
        // Votre logique pour télécharger le CV en fonction de cvId
        byte[] cvContent = listeDeCvService.getCvContentById(cvId);
        if (cvContent == null) {
            return ResponseEntity.notFound().build();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "cv_" + cvId + ".pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .body(cvContent);
    }




 /*   @GetMapping("/table")
   public String showListeDeCv(Model model) {
      Iterable<ListeDeCv> cvs=listeDeCvRepository.findAll();
      model.addAttribute("cvs",cvs);
      return "admin/index";
   }*/
 @GetMapping(value = "/table", produces = MediaType.APPLICATION_JSON_VALUE)
 public Iterable<ListeDeCv> showListeDeCv() {
     return listeDeCvRepository.findAll();
 }
   @GetMapping("/admin/tentretien")
    public String showTentretien(Model model) {
      List<PlanningDesEntretiens> ent=planningDesEntretiensRepository.findAll();
      model.addAttribute("ent",ent);
      return "admin/entretien";
   }
    // Méthode pour gérer la mise à jour d'un candidat
    @PostMapping("/updateCondidat/{entretienId}")
    public String updateCondidat(@PathVariable("entretienId") int entretienId,
                                 @RequestParam("Date_entretien") String Date_entretien,
                                 @RequestParam("Horaire") String Horaire,
                                 @RequestParam("Lieu") String Lieu,
                                 @RequestParam("Type_entretein") String Type_entretein,
                                 @RequestParam("Evaluateur_1") String Evaluateur_1,
                                 @RequestParam("Evaluateur_2") String Evaluateur_2,
                                 @RequestParam("Evaluateur_3") String Evaluateur_3) {

        Optional<PlanningDesEntretiens> optionalEntretien = planningDesEntretiensRepository.findById(entretienId);
        if (optionalEntretien.isPresent()) {
            PlanningDesEntretiens entretien = optionalEntretien.get();
            // Mettez à jour le champ modifiable avec les données fournies par l'utilisateur
            entretien.setDate_entretien(Date_entretien);
            entretien.setHoraire(Horaire);
            entretien.setLieu(Lieu);
            entretien.setType_entretein(Type_entretein);
            entretien.setEvaluateur_1(Evaluateur_1);
            entretien.setEvaluateur_2(Evaluateur_2);
            entretien.setEvaluateur_3(Evaluateur_3);

            // Enregistrez les modifications dans la base de données
            planningDesEntretiensRepository.save(entretien);
        }

        // Redirection vers la page où le tableau est affiché
        return "redirect:/admin/tentretien";
    }
}
