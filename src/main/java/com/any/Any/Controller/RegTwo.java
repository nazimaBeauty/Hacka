package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class RegTwo {

    @RequestMapping(value = {"/regtwo"}, method = RequestMethod.GET)
    public String page() {
        return "Registration2";
    }

    @RequestMapping(value = {"/regtwo"}, method = RequestMethod.POST)
    public String pageP(@RequestParam(defaultValue = "") String hidden) throws IOException {
        if (hidden.equals("regthree")) {
            double d = 0;
            File temp = new File(
                    "C:\\Users\\Nurs\\Desktop\\Any\\Any\\Gender detection\\Gender-Detection\\guru99.txt");
            BufferedReader br
                    = new BufferedReader(new FileReader(temp));
            String st, mean = "";
            while ((st = br.readLine()) != null)
                mean = st;

            Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(mean);
            while (m.find()) {
                d = Double.parseDouble(m.group(1));
            }

            File file = new File("file2.txt");
            PrintWriter writer = new PrintWriter(file);

            String find = "woman:";
            double ansTemp;
            boolean val = mean.contains(find);

            double answer;
            if (val) {
                answer = (67 * d) / 100;
            } else {
                ansTemp = 100 - d;
                answer = (67 * ansTemp) / 100;
            }
            writer.print("");
            writer.print(answer + "");
            writer.close();

            return "redirect:/regthree";
        } else
            return "Registration2";
    }

}
