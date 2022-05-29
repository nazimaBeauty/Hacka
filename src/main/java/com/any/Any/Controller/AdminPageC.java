package com.any.Any.Controller;

import com.any.Any.Model.AddingQuestions;
import com.any.Any.Repo.AddingQues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminPageC {
    @Autowired
    AddingQues addingQues;

    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public String page(@RequestParam(defaultValue = "") String id, Model model) {
        System.out.println(id);
        if (!id.equals(""))
            addingQues.deleteById(Long.valueOf(id));
        List<AddingQuestions> aiStudying;
        aiStudying = (List<AddingQuestions>) addingQues.findAll();
        model.addAttribute("posts", aiStudying);
        return "adminPage";
    }

    @RequestMapping(value = {"/admin"}, method = RequestMethod.POST)
    public String pageP() {
        return "redirect:/adminPage";
    }

}
