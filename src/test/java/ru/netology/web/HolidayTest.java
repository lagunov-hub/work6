package ru.netology.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.services.HolidaysService;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HolidayTest {
    private HolidaysService holidaysService;

    @BeforeAll
    static void setUpAll() {


    }

    @BeforeEach
    void setUp() {
       holidaysService = new HolidaysService();
    }



    @AfterEach
    void tearDown() {
       holidaysService = null;
    }

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000",
            "12000,3500,25000"
    })
    void holidayTest(int income, int expenses, int treshold) {
       int countHolidays = holidaysService.calculate(income, expenses, treshold);
       assertEquals(3, countHolidays);
    }


    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    void holidayTestCsv(int income, int expenses, int treshold) {
        int countHolidays = holidaysService.calculate(income, expenses, treshold);
        assertEquals(3, countHolidays);
    }


}

