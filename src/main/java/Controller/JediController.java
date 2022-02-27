package Controller;

import Model.Jedi;
import Repository.jediRepository;
import org.jetbrains.annotations.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class JediController {

    @Autowired
    private JediRepository repository;

    @GetMapping ("/jedi")
    public ModelAndView jedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");
        ModelAndView modelAndView1;
        modelAndView1 = modelAndView.addObject("alljedi");
        return modelAndView;
    }

    @GetMapping("/new-jedi")
    public ModelAndView newjedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-jedi");
        modelAndView.addObject("jedi", newjedi());
        return modelAndView;
    }

    @PostMapping("/jedi")
    public String createJedi(ModelAttribute Jedi){
        repository(Jedi());


        return "redirect:jedi";
    }

    private void repository(Object jedi) {
    }

    private Object Jedi() {
        return jedi();
    }


    private class JediRepository {
        @Contract(pure = true)
        public void getAllJedi() {
        }
    }
}



