package com.github.rsoi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class MainService {
    private final ViolationSevice violationSevice;
    private final PeronService personSevice;
    private final TravelService travelService;
    private final SearchService searchService;

    public void runMainProgram() {

        violationSevice.generateViolations();
        travelService.generateTravel();

        //количество поездок (за последние N месяцев
        System.out.print("Введите количество поездок за последние N месяцев\n");
        Scanner experienceTime = new Scanner(System.in);
        int experienceTimes = experienceTime.nextInt();
        Scanner MonthOfExperience = new Scanner(System.in);
        int monthOfExperiences = MonthOfExperience.nextInt();
        searchService.getPersonTravelCount(personSevice.getListOfPersons(), experienceTimes, monthOfExperiences);


        //количество нарушений (с определённой даты)
        System.out.print("Введите количество нарушений (с определённой даты)\n");
        Scanner violationTime = new Scanner(System.in);
        int violationTimes = violationTime.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Date, look for 07/06/2013");
        String dateInString = scanner.next();
        searchService.getPersonViolations(personSevice.getListOfPersons(),violationTimes,dateInString);


        // общая сумма потраченных средств.
        System.out.print("Введите общюю сумму потраченных средств.\n");
        Scanner general_cost = new Scanner(System.in);
        int general_costs = general_cost.nextInt();
        searchService.getPersonSpeandMoney(personSevice.getListOfPersons(),general_costs);


        // стаж
        System.out.print("Введите стаж.\n");
        Scanner experience = new Scanner(System.in);
        int experiences = experience.nextInt();



    }

}
