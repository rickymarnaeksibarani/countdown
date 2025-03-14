package birthday.example.countdown.core;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class CountdownController {
    @GetMapping("/XMXCH")
//    http://localhost:8080/Praylin-Simarmata/?eventDate=2025-03-10T14:48:00
    public String countdownPage(@RequestParam(
            name = "eventDate", required = false) String eventDate, Model model) {
        LocalDateTime targetDate = eventDate != null ? LocalDateTime.parse(eventDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME) : LocalDateTime.now().plusDays(7);
        model.addAttribute("targetDate", targetDate);
        return "countdown";
    }

//    @GetMapping("/game")
//    public String gamePage() {
//        return "game"; // Mengarah ke game.html di folder templates
//    }
}
