package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String listSkills() {
        String html =
                "<html>" + "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn.  Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" + "</ol>" +
                        "</body>" + "</html>";
        return html;
    }
    @GetMapping("form")
    public String skillsForm() {
        String skills =  "<html>" + "<body>" +
                "<form method='post'>" +
               "<label>Name: </label>" + "<input type = 'text' name='Name'>" + "<br>" +
                "<label>My favorite language: </label>" + "<select name='favoriteLanguage'>" +
                "<option value= 'java'> Java</option>" + "<option value= 'javascript'> JavaScript</option>" +
                "<option value= 'python'> Python</option>" + "</select>" + "<br>" +

                "<label>My 2nd favorite language: " + "<select name='secondFavoriteLanguage'>" +
                "<option value= 'java'> Java</option>" + "<option value= 'javascript'> JavaScript</option>" +
                "<option value= 'python'> Python</option>" + "</label>" + "</select>" + "<br>" +

                "<label>My 3rd favorite language: </label>" + "<select name='thirdFavoriteLanguage'>" +
                "<option value= 'java'> Java</option>" + "<option value= 'javascript'> JavaScript</option>" +
                "<option value= 'python'> Python</option>" + "</select>" + "<br>" +
                "<input type = 'submit'>" + "</form>" +
                "</body>" + "</html>";
        return skills;
    }
    @PostMapping("form")
    public String formReturn(@RequestParam String Name, @RequestParam String favoriteLanguage, @RequestParam String secondFavoriteLanguage, @RequestParam String thirdFavoriteLanguage) {
        String returnForm=
        "<html>" + "<body>" +
                "<h1>"+ Name + "</h1>" +
                "<ol>" +
                "<li>"+ favoriteLanguage +"</li>" +
                "<li>"+ secondFavoriteLanguage +"</li>" +
                "<li>"+ thirdFavoriteLanguage +"</li>" + "</ol>" +
                "</body>" + "</html>";
        return returnForm;

    }

}
