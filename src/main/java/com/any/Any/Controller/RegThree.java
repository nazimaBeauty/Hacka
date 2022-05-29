//package com.any.Any.Controller;
//
//import com.any.Any.Model.AddingQuestions;
//import com.any.Any.Repo.AddingQues;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.io.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//@Controller
//public class RegThree {
//    boolean checker = false;
//    @Autowired
//    AddingQues addingQues;
//
//    @RequestMapping(value = {"/regthree"}, method = RequestMethod.GET)
//    public String page() {
//        return "Registration3";
//    }
//
//    @RequestMapping(value = {"/regthree"}, method = RequestMethod.POST)
//    public String pageP(@RequestParam(defaultValue = "") String select, @RequestParam(defaultValue = "") String select_1,
//                        @RequestParam(defaultValue = "") String select_2, @RequestParam(defaultValue = "") String select_3,
//                        @RequestParam(defaultValue = "") String select_7, @RequestParam(defaultValue = "") String select_4,
//                        @RequestParam(defaultValue = "") String select_5, @RequestParam(defaultValue = "") String select_6,
//                        Model model) throws IOException {
//        if (checker) {
//            model.addAttribute("checker", "fail");
//        }
//        int x = 0;
//        double y = 0, z = 0;
//        if (select.equals("Женщине") || select.equals("Не знаю")) {
//            ++x;
//        }
//        if (select_1.equals("а) Довольно быстро")) {
//            ++x;
//        }
//        if (select_2.equals("а)Соглашусь") || select_2.equals("б)Затрудняюсь ответить")) {
//            ++x;
//        }
//        if (select_3.equals("а)Соглашусь") || select_3.equals("б)Затрудняюсь ответить")) {
//            ++x;
//        }
//        if (select_7.equals("б)Нравится ли мне результат") || select_7.equals("в)На основе личных ощущений")) {
//            ++x;
//        }
//        if (select_4.equals("а)Нет") || select_4.equals("б)Нормально")) {
//            ++x;
//        }
//        if (select_5.equals("а)Соглашусь") || select_5.equals("б)Затрудняюсь ответить")) {
//            ++x;
//        }
//        if (select_6.equals("б)Затрудняюсь ответить") || select_6.equals("в) Не соглашусь")) {
//            ++x;
//        }
//        y = (x * 100) / 8;
//        z = (y * 33) / 100;
//
//        double d = 0;
//        File temp = new File(
//                "C:\\Users\\Nurs\\Desktop\\Any\\Any\\file2.txt");
//        BufferedReader br
//                = new BufferedReader(new FileReader(temp));
//        String st, mean = "";
//        while ((st = br.readLine()) != null)
//            mean = st;
//        Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(mean);
//        while (m.find()) {
//            d = Double.parseDouble(m.group(1));
//        }
//        System.out.println(d + z);
//        if (d + z > 50) {
//            checker = false;
//            AddingQuestions addingQuestions = new AddingQuestions();
//            addingQues.save(addingQuestions);
//            return "redirect:/authPage";
//        } else {
//            checker = true;
//            return "redirect:/reg";
//        }
//    }
//
//}
