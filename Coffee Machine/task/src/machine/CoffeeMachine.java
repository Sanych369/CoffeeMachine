package machine;

import machine.coffee.Cappuccino;
import machine.coffee.CoffeeCup;
import machine.coffee.Espresso;
import machine.coffee.Latte;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        while (true) {
            String action = scanner.next().toLowerCase(Locale.ROOT);
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeChoice = scanner.next();
                    buyCoffee(coffeeChoice, machine);
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int beans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    int cups = scanner.nextInt();
                    fill(machine, water, milk, beans, cups);
                    break;
                case "take":
                    take(machine);
                    break;
                case "remaining":
                    System.out.println(machine);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please, enter valid command!");
                    break;
            }
        }
    }

    private static void buyCoffee(String choice, Machine machine) {
        switch (choice) {
            case "1":
                Espresso espresso = new Espresso();
                if (checkResources(machine, espresso)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    buy(machine, espresso);
                } else {
                    printError(machine, espresso);
                }
                break;
            case "2":
                Latte latte = new Latte();
                if (checkResources(machine, latte)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    buy(machine, latte);
                } else {
                    printError(machine, latte);
                }
                break;
            case "3":
                Cappuccino cappuccino = new Cappuccino();
                if (checkResources(machine, cappuccino)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    buy(machine, cappuccino);
                } else {
                    printError(machine, cappuccino);
                }
                break;
            case "back":
                break;
            default:
                break;
        }
    }

    private static void fill(Machine machine, int water, int milk, int beans, int cups) {
        if (water > 0) {
            machine.setWater(machine.getWater() + water);
        }
        if (milk > 0) {
            machine.setMilk(machine.getMilk() + milk);
        }
        if (beans > 0) {
            machine.setBeans(machine.getBeans() + beans);
        }
        if (cups > 0) {
            machine.setCups(machine.getCups() + cups);
        }
    }

    private static void take(Machine machine) {
        System.out.println("I gave you $" + machine.getMoney());
        machine.setMoney(0);
    }

    private static void buy(Machine machine, CoffeeCup coffee) {
        machine.setWater(machine.getWater() - coffee.getWater());
        machine.setMilk(machine.getMilk() - coffee.getMilk());
        machine.setBeans(machine.getBeans() - coffee.getBeans());
        machine.setMoney(machine.getMoney() + coffee.getCost());
        machine.setCups(machine.getCups() - 1);
    }

    private static boolean checkResources(Machine machine, CoffeeCup coffeeCup) {
        return machine.getWater() >= coffeeCup.getWater() && machine.getCups() >= 1
                && machine.getMilk() >= coffeeCup.getMilk() && machine.getBeans() >= coffeeCup.getBeans();
    }

    private static void printError(Machine machine, CoffeeCup coffeeCup) {
        if (machine.getWater() < coffeeCup.getWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (machine.getMilk() < coffeeCup.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (machine.getBeans() < coffeeCup.getBeans()) {
            System.out.println("Sorry, not enough beans!");
        } else if (machine.getCups() < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }
}
