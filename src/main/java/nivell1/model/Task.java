package nivell1.model;

import nivell1.enums.Level;

import java.util.Scanner;

public class Task {
    private String taskName;
    private Level taskLevel;

    public Task(String taskName, Level taskLevel) {
        this.taskLevel = taskLevel;
        this.taskName = taskName;
    }

    public void taskStatus(){
        if(taskLevel == Level.HIGH){
            System.out.println("Task "+ taskName+ " is level "+ taskLevel.getColorLevel());
        }else if(taskLevel == Level.MEDIUM){
            System.out.println("Task " + taskName + " is level " + taskLevel.getColorLevel());
        }else{
            System.out.println("Task " + taskName + " is level " + taskLevel.getColorLevel());
        }
    }

    public void strToEnum(){
        Scanner sc = new Scanner(System.in);
        String lvlUser;

        System.out.println("Please enter your task level: LOW, MEDIUM, or HIGH");
        lvlUser = sc.nextLine();

        try{
            Level lvl = Level.valueOf(lvlUser.toUpperCase());
            System.out.println("You chosen level " + lvl);
        } catch(IllegalArgumentException e){
            System.out.println("Invalid Input " +  e.getMessage());
        }
    }
}
