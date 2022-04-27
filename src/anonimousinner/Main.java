package anonimousinner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        MonitoringSystem generalIndicatorMonitoringModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал");            }
        };
        MonitoringSystem errorlMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал");
            }
        };

        generalIndicatorMonitoringModule.startMonitoring();
        errorlMonitoringModule.startMonitoring();
        securityModule.startMonitoring();


 /*       String string = new String("Привет!"){
            @Override
            public int length() {
                return super.length() -1;
            }
        };*/

    }

    /*
    * new <ИМЕНИ_НЕТ> <класс родительский/реализуемый интерфейс>(параметры конструктора родителя){
    * };
    *
    *
    * */
}



/*
class GeneralIndicatorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал");
    }
}



class ErrorlMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал");
    }
}

class SecurityModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал");
    }
}*/
