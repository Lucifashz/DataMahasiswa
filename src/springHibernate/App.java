/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate;

import springHibernate.service.MahasiswaService;
import springHibernate.view.MahasiswaView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author achra
 */
public class App {
    private static ApplicationContext applicationContext;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new MahasiswaView().setVisible(true);
    }
    
    public static MahasiswaService getMahasiswaService(){
        return (MahasiswaService) applicationContext.getBean("MahasiswaService");
    }
}
   