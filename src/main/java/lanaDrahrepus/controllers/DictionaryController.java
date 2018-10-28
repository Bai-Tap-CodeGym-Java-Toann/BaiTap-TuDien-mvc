package lanaDrahrepus.controllers;

import lanaDrahrepus.services.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DictionaryController {
    @Autowired
    Dictionary dictionary;

    @GetMapping("/")
    public String toSearch(RedirectAttributes redirect){
        return "redirect:/dictionary";
    }

    @GetMapping("/dictionary")
    public String toPage(){
        return "dictionary";
    }
    @PostMapping("/dictionary")
    public String showFinded(Model model, @RequestParam String en){
        String finded = "chưa có dữ liệu";
        if (!(dictionary.find(en).equals(""))){
            finded = dictionary.find(en);
        }
        model.addAttribute("finded",finded);
        return "dictionary";
    }

}
