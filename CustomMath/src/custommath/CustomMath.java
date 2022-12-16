/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custommath;

/**
 *
 * @author Student
 */
public class CustomMath {


public static int sum (int x, int y) {
    return x + y; // возвращает результат сложения двух чисел
}
public static int division(int x, int y) {
    if ( y == 0 ) {//если делитель равен нулю
        throw new IllegalArgumentException ("driver is 0");
    } //Бросается исключение
    return x / y; //возвращает результат деления
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try { 
        int z = division (1,0);
        System.out.println ("Test3 failed");
        } catch (IllegalArgumentException e) {
            //тест считается успешным, если при попытке деления на 0 
            //генерируется ожидаемое исключение
            System.out.println("Test3 passed");
        }
    }
}
