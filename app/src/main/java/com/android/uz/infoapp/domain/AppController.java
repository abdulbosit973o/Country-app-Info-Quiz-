package com.android.uz.infoapp.domain;

import com.android.uz.infoapp.data.model.Country;
import com.android.uz.infoapp.data.model.QuestionData;
import com.android.uz.infoapp.data.model.SelectedCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppController {
    private static AppController appController;
    private SelectedCategory category;
    private List<QuestionData> questions = new ArrayList<>();
    ArrayList<Country> countryList = new ArrayList<>();
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
    private void sortCountriesAlphabetically() {
        Collections.sort(countryList, new Comparator<Country>() {
            @Override
            public int compare(Country country1, Country country2) {
                return country1.getName().compareTo(country2.getName());
            }
        });
    }
    public List<Country> getCountries() {
        loadInformation(); // Agar malumotlar yuklanmagan bo'lsa yuklash
        sortCountriesAlphabetically(); // Alifbo bo'yicha tartiblash
        return countryList;
    }

    private void loadQuestionsToSelectedCategory() {
       clearList();
        switch (category) {
            case CAPITAL:{
                questions.add(new QuestionData("Ottawa is the capital of ...", "Mexico", "Canada", "USA", "Somalia", "Canada"));
                questions.add(new QuestionData("Tokyo is the capital of ...", "China", "South Korea", "Japan", "Thailand", "Japan"));
                questions.add(new QuestionData("Berlin is the capital of ...", "Germany", "France", "Italy", "Spain", "Germany"));
                questions.add(new QuestionData("Cairo is the capital of ...", "Egypt", "Sudan", "Algeria", "Libya", "Egypt"));
                questions.add(new QuestionData("Brasília is the capital of ...", "Brazil", "Argentina", "Colombia", "Venezuela", "Brazil"));
                questions.add(new QuestionData("Moscow is the capital of ...", "Russia", "China", "India", "Kazakhstan", "Russia"));
                questions.add(new QuestionData("Canberra is the capital of ...", "Australia", "New Zealand", "Fiji", "Papua New Guinea", "Australia"));
                questions.add(new QuestionData("Paris is the capital of ...", "Germany", "France", "Spain", "Italy", "France"));
                questions.add(new QuestionData("Nairobi is the capital of ...", "Nigeria", "Kenya", "South Africa", "Ghana", "Kenya"));
                questions.add(new QuestionData("Buenos Aires is the capital of ...", "Argentina", "Chile", "Peru", "Uruguay", "Argentina"));
                questions.add(new QuestionData("Ankara is the capital of ...", "Turkey", "Iran", "Iraq", "Syria", "Turkey"));
                questions.add(new QuestionData("Rome is the capital of ...", "Spain", "France", "Italy", "Portugal", "Italy"));
                questions.add(new QuestionData("Bangkok is the capital of ...", "Vietnam", "Thailand", "Malaysia", "Indonesia", "Thailand"));
                questions.add(new QuestionData("Lisbon is the capital of ...", "Portugal", "Spain", "Italy", "Greece", "Portugal"));
                questions.add(new QuestionData("Beijing is the capital of ...", "Japan", "South Korea", "China", "Mongolia", "China"));
                questions.add(new QuestionData("Hanoi is the capital of ...", "Vietnam", "Cambodia", "Laos", "Myanmar", "Vietnam"));
                questions.add(new QuestionData("Madrid is the capital of ...", "Germany", "France", "Italy", "Spain", "Spain"));
                questions.add(new QuestionData("Vienna is the capital of ...", "Austria", "Switzerland", "Hungary", "Czech Republic", "Austria"));
                questions.add(new QuestionData("Amsterdam is the capital of ...", "Netherlands", "Belgium", "Luxembourg", "Denmark", "Netherlands"));
                questions.add(new QuestionData("New Delhi is the capital of ...", "India", "Pakistan", "Bangladesh", "Sri Lanka", "India"));
                questions.add(new QuestionData("Lima is the capital of ...", "Peru", "Chile", "Ecuador", "Bolivia", "Peru"));
                questions.add(new QuestionData("Oslo is the capital of ...", "Norway", "Sweden", "Finland", "Denmark", "Norway"));
                questions.add(new QuestionData("Warsaw is the capital of ...", "Poland", "Czech Republic", "Hungary", "Slovakia", "Poland"));
                questions.add(new QuestionData("Copenhagen is the capital of ...", "Norway", "Sweden", "Finland", "Denmark", "Denmark"));
                questions.add(new QuestionData("Stockholm is the capital of ...", "Norway", "Sweden", "Finland", "Denmark", "Sweden"));
                questions.add(new QuestionData("Bogotá is the capital of ...", "Colombia", "Venezuela", "Ecuador", "Peru", "Colombia"));
                questions.add(new QuestionData("Manila is the capital of ...", "Philippines", "Indonesia", "Malaysia", "Thailand", "Philippines"));
                questions.add(new QuestionData("Caracas is the capital of ...", "Colombia", "Venezuela", "Ecuador", "Peru", "Venezuela"));
                questions.add(new QuestionData("Tehran is the capital of ...", "Iraq", "Iran", "Afghanistan", "Pakistan", "Iran"));
                questions.add(new QuestionData("Dublin is the capital of ...", "Ireland", "Scotland", "Wales", "England", "Ireland"));
                questions.add(new QuestionData("Vienna is the capital of ...", "Austria", "Switzerland", "Hungary", "Czech Republic", "Austria"));
                questions.add(new QuestionData("Athens is the capital of ...", "Greece", "Italy", "Spain", "Portugal", "Greece"));
                questions.add(new QuestionData("Havana is the capital of ...", "Cuba", "Dominican Republic", "Puerto Rico", "Jamaica", "Cuba"));
                questions.add(new QuestionData("Kiev is the capital of ...", "Ukraine", "Belarus", "Lithuania", "Latvia", "Ukraine"));
                questions.add(new QuestionData("Tunis is the capital of ...", "Morocco", "Algeria", "Tunisia", "Libya", "Tunisia"));
                questions.add(new QuestionData("Santiago is the capital of ...", "Argentina", "Chile", "Peru", "Uruguay", "Chile"));
                questions.add(new QuestionData("Kuala Lumpur is the capital of ...", "Malaysia", "Indonesia", "Thailand", "Vietnam", "Malaysia"));
                questions.add(new QuestionData("Nairobi is the capital of ...", "Nigeria", "Kenya", "South Africa", "Ghana", "Kenya"));
                questions.add(new QuestionData("Mexico City is the capital of ...", "Mexico", "Brazil", "Argentina", "Colombia", "Mexico"));
                questions.add(new QuestionData("Osaka is the capital of ...", "China", "South Korea", "Japan", "Thailand", "Japan"));
                questions.add(new QuestionData("Lisbon is the capital of ...", "Portugal", "Spain", "Italy", "Greece", "Portugal"));
                questions.add(new QuestionData("Budapest is the capital of ...", "Austria", "Switzerland", "Hungary", "Czech Republic", "Hungary"));
                questions.add(new QuestionData("Amman is the capital of ...", "Jordan", "Iraq", "Syria", "Lebanon", "Jordan"));
                questions.add(new QuestionData("Cape Town is the legislative capital of ...", "South Africa", "Kenya", "Nigeria", "Ghana", "South Africa"));
                questions.add(new QuestionData("Wellington is the capital of ...", "Australia", "New Zealand", "Fiji", "Papua New Guinea", "New Zealand"));
                questions.add(new QuestionData("Brussels is the capital of ...", "Netherlands", "Belgium", "Luxembourg", "Denmark", "Belgium"));
                questions.add(new QuestionData("Jakarta is the capital of ...", "Vietnam", "Thailand", "Malaysia", "Indonesia", "Indonesia"));
                questions.add(new QuestionData("Ljubljana is the capital of ...", "Slovenia", "Croatia", "Bosnia and Herzegovina", "Serbia", "Slovenia"));
                questions.add(new QuestionData("Accra is the capital of ...", "Nigeria", "Kenya", "South Africa", "Ghana", "Ghana"));
                questions.add(new QuestionData("Baku is the capital of ...", "Armenia", "Azerbaijan", "Georgia", "Turkmenistan", "Azerbaijan"));
                questions.add(new QuestionData("Manama is the capital of ...", "Bahrain", "Qatar", "Kuwait", "Oman", "Bahrain"));
                questions.add(new QuestionData("Belgrade is the capital of ...", "Slovenia", "Croatia", "Bosnia and Herzegovina", "Serbia", "Serbia"));
                questions.add(new QuestionData("Bucharest is the capital of ...", "Romania", "Moldova", "Bulgaria", "Serbia", "Romania"));
                questions.add(new QuestionData("Kigali is the capital of ...", "Nigeria", "Kenya", "South Africa", "Rwanda", "Rwanda"));
                questions.add(new QuestionData("Lima is the capital of ...", "Peru", "Chile", "Ecuador", "Bolivia", "Peru"));
                questions.add(new QuestionData("Lusaka is the capital of ...", "Zimbabwe", "Zambia", "Namibia", "Botswana", "Zambia"));
                questions.add(new QuestionData("Male is the capital of ...", "Maldives", "Seychelles", "Mauritius", "Fiji", "Maldives"));
                questions.add(new QuestionData("Maputo is the capital of ...", "Angola", "Mozambique", "Zimbabwe", "Zambia", "Mozambique"));
                questions.add(new QuestionData("Minsk is the capital of ...", "Ukraine", "Belarus", "Lithuania", "Latvia", "Belarus"));
                questions.add(new QuestionData("Nassau is the capital of ...", "Jamaica", "Bahamas", "Cuba", "Puerto Rico", "Bahamas"));
                questions.add(new QuestionData("Nouakchott is the capital of ...", "Senegal", "Mali", "Mauritania", "Niger", "Mauritania"));
                questions.add(new QuestionData("Port-au-Prince is the capital of ...", "Haiti", "Dominican Republic", "Cuba", "Puerto Rico", "Haiti"));
                questions.add(new QuestionData("Port Moresby is the capital of ...", "Fiji", "Papua New Guinea", "Solomon Islands", "Vanuatu", "Papua New Guinea"));
                questions.add(new QuestionData("Pretoria is the administrative capital of ...", "South Africa", "Kenya", "Nigeria", "Ghana", "South Africa"));
                questions.add(new QuestionData("Quito is the capital of ...", "Ecuador", "Peru", "Colombia", "Bolivia", "Ecuador"));
                questions.add(new QuestionData("Riyadh is the capital of ...", "Oman", "Qatar", "Kuwait", "Saudi Arabia", "Saudi Arabia"));
                questions.add(new QuestionData("Sanaa is the capital of ...", "Yemen", "Oman", "Qatar", "Saudi Arabia", "Yemen"));
                questions.add(new QuestionData("Singapore is the capital of ...", "Indonesia", "Malaysia", "Thailand", "Singapore", "Singapore"));
                questions.add(new QuestionData("Tallinn is the capital of ...", "Lithuania", "Latvia", "Estonia", "Belarus", "Estonia"));
                questions.add(new QuestionData("Tashkent is the capital of ...", "Kazakhstan", "Turkmenistan", "Uzbekistan", "Kyrgyzstan", "Uzbekistan"));
                questions.add(new QuestionData("Tbilisi is the capital of ...", "Armenia", "Azerbaijan", "Georgia", "Turkmenistan", "Georgia"));
                questions.add(new QuestionData("Vientiane is the capital of ...", "Vietnam", "Cambodia", "Laos", "Myanmar", "Laos"));
                questions.add(new QuestionData("Wellington is the capital of ...", "Australia", "New Zealand", "Fiji", "Papua New Guinea", "New Zealand"));
                questions.add(new QuestionData("Windhoek is the capital of ...", "Angola", "Namibia", "Botswana", "Zimbabwe", "Namibia"));
                questions.add(new QuestionData("Yerevan is the capital of ...", "Armenia", "Azerbaijan", "Georgia", "Turkey", "Armenia"));
                questions.add(new QuestionData("Which country's capital is Ottawa?", "Canada", "USA", "Mexico", "France", "Canada"));
                questions.add(new QuestionData("What is the capital of Japan?", "China", "South Korea", "Japan", "Thailand", "Japan"));
                questions.add(new QuestionData("Which country's capital is Berlin?", "Germany", "France", "Italy", "Spain", "Germany"));
                questions.add(new QuestionData("What is the capital of Egypt?", "Egypt", "Sudan", "Algeria", "Libya", "Egypt"));
                questions.add(new QuestionData("Which country's capital is Brasília?", "Brazil", "Argentina", "Colombia", "Venezuela", "Brazil"));
                questions.add(new QuestionData("What is the capital of Russia?", "Russia", "China", "India", "Kazakhstan", "Russia"));
                questions.add(new QuestionData("Which country's capital is Canberra?", "Australia", "New Zealand", "Fiji", "Papua New Guinea", "Australia"));
                questions.add(new QuestionData("What is the capital of France?", "Germany", "France", "Spain", "Italy", "France"));
                questions.add(new QuestionData("Which country's capital is Nairobi?", "Nigeria", "Kenya", "South Africa", "Ghana", "Kenya"));
                questions.add(new QuestionData("What is the capital of Argentina?", "Argentina", "Chile", "Peru", "Uruguay", "Argentina"));
                questions.add(new QuestionData("Which country's capital is Ankara?", "Turkey", "Iran", "Iraq", "Syria", "Turkey"));
                questions.add(new QuestionData("What is the capital of Italy?", "Spain", "France", "Italy", "Portugal", "Italy"));
                questions.add(new QuestionData("Which country's capital is Bangkok?", "Vietnam", "Thailand", "Malaysia", "Indonesia", "Thailand"));
                questions.add(new QuestionData("What is the capital of Portugal?", "Portugal", "Spain", "Italy", "Greece", "Portugal"));
                questions.add(new QuestionData("Which country's capital is Beijing?", "Japan", "South Korea", "China", "Mongolia", "China"));
                questions.add(new QuestionData("What is the capital of Vietnam?", "Vietnam", "Cambodia", "Laos", "Myanmar", "Vietnam"));
                questions.add(new QuestionData("Which country's capital is Madrid?", "Germany", "France", "Italy", "Spain", "Spain"));
                questions.add(new QuestionData("What is the capital of Austria?", "Austria", "Switzerland", "Hungary", "Czech Republic", "Austria"));
                questions.add(new QuestionData("Which country's capital is Amsterdam?", "Netherlands", "Belgium", "Luxembourg", "Denmark", "Netherlands"));
                questions.add(new QuestionData("What is the capital of India?", "India", "Pakistan", "Bangladesh", "Sri Lanka", "India"));
                questions.add(new QuestionData("Which country's capital is Lima?", "Peru", "Chile", "Ecuador", "Bolivia", "Peru"));
                questions.add(new QuestionData("What is the capital of Norway?", "Norway", "Sweden", "Finland", "Denmark", "Norway"));
                questions.add(new QuestionData("Which country's capital is Warsaw?", "Poland", "Czech Republic", "Hungary", "Slovakia", "Poland"));
                questions.add(new QuestionData("What is the capital of Denmark?", "Norway", "Sweden", "Finland", "Denmark", "Denmark"));
                questions.add(new QuestionData("Which country's capital is Stockholm?", "Norway", "Sweden", "Finland", "Denmark", "Sweden"));
                questions.add(new QuestionData("What is the capital of Colombia?", "Colombia", "Venezuela", "Ecuador", "Peru", "Colombia"));
                questions.add(new QuestionData("Which country's capital is Manila?", "Philippines", "Indonesia", "Malaysia", "Thailand", "Philippines"));
                questions.add(new QuestionData("What is the capital of Venezuela?", "Colombia", "Venezuela", "Ecuador", "Peru", "Venezuela"));
                questions.add(new QuestionData("Which country's capital is Tehran?", "Iraq", "Iran", "Afghanistan", "Pakistan", "Iran"));
                questions.add(new QuestionData("What is the capital of Ireland?", "Ireland", "Scotland", "Wales", "England", "Ireland"));

                break;
            }
            case FLAG:{
                questions.add(new QuestionData("Which country's flag is red with a white cross?", "Sweden", "Norway", "Denmark", "Finland", "Denmark"));
                questions.add(new QuestionData("In which country does the flag have a maple leaf?", "United States", "Canada", "Australia", "New Zealand", "Canada"));
                questions.add(new QuestionData("Which country's flag is green, white, and orange?", "Italy", "Ireland", "Hungary", "Mexico", "Ireland"));
                questions.add(new QuestionData("In which country does the flag have a black, red, and yellow horizontal stripe?", "Germany", "Belgium", "France", "Netherlands", "Germany"));
                questions.add(new QuestionData("Which country's flag has a white crescent moon and a star on a green background?", "Pakistan", "Turkey", "Saudi Arabia", "Indonesia", "Pakistan"));
                questions.add(new QuestionData("Which country's flag has a white cross on a blue background?", "Sweden", "Norway", "Denmark", "Finland", "Denmark"));
                questions.add(new QuestionData("In which country does the flag have a red maple leaf?", "United States", "Canada", "Australia", "New Zealand", "Canada"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with stars and stripes?", "Italy", "Ireland", "United Kingdom", "United States", "United States"));
                questions.add(new QuestionData("In which country does the flag have a black, red, and gold horizontal stripe?", "Germany", "Belgium", "France", "Netherlands", "Germany"));
                questions.add(new QuestionData("Which country's flag has a white and red crescent moon and a star on a green background?", "Pakistan", "Turkey", "Saudi Arabia", "Indonesia", "Pakistan"));
                questions.add(new QuestionData("In which country does the flag have a white cross on a red background?", "Norway", "Finland", "Denmark", "Sweden", "Switzerland"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a single white star?", "Australia", "New Zealand", "United States", "United Kingdom", "New Zealand"));
                questions.add(new QuestionData("In which country does the flag have a red field with a yellow star and sickle?", "Russia", "China", "North Korea", "Vietnam", "Vietnam"));
                questions.add(new QuestionData("Which country's flag is green, white, and orange with a harp in the center?", "Ireland", "Italy", "Nigeria", "India", "Ireland"));
                questions.add(new QuestionData("In which country does the flag have a black, yellow, and red horizontal stripe?", "Belgium", "Germany", "France", "Netherlands", "Belgium"));
                questions.add(new QuestionData("Which country's flag has a red field with a white circle and a red rising sun?", "Japan", "South Korea", "China", "Taiwan", "Japan"));
                questions.add(new QuestionData("In which country does the flag have a red field with a white cross?", "Norway", "Sweden", "Finland", "Denmark", "Finland"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a yellow star and crescent?", "Turkey", "Pakistan", "Saudi Arabia", "Indonesia", "Turkey"));
                questions.add(new QuestionData("In which country does the flag have three vertical stripes of black, yellow, and red?", "Belgium", "Germany", "France", "Netherlands", "Germany"));
                questions.add(new QuestionData("Which country's flag has a green, white, and red vertical stripe?", "Italy", "Mexico", "Brazil", "Argentina", "Italy"));
                questions.add(new QuestionData("In which country does the flag have a blue field with a white star and crescent?", "Turkey", "Pakistan", "Saudi Arabia", "Indonesia", "Turkey"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a yellow sun in the center?", "Philippines", "Thailand", "Malaysia", "Vietnam", "Philippines"));
                questions.add(new QuestionData("In which country does the flag have five horizontal stripes of blue, yellow, black, white, and green?", "South Africa", "Brazil", "Mexico", "Nigeria", "South Africa"));
                questions.add(new QuestionData("Which country's flag is green, white, and orange with a blue Ashoka Chakra?", "India", "Ireland", "Nigeria", "Italy", "India"));
                questions.add(new QuestionData("In which country does the flag have a red field with a yellow star?", "China", "Vietnam", "North Korea", "Laos", "Vietnam"));
                questions.add(new QuestionData("Which country's flag has a white field with a red circle in the center?", "Japan", "South Korea", "China", "Taiwan", "Japan"));
                questions.add(new QuestionData("In which country does the flag have a blue field with a yellow cross?", "Sweden", "Norway", "Denmark", "Finland", "Sweden"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a white star and crescent?", "Turkey", "Pakistan", "Saudi Arabia", "Indonesia", "Turkey"));
                questions.add(new QuestionData("In which country does the flag have a red field with a white cross?", "Norway", "Finland", "Denmark", "Sweden", "Denmark"));
                questions.add(new QuestionData("Which country's flag has horizontal stripes of black, red, and gold?", "Germany", "Belgium", "France", "Netherlands", "Germany"));
                questions.add(new QuestionData("In which country does the flag have a green field with a yellow harp?", "Ireland", "Italy", "Nigeria", "India", "Ireland"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a yellow star and sickle?", "Russia", "China", "North Korea", "Vietnam", "Vietnam"));
                questions.add(new QuestionData("In which country does the flag have horizontal stripes of black, yellow, and red?", "Belgium", "Germany", "France", "Netherlands", "Belgium"));
                questions.add(new QuestionData("Which country's flag is green, white, and red vertical stripes with a coat of arms?", "Italy", "Mexico", "Brazil", "Argentina", "Mexico"));
                questions.add(new QuestionData("In which country does the flag have a red field with a white cross?", "Norway", "Finland", "Denmark", "Sweden", "Finland"));
                questions.add(new QuestionData("Which country's flag is blue, white, and red vertical stripes with a coat of arms?", "France", "United States", "United Kingdom", "Russia", "United States"));
                questions.add(new QuestionData("In which country does the flag have a green field with a white star and crescent?", "Turkey", "Pakistan", "Saudi Arabia", "Indonesia", "Pakistan"));
                questions.add(new QuestionData("Which country's flag has horizontal stripes of black, yellow, and red?", "Germany", "Belgium", "France", "Netherlands", "Germany"));
                questions.add(new QuestionData("In which country does the flag have a blue field with a white cross?", "Sweden", "Norway", "Denmark", "Finland", "Finland"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a white star and crescent?", "Turkey", "Pakistan", "Saudi Arabia", "Indonesia", "Turkey"));
                questions.add(new QuestionData("In which country does the flag have a red field with a white cross?", "Norway", "Finland", "Denmark", "Sweden", "Denmark"));
                questions.add(new QuestionData("Which country's flag has horizontal stripes of black, red, and gold?", "Germany", "Belgium", "France", "Netherlands", "Germany"));
                questions.add(new QuestionData("In which country does the flag have a green field with a yellow harp?", "Ireland", "Italy", "Nigeria", "India", "Ireland"));
                questions.add(new QuestionData("Which country's flag is red, white, and blue with a yellow star and sickle?", "Russia", "China", "North Korea", "Vietnam", "Vietnam"));
                questions.add(new QuestionData("In which country does the flag have horizontal stripes of black, yellow, and red?", "Belgium", "Germany", "France", "Netherlands", "Belgium"));
                questions.add(new QuestionData("Which country's flag is green, white, and red vertical stripes with a coat of arms?", "Italy", "Mexico", "Brazil", "Argentina", "Mexico"));



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
                questions.add(new QuestionData("The country of Senegal is located in which continent?", "Asia", "Europe", "Africa", "Australia", "Africa"));
                questions.add(new QuestionData("What is the capital city of Japan?", "Beijing", "Seoul", "Tokyo", "Bangkok", "Tokyo"));
                questions.add(new QuestionData("Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "Mars"));
                questions.add(new QuestionData("What is the largest mammal in the world?", "Elephant", "Blue Whale", "Giraffe", "Hippopotamus", "Blue Whale"));
                questions.add(new QuestionData("In which year did the Titanic sink?", "1905", "1912", "1920", "1931", "1912"));
                questions.add(new QuestionData("In which continent is Brazil located?", "North America", "South America", "Europe", "Africa", "South America"));
                questions.add(new QuestionData("Which continent is Egypt part of?", "Asia", "Africa", "Europe", "Australia", "Africa"));
                questions.add(new QuestionData("In which region is India located?", "Middle East", "South Asia", "Southeast Asia", "East Asia", "South Asia"));
                questions.add(new QuestionData("To which region does Australia belong?", "Oceania", "Europe", "North America", "South America", "Oceania"));
                questions.add(new QuestionData("Which continent is known as the 'Land Down Under'?", "North America", "Europe", "Africa", "Australia", "Australia"));
                questions.add(new QuestionData("In which region is Mexico located?", "North America", "Central America", "South America", "Caribbean", "North America"));
                questions.add(new QuestionData("Which continent is known as the 'Dark Continent'?", "Asia", "Europe", "Africa", "Australia", "Africa"));
                questions.add(new QuestionData("In which region is Canada located?", "North America", "Central America", "South America", "Caribbean", "North America"));
                questions.add(new QuestionData("To which region does Russia belong?", "Eastern Europe", "Central Asia", "Northern Europe", "Scandinavia", "Eastern Europe"));
                questions.add(new QuestionData("Which continent is the smallest in terms of land area?", "Europe", "Australia", "North America", "Antarctica", "Australia"));
                questions.add(new QuestionData("In which region is Nigeria located?", "West Africa", "East Africa", "Southern Africa", "North Africa", "West Africa"));
                questions.add(new QuestionData("Which continent is famous for the Sahara Desert?", "Asia", "Africa", "South America", "Australia", "Africa"));
                questions.add(new QuestionData("In which region is Argentina located?", "South America", "Central America", "North America", "Caribbean", "South America"));
                questions.add(new QuestionData("To which region does China belong?", "East Asia", "South Asia", "Southeast Asia", "Central Asia", "East Asia"));
                questions.add(new QuestionData("Which continent is the Amazon Rainforest located in?", "South America", "Africa", "North America", "Australia", "South America"));
                questions.add(new QuestionData("In which region is Saudi Arabia located?", "Middle East", "South Asia", "Southeast Asia", "East Asia", "Middle East"));
                questions.add(new QuestionData("Which continent is the Great Barrier Reef located in?", "Asia", "Australia", "North America", "South America", "Australia"));
                questions.add(new QuestionData("In which region is South Korea located?", "East Asia", "Southeast Asia", "South Asia", "Central Asia", "East Asia"));
                questions.add(new QuestionData("To which region does Germany belong?", "Western Europe", "Eastern Europe", "Northern Europe", "Southern Europe", "Western Europe"));
                questions.add(new QuestionData("Which continent is the largest by land area?", "Asia", "Africa", "North America", "Antarctica", "Asia"));
                questions.add(new QuestionData("In which region is South Africa located?", "West Africa", "East Africa", "Southern Africa", "North Africa", "Southern Africa"));
                questions.add(new QuestionData("Which continent is the Colosseum located in?", "Europe", "Asia", "North America", "Australia", "Europe"));
                questions.add(new QuestionData("In which region is Indonesia located?", "Southeast Asia", "East Asia", "South Asia", "Oceania", "Southeast Asia"));
                questions.add(new QuestionData("To which region does Brazil belong?", "South America", "Central America", "North America", "Caribbean", "South America"));
                questions.add(new QuestionData("Which continent is the Gobi Desert located in?", "Asia", "Africa", "North America", "Australia", "Asia"));
                questions.add(new QuestionData("In which region is Iran located?", "Middle East", "South Asia", "Central Asia", "Southeast Asia", "Middle East"));
                questions.add(new QuestionData("Which continent is the Serengeti National Park located in?", "Africa", "South America", "North America", "Australia", "Africa"));
                questions.add(new QuestionData("In which region is Thailand located?", "Southeast Asia", "East Asia", "South Asia", "Central Asia", "Southeast Asia"));
                questions.add(new QuestionData("To which region does France belong?", "Western Europe", "Eastern Europe", "Northern Europe", "Southern Europe", "Western Europe"));
                questions.add(new QuestionData("Which continent is the Andes Mountain Range located in?", "South America", "North America", "Africa", "Europe", "South America"));
                questions.add(new QuestionData("In which region is Nigeria located?", "West Africa", "East Africa", "Southern Africa", "North Africa", "West Africa"));
                questions.add(new QuestionData("To which region does Japan belong?", "East Asia", "Southeast Asia", "South Asia", "Central Asia", "East Asia"));
                questions.add(new QuestionData("Which continent is the Grand Canyon located in?", "North America", "South America", "Africa", "Australia", "North America"));
                questions.add(new QuestionData("In which region is Colombia located?", "South America", "Central America", "North America", "Caribbean", "South America"));
                questions.add(new QuestionData("To which region does Egypt belong?", "Middle East", "South Asia", "Southeast Asia", "North Africa", "North Africa"));
                questions.add(new QuestionData("Which continent is the Mount Everest located in?", "Asia", "Africa", "North America", "Antarctica", "Asia"));
                // my questions
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

    private void loadInformation()  {
        countryList.add(new Country("Uzbekistan", "Tashkent", 448978.0, "Uzbekistani so'm", "Uzbek", "+998",
                "UTC+5", "C, F (220V)", "right", ".uz",""));
        countryList.add(new Country("United States", "Washington, D.C.", 9833517.0, "US Dollar", "English",
                "+1", "UTC-5 to -10", "A, B (120V)", "right", ".us", ""));
        countryList.add(new Country("Russia", "Moscow", 17098242.0, "Russian Ruble", "Russian",
                "+7", "UTC+3 to +12", "C, F (220V)", "right", ".ru",""));
        countryList.add(new Country("China", "Beijing", 9596961.0, "Renminbi", "Mandarin",
                "+86", "UTC+8", "A, C, I (220V)", "right", ".cn",""));
        countryList.add(new Country("India", "New Delhi", 3287263.0, "Indian Rupee", "Hindi, English",
                "+91", "UTC+5:30", "C, D (230V)", "left", ".in", ""));
        countryList.add(new Country("Brazil", "Brasília", 8515767.0, "Brazilian Real", "Portuguese",
                "+55", "UTC-2 to -5", "C, N (127V, 220V)", "right", ".br", ""));
        countryList.add(new Country("Germany", "Berlin", 357022.0, "Euro", "German",
                "+49", "UTC+1 to +2", "C, F (230V)", "right", ".de", ""));
        countryList.add(new Country("Japan", "Tokyo", 377975.0, "Japanese Yen", "Japanese",
                "+81", "UTC+9", "A, B (100V)", "left", ".jp", ""));
        countryList.add(new Country("France", "Paris", 551695.0, "Euro", "French",
                "+33", "UTC+1 to +2", "C, E (230V)", "right", ".fr", ""));
        countryList.add(new Country("Mexico", "Mexico City", 1964375.0, "Mexican Peso", "Spanish",
                "+52", "UTC-6 to -8", "A, B (127V)", "right", ".mx", ""));
        countryList.add(new Country("South Korea", "Seoul", 100210.0, "South Korean Won", "Korean",
                "+82", "UTC+9", "C, F (220V)", "right", ".kr", ""));
        countryList.add(new Country("Australia", "Canberra", 7692024.0, "Australian Dollar", "English",
                "+61", "UTC+8 to +11", "I (230V)", "left", ".au", ""));
        countryList.add(new Country("Canada", "Ottawa", 9976140.0, "Canadian Dollar", "English, French",
                "+1", "UTC-3.5 to -8", "A, B (120V)", "right", ".ca", ""));
        countryList.add(new Country("Argentina", "Buenos Aires", 2780400.0, "Argentine Peso", "Spanish",
                "+54", "UTC-3", "C, I (220V)", "right", ".ar", ""));
        countryList.add(new Country("Nigeria", "Abuja", 923768.0, "Nigerian Naira", "English",
                "+234", "UTC+1", "D, G (230V)", "right", ".ng", ""));
        countryList.add(new Country("Turkey", "Ankara", 783356.0, "Turkish Lira", "Turkish",
                "+90", "UTC+3", "C, F (230V)", "right", ".tr", ""));
        countryList.add(new Country("South Africa", "Pretoria", 1221037.0, "South African Rand", "Zulu, English",
                "+27", "UTC+2", "D, M (230V)", "left", ".za", ""));
        countryList.add(new Country("Saudi Arabia", "Riyadh", 2149690.0, "Saudi Riyal", "Arabic",
                "+966", "UTC+3", "G (230V)", "right", ".sa", ""));
        countryList.add(new Country("Thailand", "Bangkok", 513120.0, "Thai Baht", "Thai",
                "+66", "UTC+7", "A, B, C, O (220V)", "left", ".th", ""));
        countryList.add(new Country("Netherlands", "Amsterdam", 41543.0, "Euro", "Dutch",
                "+31", "UTC+1", "C, F (230V)", "right", ".nl", ""));
        countryList.add(new Country("Indonesia", "Jakarta", 1904569.0, "Indonesian Rupiah", "Indonesian",
                "+62", "UTC+7", "C, F (230V)", "left", ".id", ""));
        countryList.add(new Country("Egypt", "Cairo", 1001449.0, "Egyptian Pound", "Arabic",
                "+20", "UTC+2", "C, F (220V)", "right", ".eg", ""));
        countryList.add(new Country("Iran", "Tehran", 1648195.0, "Iranian Rial", "Persian",
                "+98", "UTC+3:30", "C, F (230V)", "right", ".ir", ""));
        countryList.add(new Country("Poland", "Warsaw", 312696.0, "Polish Złoty", "Polish",
                "+48", "UTC+1 to +2", "C, E (230V)", "right", ".pl", ""));
        countryList.add(new Country("Vietnam", "Hanoi", 331212.0, "Vietnamese đồng", "Vietnamese",
                "+84", "UTC+7", "A, C (220V)", "right", ".vn", ""));
        countryList.add(new Country("Philippines", "Manila", 300000.0, "Philippine Peso", "Filipino",
                "+63", "UTC+8", "A, B (220V)", "right", ".ph", ""));
        countryList.add(new Country("South Sudan", "Juba", 619745.0, "South Sudanese Pound", "English",
                "+211", "UTC+3", "D, G (230V)", "right", ".ss", ""));
        countryList.add(new Country("Greece", "Athens", 131957.0, "Euro", "Greek",
                "+30", "UTC+2", "C, F (230V)", "right", ".gr", ""));
        countryList.add(new Country("Spain", "Madrid", 505992.0, "Euro", "Spanish",
                "+34", "UTC+1 to +2", "C, F (230V)", "right", ".es", ""));
        countryList.add(new Country("Kenya", "Nairobi", 580367.0, "Kenyan Shilling", "Swahili, English",
                "+254", "UTC+3", "G (240V)", "left", ".ke", ""));
        countryList.add(new Country("Colombia", "Bogotá", 1141748.0, "Colombian Peso", "Spanish",
                "+57", "UTC-5", "A, B (110V)", "right", ".co", ""));
        countryList.add(new Country("Afghanistan", "Kabul", 652230.0, "Afghan Afghani", "Pashto, Dari",
                "+93", "UTC+4:30", "C, D (220V)", "right", ".af",""));
        countryList.add(new Country("Armenia", "Yerevan", 29743.0, "Armenian Dram", "Armenian",
                "+374", "UTC+4", "C, F (230V)", "left", ".am",""));
        countryList.add(new Country("Algeria", "Algiers", 2381741.0, "Algerian Dinar", "Arabic, Berber",
                "+213", "UTC+1", "C, F (230V)", "right", ".dz",""));
        countryList.add(new Country("Bahrain", "Manama", 765.0, "Bahraini Dinar", "Arabic",
                "+973", "UTC+3", "G (230V)", "right", ".bh",""));
        countryList.add(new Country("Belarus", "Minsk", 207600.0, "Belarusian Ruble", "Belarusian, Russian",
                "+375", "UTC+3", "C, F (230V)", "right", ".by",""));
        countryList.add(new Country("Bolivia", "Sucre", 1098581.0, "Bolivian Boliviano", "Spanish, Quechua, Aymara",
                "+591", "UTC-4", "A, C (230V)", "right", ".bo",""));
        countryList.add(new Country("Cambodia", "Phnom Penh", 181035.0, "Cambodian Riel", "Khmer",
                "+855", "UTC+7", "A, C, G (230V)", "right", ".kh",""));
        countryList.add(new Country("Cameroon", "Yaoundé", 475442.0, "Central African CFA franc", "French, English",
                "+237", "UTC+1", "C, E (220V)", "right", ".cm",""));
        countryList.add(new Country("Chile", "Santiago", 756102.0, "Chilean Peso", "Spanish",
                "+56", "UTC-3 to -5", "C, L (220V)", "right", ".cl",""));
        countryList.add(new Country("Croatia", "Zagreb", 56594.0, "Croatian Kuna", "Croatian",
                "+385", "UTC+1", "C, F (230V)", "right", ".hr",""));
        countryList.add(new Country("Cuba", "Havana", 110861.0, "Cuban Peso", "Spanish",
                "+53", "UTC-5", "A, B (110V)", "right", ".cu",""));
        countryList.add(new Country("Denmark", "Copenhagen", 43094.0, "Danish Krone", "Danish",
                "+45", "UTC+1 to +2", "C, E, K (230V)", "right", ".dk",""));
        countryList.add(new Country("Dominican Republic", "Santo Domingo", 48671.0, "Dominican Peso", "Spanish",
                "+1-809, +1-829, +1-849", "UTC-4", "A, B (110V)", "right", ".do",""));
        countryList.add(new Country("Ecuador", "Quito", 276841.0, "United States Dollar", "Spanish",
                "+593", "UTC-5", "A, B (120V)", "right", ".ec",""));
        countryList.add(new Country("Egypt", "Cairo", 1001449.0, "Egyptian Pound", "Arabic",
                "+20", "UTC+2", "C, F (220V)", "right", ".eg",""));
        countryList.add(new Country("Estonia", "Tallinn", 45227.0, "Euro", "Estonian",
                "+372", "UTC+2", "C, F (230V)", "right", ".ee",""));
        countryList.add(new Country("Fiji", "Suva", 18274.0, "Fijian Dollar", "English, Fijian, Fiji Hindi",
                "+679", "UTC+12", "I (240V)", "right", ".fj",""));
        countryList.add(new Country("Finland", "Helsinki", 338424.0, "Euro", "Finnish, Swedish",
                "+358", "UTC+2 to +3", "C, F (230V)", "right", ".fi",""));
        countryList.add(new Country("Gabon", "Libreville", 267667.0, "Central African CFA franc", "French",
                "+241", "UTC+1", "C (220V)", "right", ".ga",""));
        countryList.add(new Country("Gambia", "Banjul", 11295.0, "Gambian Dalasi", "English",
                "+220", "UTC+0", "G (230V)", "right", ".gm",""));
        countryList.add(new Country("Guinea", "Conakry", 245857.0, "Guinean Franc", "French",
                "+224", "UTC+0", "C, F, K (220V)", "right", ".gn",""));
        countryList.add(new Country("Hungary", "Budapest", 93028.0, "Hungarian Forint", "Hungarian",
                "+36", "UTC+1 to +2", "C, F (230V)", "right", ".hu",""));
        countryList.add(new Country("Iceland", "Reykjavik", 103000.0, "Icelandic Króna", "Icelandic",
                "+354", "UTC+0", "C, F (230V)", "right", ".is",""));
        countryList.add(new Country("Iraq", "Baghdad", 438317.0, "Iraqi Dinar", "Arabic, Kurdish",
                "+964", "UTC+3", "C, D, G (230V)", "right", ".iq",""));
        countryList.add(new Country("Ireland", "Dublin", 70273.0, "Euro", "Irish",
                "+353", "UTC+0 to +1", "G (230V)", "left", ".ie",""));
        countryList.add(new Country("Italy", "Rome", 301340.0, "Euro", "Italian",
                "+39", "UTC+1 to +2", "C, F (230V)", "right", ".it",""));
        countryList.add(new Country("Jordan", "Amman", 89342.0, "Jordanian Dinar", "Arabic",
                "+962", "UTC+2", "C, D, F, G, J (230V)", "right", ".jo",""));
        countryList.add(new Country("Kazakhstan", "Nur-Sultan", 2724900.0, "Kazakhstani Tenge", "Kazakh, Russian",
                "+7", "UTC+5 to +6", "C, F (220V)", "right", ".kz",""));
        countryList.add(new Country("North Korea", "Pyongyang", 120538.0, "North Korean Won", "Korean",
                "+850", "UTC+9", "C (220V)", "left", ".kp",""));
        countryList.add(new Country("Kuwait", "Kuwait City", 17818.0, "Kuwaiti Dinar", "Arabic",
                "+965", "UTC+3", "G (240V)", "right", ".kw",""));
        countryList.add(new Country("Kyrgyzstan", "Bishkek", 199951.0, "Kyrgyzstani Som", "Kyrgyz, Russian",
                "+996", "UTC+6", "C, F (220V)", "right", ".kg",""));
        countryList.add(new Country("Latvia", "Riga", 64589.0, "Euro", "Latvian",
                "+371", "UTC+2", "C, F (230V)", "right", ".lv",""));
        countryList.add(new Country("Lebanon", "Beirut", 10452.0, "Lebanese Pound", "Arabic",
                "+961", "UTC+2", "C, D, G (230V)", "right", ".lb",""));
        countryList.add(new Country("Liberia", "Monrovia", 111369.0, "Liberian Dollar", "English",
                "+231", "UTC+0", "A, B, F, G (120V, 240V)", "right", ".lr",""));
        countryList.add(new Country("Libya", "Tripoli", 1759540.0, "Libyan Dinar", "Arabic",
                "+218", "UTC+2", "D, L (230V)", "right", ".ly",""));
        countryList.add(new Country("Luxembourg", "Luxembourg City", 2586.0, "Euro", "Luxembourgish, French, German",
                "+352", "UTC+1", "C, F (230V)", "right", ".lu",""));
        countryList.add(new Country("Macedonia", "Skopje", 25713.0, "Macedonian Denar", "Macedonian",
                "+389", "UTC+1", "C, F (230V)", "right", ".mk",""));
        countryList.add(new Country("Madagascar", "Antananarivo", 587041.0, "Malagasy Ariary", "Malagasy, French",
                "+261", "UTC+3", "C, D, E, J, K (220V)", "left", ".mg",""));
        countryList.add(new Country("Malaysia", "Kuala Lumpur", 330803.0, "Malaysian Ringgit", "Malay",
                "+60", "UTC+8", "G, M (230V)", "left", ".my",""));
        countryList.add(new Country("Mali", "Bamako", 1240192.0, "West African CFA franc", "French",
                "+223", "UTC+0", "C, E (220V)", "right", ".ml",""));
        countryList.add(new Country("Malta", "Valletta", 316.0, "Euro", "Maltese, English",
                "+356", "UTC+1", "G (230V)", "right", ".mt",""));
        countryList.add(new Country("Moldova", "Chisinau", 33846.0, "Moldovan Leu", "Moldovan, Romanian, Russian",
                "+373", "UTC+2", "C, F (230V)", "right", ".md",""));
        countryList.add(new Country("Monaco", "Monaco", 2.0, "Euro", "French",
                "+377", "UTC+1", "C, E (230V)", "right", ".mc",""));
        countryList.add(new Country("Mongolia", "Ulaanbaatar", 1564116.0, "Mongolian Tugrik", "Mongolian",
                "+976", "UTC+7 to +8", "C, E (220V)", "right", ".mn",""));
        countryList.add(new Country("Morocco", "Rabat", 446550.0, "Moroccan Dirham", "Arabic, Berber",
                "+212", "UTC+0", "C, E (220V)", "right", ".ma",""));
        countryList.add(new Country("Mozambique", "Maputo", 801590.0, "Mozambican Metical", "Portuguese",
                "+258", "UTC+2", "C, F, M (220V)", "right", ".mz",""));
        countryList.add(new Country("Namibia", "Windhoek", 825418.0, "Namibian Dollar", "English",
                "+264", "UTC+1", "D, M (220V)", "left", ".na",""));
        countryList.add(new Country("Nepal", "Kathmandu", 147516.0, "Nepalese Rupee", "Nepali",
                "+977", "UTC+5:45", "C, D, M (230V)", "left", ".np",""));
        countryList.add(new Country("Niger", "Niamey", 1267000.0, "West African CFA franc", "French",
                "+227", "UTC+1", "C, D, E (220V)", "right", ".ne",""));
        countryList.add(new Country("Nigeria", "Abuja", 923768.0, "Nigerian Naira", "English",
                "+234", "UTC+1", "D, G (230V)", "right", ".ng",""));
        countryList.add(new Country("Norway", "Oslo", 1487290.0, "Norwegian Krone", "Norwegian",
                "+47", "UTC+1 to +2", "C, F (230V)", "right", ".no",""));
        countryList.add(new Country("Oman", "Muscat", 309500.0, "Omani Rial", "Arabic",
                "+968", "UTC+4", "G (240V)", "right", ".om",""));
        countryList.add(new Country("Pakistan", "Islamabad", 881912.0, "Pakistani Rupee", "Urdu, English",
                "+92", "UTC+5", "C, D, M (230V)", "left", ".pk",""));
        countryList.add(new Country("Palestine", "Ramallah", 6020.0, "Israeli New Shekel", "Arabic",
                "+970", "UTC+2", "C, H (230V)", "right", ".ps",""));
        countryList.add(new Country("Panama", "Panama City", 75417.0, "Panamanian Balboa, US Dollar", "Spanish",
                "+507", "UTC-5", "A, B (110V)", "right", ".pa",""));
        countryList.add(new Country("Paraguay", "Asunción", 406752.0, "Paraguayan Guarani", "Spanish, Guaraní",
                "+595", "UTC-4", "C (220V)", "right", ".py",""));
        countryList.add(new Country("Peru", "Lima", 1285216.0, "Peruvian Nuevo Sol", "Spanish",
                "+51", "UTC-5", "A, B, C (220V)", "right", ".pe",""));
        countryList.add(new Country("Qatar", "Doha", 11586.0, "Qatari Riyal", "Arabic",
                "+974", "UTC+3", "D, G (240V)", "right", ".qa",""));
        countryList.add(new Country("Russia", "Moscow", 17098242.0, "Russian Ruble", "Russian",
                "+7", "UTC+2 to +12", "C, F (220V)", "right", ".ru",""));
        countryList.add(new Country("Romania", "Bucharest", 238397.0, "Romanian Leu", "Romanian",
                "+40", "UTC+2 to +3", "C, F (230V)", "right", ".ro",""));
        countryList.add(new Country("Samoa", "Apia", 2831.0, "Samoan Tala", "Samoan, English",
                "+685", "UTC+13", "I (230V)", "right", ".ws",""));
        countryList.add(new Country("San Marino", "San Marino", 61.0, "Euro", "Italian",
                "+378", "UTC+1", "C, F (230V)", "right", ".sm",""));
        countryList.add(new Country("Senegal", "Dakar", 196722.0, "West African CFA franc", "French",
                "+221", "UTC+0", "C, D, E (230V)", "right", ".sn",""));
        countryList.add(new Country("Serbia", "Belgrade", 77474.0, "Serbian Dinar", "Serbian",
                "+381", "UTC+1", "C, F (230V)", "right", ".rs",""));
        countryList.add(new Country("Singapore", "Singapore", 710.0, "Singapore Dollar", "Malay, English, Tamil, Chinese",
                "+65", "UTC+8", "G (230V)", "left", ".sg",""));
        countryList.add(new Country("Slovakia", "Bratislava", 49035.0, "Euro", "Slovak",
                "+421", "UTC+1", "C, E (230V)", "right", ".sk",""));
        countryList.add(new Country("Slovenia", "Ljubljana", 20273.0, "Euro", "Slovenian",
                "+386", "UTC+1", "C, F (230V)", "right", ".si",""));
        countryList.add(new Country("Solomon Islands", "Honiara", 28896.0, "Solomon Islands Dollar", "English",
                "+677", "UTC+11", "I (240V)", "right", ".sb",""));
        countryList.add(new Country("Somalia", "Mogadishu", 637657.0, "Somali Shilling", "Somali, Arabic",
                "+252", "UTC+3", "C, E (220V)", "right", ".so",""));
        countryList.add(new Country("Sweden", "Stockholm", 450295.0, "Swedish Krona", "Swedish",
                "+46", "UTC+1 to +2", "C, F (230V)", "right", ".se",""));
        countryList.add(new Country("Syria", "Damascus", 185180.0, "Syrian Pound", "Arabic",
                "+963", "UTC+2", "C, E (220V)", "right", ".sy",""));
        countryList.add(new Country("Taiwan", "Taipei", 36193.0, "New Taiwan Dollar", "Mandarin",
                "+886", "UTC+8", "A, B (110V)", "left", ".tw",""));
        countryList.add(new Country("Tajikistan", "Dushanbe", 143100.0, "Tajikistani Somoni", "Tajik, Russian",
                "+992", "UTC+5", "C, F (220V)", "right", ".tj",""));
        countryList.add(new Country("Tanzania", "Dodoma", 945087.0, "Tanzanian Shilling", "Swahili, English",
                "+255", "UTC+3", "D, G (230V)", "left", ".tz",""));
        countryList.add(new Country("Thailand", "Bangkok", 513120.0, "Thai Baht", "Thai",
                "+66", "UTC+7", "A, B, C, O (220V)", "left", ".th",""));
        countryList.add(new Country("Tonga", "Nuku'alofa", 747.0, "Tongan Pa'anga", "Tongan, English",
                "+676", "UTC+13", "I (240V)", "right", ".to",""));
        countryList.add(new Country("Tunisia", "Tunis", 163610.0, "Tunisian Dinar", "Arabic",
                "+216", "UTC+1", "C, E (230V)", "right", ".tn",""));
        countryList.add(new Country("Turkmenistan", "Ashgabat", 491210.0, "Turkmenistan Manat", "Turkmen",
                "+993", "UTC+5", "C, F (220V)", "right", ".tm",""));
        countryList.add(new Country("Uganda", "Kampala", 241550.0, "Ugandan Shilling", "English, Swahili",
                "+256", "UTC+3", "G (240V)", "left", ".ug",""));
        countryList.add(new Country("Ukraine", "Kyiv", 603550.0, "Ukrainian Hryvnia", "Ukrainian",
                "+380", "UTC+2 to +3", "C, F (230V)", "right", ".ua",""));
        countryList.add(new Country("United Arab Emirates", "Abu Dhabi", 83600.0, "United Arab Emirates Dirham", "Arabic",
                "+971", "UTC+4", "G (230V)", "right", ".ae",""));
        countryList.add(new Country("Uruguay", "Montevideo", 176215.0, "Uruguayan Peso", "Spanish",
                "+598", "UTC-3", "C, F, I (230V)", "right", ".uy",""));
        countryList.add(new Country("Vatican City", "Vatican City", 0.44, "Euro", "Italian, Latin",
                "+379", "UTC+1", "C, F (230V)", "right", ".va",""));
        countryList.add(new Country("Venezuela", "Caracas", 916445.0, "Venezuelan Bolívar", "Spanish",
                "+58", "UTC-4", "A, B (120V)", "right", ".ve",""));
        countryList.add(new Country("Western Sahara", "El Aaiún", 266000.0, "Moroccan Dirham, Algerian Dinar", "Arabic",
                "+212", "UTC+0", "C, E (220V)", "right", ".eh",""));
        countryList.add(new Country("Yemen", "Sana'a", 527968.0, "Yemeni Rial", "Arabic",
                "+967", "UTC+3", "C, G (230V)", "right", ".ye",""));
        countryList.add(new Country("Zambia", "Lusaka", 752612.0, "Zambian Kwacha", "English",
                "+260", "UTC+2", "C, D, G (230V)", "right", ".zm",""));
        countryList.add(new Country("Zimbabwe", "Harare", 390757.0, "Zimbabwean Dollar", "English, Shona, Sindebele",
                "+263", "UTC+2", "D, G (220V)", "right", ".zw",""));

    }
}
