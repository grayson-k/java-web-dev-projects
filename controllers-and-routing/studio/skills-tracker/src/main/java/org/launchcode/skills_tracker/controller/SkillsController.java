package org.launchcode.skills_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displaySkills() {
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html></body>";
    }

    @GetMapping("/form")
    public String displayForm() {
        return "<form method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' id='name' name='name'><br>" +
                "<label for='firstChoice'>My favorite language:</label><br>" +
                "<select name='firstChoice' id='firstChoice'>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='JavaScript'>JavaScript</option>" +
                "    <option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='secondChoice'>My second favorite language:</label><br>" +
                "<select name='secondChoice' id='secondChoice'>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='JavaScript'>JavaScript</option>" +
                "    <option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='thirdChoice'>My third favorite language:</label><br>" +
                "<select name='thirdChoice' id='thirdChoice'>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='JavaScript'>JavaScript</option>" +
                "    <option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>";
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String processForm(@RequestParam String name,
                              String firstChoice,
                              String secondChoice,
                              String thirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }
}
