package ananimusinner;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        MonitoringSystem generalIndocatorMonitoringModule = new MonitoringSystem(){

            @Override
            public void startmonitoting() {
                out.println("���������� ����� ����������� ���������!");
            }
        };

        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startmonitoting() {
                out.println("���������� ������������ ������ ���������!");

            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startmonitoting() {
                out.println("���������� ������������� ���������!");

            }
        };

        generalIndocatorMonitoringModule.startmonitoting();
        errorMonitoringModule.startmonitoting();
        securityModule.startmonitoting();



       }

        /*
        * new <����� ���> <������������ �����/����������� ���������>(��������� ������������ ��������){
        * };
        */




    }

