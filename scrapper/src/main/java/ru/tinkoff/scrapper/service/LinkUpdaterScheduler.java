package ru.tinkoff.scrapper.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableScheduling
public class LinkUpdaterScheduler {

    @Scheduled(fixedDelayString = "#{@interval}")
    public  void update(){
        log.info("I did updating link");
    }
}
