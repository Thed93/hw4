package ru.skypro.hw4;

public class Main {
    static int tusk;
    public static void tuskNumber() {
        tusk++;
        System.out.println("\n" + "Задание № " + tusk);
    }

    public static void main(String[] args) {
        tuskNumber();
        int age = 8;
        if ( age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        } else {
            System.out.println("Поздравляем с совершеннолетием!");
        }
    tuskNumber();

        int age2 = 8;

        if (age2 >=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            if (age2 >=18) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                if (age2 >=7) {
                    System.out.println("Ребенок ходит в школу");
                }
            }
        }
  tuskNumber();
        int totalPlacesInTrain = 102;
        int seatInTrain = 60;
        int standingPlace = totalPlacesInTrain - seatInTrain;
        int occupiedSeat = 60;
        int occupiedStandingPlace = 42;

        if (occupiedSeat + occupiedStandingPlace == totalPlacesInTrain) {
            System.out.println("Свободных мест в поезде нет");
        } else {
            if (seatInTrain > occupiedSeat ) {
                System.out.println("В поезде есть сидячие место(а)");
            }
            if (standingPlace > occupiedStandingPlace) {
                System.out.println("В поезде есть стоячее(ие) место(а)");

            }
        }


    }

    }

