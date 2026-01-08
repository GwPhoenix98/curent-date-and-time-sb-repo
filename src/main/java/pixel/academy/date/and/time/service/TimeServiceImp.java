package pixel.academy.date.and.time.service;

import java.time.LocalDateTime;

public class TimeServiceImp implements TimeService {


    @Override
    public LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }
}
