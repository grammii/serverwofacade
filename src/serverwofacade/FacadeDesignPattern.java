/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

public class FacadeDesignPattern {
    public void start(){
        ScheduleServer obj1 = new ScheduleServer();
        obj1.startBooting();
        obj1.readSystemConfigFile();
        obj1.init();
        obj1.initializeContext();
        obj1.initializeListeners();
        obj1.createSystemObjects();
        System.out.println("Start working......");
    }
    
    public void stop(){
        ScheduleServer obj2 = new ScheduleServer();
        System.out.println("After work done.........");
        obj2.releaseProcesses();
	obj2.destory();
	obj2.destroySystemObjects();
	obj2.destoryListeners();
	obj2.destoryContext();
	obj2.shutdown();
    }
}
