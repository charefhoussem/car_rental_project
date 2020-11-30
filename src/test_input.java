
import java.sql.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class test_input 
{
  
     public int password_verification (String a, String b){
     int verif=0;
     if(a.equals(b)){
         verif=1;
     }
     else {JOptionPane.showMessageDialog(null, "passwords do not match, please reenter them !");}
     return verif;
     }
     
     
     public int id_length_test(String a, int b){
     int test=0;
     if(a.length()==(b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "the id shoul"
              + "d contain "+b+" characters");}
     return test;
     }
     
     public int name_length_test(String a, int b){
     int test=0;
     if(a.length()>=(b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "the name should contain  at least "+b+" characters");}
     return test;
     }
     public int address_length_test(String a, int b){
     int test=0;
     if(a.length()>=(b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "the address should contain at least "+b+" characters");}
     return test;
     }
     
     public int phone_length_test(String a, int b){
     int test=0;
     if(a.length()==(b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "the phone should contain "+b+" characters");}
     return test;
     }
     
     public int password_length_test(String a, int b){
     int test=0;
     if(a.length()>= (b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "your password should contain at least"+b+" characters");}
     return test;
     }
     public int type_length_test(String a, int b){
     int test=0;
     if(a.length()>=(b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "the type of the car should contain at least "+b+" characters");}
     return test;
     }

     public int reference_length_test(String a, int b){
     int test=0;
     if(a.length()>=(b)){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "the reference of the car should contain at least "+b+" characters");}
     return test;
     }
     public int availability_input(String a){
     int test=0;
     if((a.equals("available")) || (a.equals("not available"))){
      test=1;
     }
      else {JOptionPane.showMessageDialog(null, "an error occured, please enter the availability correctly");}
     return test;
     }
     
     
     public int id_integrality_test(String a){
     int test =1;
     for (int i=0; i<a.length(); i++){
      if(a.charAt(i)<'0' || a.charAt(i)>'9')
      {test=0;
      } 
     }
     if (test==0)  {JOptionPane.showMessageDialog(null, "your id should be an integer, please reenter it!");}
     return test;
     }
     

}
    
