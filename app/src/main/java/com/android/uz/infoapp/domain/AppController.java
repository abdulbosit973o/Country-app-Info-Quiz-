package com.android.uz.infoapp.domain;

import android.app.AlertDialog;

import com.android.uz.infoapp.data.model.QuestionData;
import com.android.uz.infoapp.data.model.SelectedCategory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AppController {
    private static AppController appController;
    private SelectedCategory category;
    private List<QuestionData> questions = new ArrayList<>();
    private AppController(){}


    public static AppController getInstance() {
        if (appController == null) {
            appController = new AppController();
        }
        return appController;
    }

    public List<QuestionData> getQuestionShuffle() {
        Collections.shuffle(questions);
        return questions.subList(0,10);
    }

    public SelectedCategory getSelectedCategory() {
        return category;
    }

    public void setSelectCategory(SelectedCategory selectedCategory) {
        this.category = selectedCategory;
        loadQuestionsToSelectedCategory();
    }
    private void clearList() {
        questions.clear();
    }

    private void loadQuestionsToSelectedCategory() {
       clearList();
        switch (category) {
            case CAPITAL:{
                questions.add(new QuestionData(
                        "Ottawa is the capital of ...",
                        "Mexico",
                        "Canada",
                        "Usa",
                        "Somali",
                        "Canada"
                ));
                questions.add(new QuestionData(
                        "Madrid is the capital of ...",
                        "Spain",
                        "Bahrain",
                        "Pakistan",
                        "India",
                        "Spain"
                ));
                questions.add(new QuestionData(
                        "Ankara is the capital of ...",
                        "Micronesia",
                        "Costa Rica",
                        "Burundi",
                        "Turkey",
                        "Ankara"
                ));questions.add(new QuestionData(
                        "New Delhi is the capital of ...",
                        "Singapore",
                        "Malta",
                        "Uganda",
                        "India",
                        "India"
                ));questions.add(new QuestionData(
                        "Tashkent is the capital of ...",
                        "Kazakhstan",
                        "Uzbekistan",
                        "Afghanistan",
                        "Uruguay",
                        "Uzbekistan"
                ));questions.add(new QuestionData(
                        "Berlin is the capital of ...",
                        "Angola",
                        "Iraq",
                        "Germany",
                        "Iran",
                        "Germany"
                ));questions.add(new QuestionData(
                        "Tehran is the capital of ...",
                        "Russia",
                        "Ukraine",
                        "Germany",
                        "Iran",
                        "Iran"
                ));questions.add(new QuestionData(
                        "Moscow is the capital of ...",
                        "Russia",
                        "Usa",
                        "Germany",
                        "Moldova",
                        "Russia"
                ));questions.add(new QuestionData(
                        "Gaza is the capital of ...",
                        "Palestine",
                        "BAA",
                        "Egypt",
                        "Ecuador",
                        "Palestine"
                ));
                questions.add(new QuestionData(
                        "Baku is the capital of ...",
                        "Moldova",
                        "Malaysia",
                        "Zambia",
                        "Azerbaijan",
                        "Palestine"
                ));questions.add(new QuestionData(
                        "Canberra is the capital of ...",
                        "Moldova",
                        "Malaysia",
                        "Zambia",
                        "Australia",
                        "Australia"
                ));questions.add(new QuestionData(
                        "Kabul is the capital of ...",
                        "Moldova",
                        "Malaysia",
                        "Afghanistan",
                        "JOrdan",
                        "Afghanistan"
                ));questions.add(new QuestionData(
                        "Buenos Aires is the capital of ...",
                        "Moldova",
                        "Argentina",
                        "Cuba",
                        "Kuwait",
                        "Argentina"
                ));questions.add(new QuestionData(
                        "Vienna is the capital of ...",
                        "Austria",
                        "Bangladesh",
                        "Cuba",
                        "Argentina",
                        "Austria"
                ));questions.add(new QuestionData(
                        "Brussel is the capital of ...",
                        "Austria",
                        "Belgium",
                        "Cuba",
                        "Moldova",
                        "Belgium"
                ));questions.add(new QuestionData(
                        "Cairo is the capital of ...",
                        "Iraq",
                        "Syria",
                        "Egypt",
                        "BAA",
                        "Egypt"
                ));questions.add(new QuestionData(
                        "Beijing is the capital of ...",
                        "Korea",
                        "China",
                        "India",
                        "Yemen",
                        "China"
                ));questions.add(new QuestionData(
                        "Copenhagen is the capital of ...",
                        "Denmark",
                        "China",
                        "Moldova",
                        "Yemen",
                        "Denmark"
                ));questions.add(new QuestionData(
                        "Addis Ababa is the capital of ...",
                        "Denmark",
                        "Japan",
                        "Gambia",
                        "Ethiopia",
                        "Ethiopia"
                ));questions.add(new QuestionData(
                        "Tokyo is the capital of ...",
                        "Italy",
                        "Japan",
                        "Gambia",
                        "Ethiopia",
                        "Japan"
                ));questions.add(new QuestionData(
                        "Rome is the capital of ...",
                        "Italy",
                        "Japan",
                        "Kenya",
                        "Ghana",
                        "Italy"
                ));questions.add(new QuestionData(
                        "Paris is the capital of ...",
                        "Italy",
                        "Japan",
                        "France",
                        "Ghana",
                        "France"
                ));questions.add(new QuestionData(
                        "Athens is the capital of ...",
                        "Greece",
                        "Japan",
                        "France",
                        "Ghana",
                        "Greece"
                ));questions.add(new QuestionData(
                        "Suva is the capital of ...",
                        "Estonia",
                        "Ireland",
                        "Fiji",
                        "Ghana",
                        "Fiji"
                ));questions.add(new QuestionData(
                        "Kuwait City is the capital of ...",
                        "Kuwait",
                        "Kenya",
                        "Jordan",
                        "Algeria",
                        "Kuwait"
                ));questions.add(new QuestionData(
                        "Jakarta is the capital of ...",
                        "Kuwait",
                        "Indonesia",
                        "Iraq",
                        "Algeria",
                        "Indonesia"
                ));questions.add(new QuestionData(
                        "Tallinn is the capital of ...",
                        "Kuwait",
                        "Estonia",
                        "Iraq",
                        "Iran",
                        "Estonia"
                ));questions.add(new QuestionData(
                        "Accra is the capital of ...",
                        "Kuwait",
                        "Ghana",
                        "Iraq",
                        "Moldova",
                        "Ghana"
                ));questions.add(new QuestionData(
                        "Nairobi is the capital of ...",
                        "Kuwait",
                        "Kenya",
                        "Iraq",
                        "Ireland",
                        "Kenya"
                ));questions.add(new QuestionData(
                        "Quito is the capital of ...",
                        "Kuwait",
                        "Gambia",
                        "Ecuador",
                        "Japan",
                        "Ecuador"
                ));questions.add(new QuestionData(
                        "Banjul is the capital of ...",
                        "Kuwait",
                        "Gambia",
                        "Ecuador",
                        "Japan",
                        "Gambia"
                ));questions.add(new QuestionData(
                        "Saint Peter Port is the capital of ...",
                        "Kuwait",
                        "Gambia",
                        "Guernsey",
                        "Japan",
                        "Guernsey"
                ));questions.add(new QuestionData(
                        "Reykjavik is the capital of ...",
                        "Kuwait",
                        "Gambia",
                        "Iceland",
                        "Japan",
                        "Guernsey"
                ));questions.add(new QuestionData(
                        "Amman is the capital of ...",
                        "Kuwait",
                        "Gambia",
                        "Jordan",
                        "Japan",
                        "Jordan"
                ));questions.add(new QuestionData(
                        "Nicosia is the capital of ...",
                        "Kuwait",
                        "Gambia",
                        "Cyprus",
                        "Moldova",
                        "Cyprus"
                ));questions.add(new QuestionData(
                        "Havana is the capital of ...",
                        "Kuwait",
                        "Ghana",
                        "Cyprus",
                        "Cuba",
                        "Cuba"
                ));questions.add(new QuestionData(
                        "Havana is the capital of ...",
                        "Kuwait",
                        "Ghana",
                        "Nigeria",
                        "Uzbekistan",
                        "Nigeria"
                ));questions.add(new QuestionData(
                        "Alovi is the capital of ...",
                        "Kuwait",
                        "Ghana",
                        "Palau",
                        "No correct answers",
                        "No correct answers"
                ));questions.add(new QuestionData(
                        "Tripoli is the capital of ...",
                        "Kuwait",
                        "Indianapolis",
                        "BAA",
                        "No correct answers",
                        "No correct answers"
                ));questions.add(new QuestionData(
                        "Dakar is the capital of ...",
                        "Kuwait",
                        "Ghana",
                        "Senegal",
                        "Somalia",
                        "Senegal"
                ));questions.add(new QuestionData(
                        "Bujumbura is the capital of ...",
                        "Kuwait",
                        "Burundi",
                        "Senegal",
                        "Kazakhstan",
                        "Burundi"
                ));questions.add(new QuestionData(
                        "Niamey is the capital of ...",
                        "Kuwait",
                        "Burundi",
                        "Niger",
                        "Russia",
                        "Niger"
                ));questions.add(new QuestionData(
                        "Rabat is the capital of ...",
                        "Kuwait",
                        "Burundi",
                        "Niger",
                        "Morocco",
                        "Morocco"
                ));questions.add(new QuestionData(
                        "Islamabad is the capital of ...",
                        "Kuwait",
                        "Pakistan",
                        "Niger",
                        "Morocco",
                        "Pakistan"
                ));questions.add(new QuestionData(
                        "Almaty is the capital of ...",
                        "Kuwait",
                        "Kazakhstan",
                        "Niger",
                        "Morocco",
                        "Kazakhstan"
                ));questions.add(new QuestionData(
                        "Dar es Salam is the capital of ...",
                        "Kuwait",
                        "Kazakhstan",
                        "Niger",
                        "Tanzania",
                        "Tanzania"
                ));questions.add(new QuestionData(
                        "Manila is the capital of ...",
                        "Kuwait",
                        "Filipina",
                        "Niger",
                        "Tanzania",
                        "Filipina"
                ));
                break;
            }
            case FLAG:{
                questions.add(new QuestionData("How many stars are there on the flag of Uzbekistan?", "11", "12", "13", "14", "12"));
                questions.add(new QuestionData("How many stars are there on the flag of China?", "2", "3", "4", "5", "5"));
                questions.add(new QuestionData("How many colors are there on the flag of Brazil?", "2", "3", "4", "5", "4"));
                questions.add(new QuestionData("How many colors are there on the flag of Germany?", "2", "3", "4", "5", "3"));
                questions.add(new QuestionData("How many stars are there on the flag of USA?", "49", "50", "51", "52", "50"));
                questions.add(new QuestionData("What colors are in the flag of Belgium??", "Black, Yellow, Pink", "Green, White, Red", "Black, Yellow, Red", "Green, White, Black", "Black, Yellow, Red"));
                questions.add(new QuestionData("How many colors are there on the flag of Russia?", "2", "3", "4", "5", "3"));
                questions.add(new QuestionData("How many colors are there on the flag of Ukraine?", "5", "2", "4", "3", "3"));
                questions.add(new QuestionData("Red, White, Red (Horizontal). Which country's flag is this??", "Nigeria", "Netherlands", "Peru", "Italy", "Peru"));
                questions.add(new QuestionData("Red, White, Dark Blue (Vertical). Which country's flag is this??", "France", "Netherlands", "Peru", "Italy", "Netherlands"));
                questions.add(new QuestionData("Dark Blue, White, Red (Horizontal). Which country's flag is this??", "France", "Netherlands", "Peru", "Italy", "France"));
                break;
            }
            case REGION:{
                questions.add(new QuestionData("The country of Senegal is located in which continent??", "Asia", "Europe", "Africa", "Australia", "Africa"));
                questions.add(new QuestionData("The country of Ecuador is located in which continent?", "South America", "North America", "Africa", "Australia", "South America"));
                questions.add(new QuestionData("The country of Venezuela is located in which continent?", "Asia", "North America", "South America", "Australia", "South America"));
                questions.add(new QuestionData("The country of Chili is located in which continent?", "Europe", "North America", "South America", "Australia", "South America"));
                questions.add(new QuestionData("The country of Peru is located in which continent?", "Europe", "North America", "South America", "Asia", "South America"));
                questions.add(new QuestionData("The country of Thailand is located in which continent?", "Europe", "Australia", "South America", "Asia", "Asia"));
                questions.add(new QuestionData("The country of Mongolia is located in which continent?", "Africa", "Australia", "South America", "Asia", "Asia"));
                questions.add(new QuestionData("The country of Germany is located in which continent?", "Africa", "Australia", "Europe", "Asia", "Europe"));
                questions.add(new QuestionData("The country of Pakistan is located in which continent?", "North America", "Australia", "Europe", "Asia", "Asia"));
                questions.add(new QuestionData("The country of Nepal is located in which continent?", "Europe", "Africa", "Asia", "North America", "Asia"));
                questions.add(new QuestionData("The country of Namibia is located in which continent?", "Australia", "Asia", "Africa", "Europe", "Africa"));
                questions.add(new QuestionData("The country of Morocco is located in which continent?", "Asia", "Europe", "Africa", "North America", "Africa"));
                questions.add(new QuestionData("The country of Mexico is located in which continent?", "Asia", "South America", "Africa", "North America", "North America"));
                break;

            }
        }
    }
}
