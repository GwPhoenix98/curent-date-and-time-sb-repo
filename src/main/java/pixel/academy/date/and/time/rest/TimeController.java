package pixel.academy.date.and.time.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.date.and.time.service.TimeService;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    private final TimeService timeService;

    @Autowired
    public TimeController(@Qualifier("timeService") TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public LocalDateTime getTime() {
        return timeService.getCurrentDateTime();
    }
}
