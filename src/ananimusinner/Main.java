package ananimusinner;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        MonitoringSystem generalIndocatorMonitoringModule = new MonitoringSystem(){

            @Override
            public void startmonitoting() {
                out.println("Мониторинг общих показателей стартовал!");
            }
        };

        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startmonitoting() {
                out.println("Мониторинг отслеживания ошибок стартовал!");

            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startmonitoting() {
                out.println("Мониторинг безопастности стартовал!");

            }
        };

        generalIndocatorMonitoringModule.startmonitoting();
        errorMonitoringModule.startmonitoting();
        securityModule.startmonitoting();



       }

        /*
        * new <Имени НЕТ> <родительский класс/реализуемый интерфейс>(параметры конструктора родителя){
        * };
        */




    }

