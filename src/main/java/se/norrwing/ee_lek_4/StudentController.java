package se.norrwing.ee_lek_4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String getStudent(Model model) {
        Student student = new Student("Benny", "Benny@Linda.se");
        model.addAttribute("myStudent", student);
        return "studentPage";
    }
}
