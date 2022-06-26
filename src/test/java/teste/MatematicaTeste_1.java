/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste;

import com.mycompany.exemplo_junit.Matematica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luan
 */
public class MatematicaTeste_1 {
    
    public MatematicaTeste_1() {
    }
    
    @Test
    public void somaTest() {
        Matematica conta = new Matematica();
        
        // casos de teste
        assertEquals(2, conta.soma(1, 1), 0);
        assertEquals(-10, conta.soma(-11,1), 0);
        assertEquals(1.42, conta.soma(3.14f, -1.72f), 0.001);
    }
    
    @Test
    public void subtraiTest(){
        Matematica conta = new Matematica();
        
        // casos de teste
        assertEquals(2, conta.subtrai(4,2), 0);
        assertEquals(-22, conta.subtrai(-44,-22), 0);
        assertEquals(5.25, conta.soma(10.00f, -4.75f), 0.001);
    }
    
    @Test
    public void multiplicaTest() {
        Matematica conta = new Matematica();
        
        // casos de teste
        assertEquals(22, conta.multiplica(11, 2), 0);
        assertEquals(-56, conta.multiplica(-8, 7), 0);
        assertEquals(23.375, conta.multiplica(5.50f, 4.25f), 0.001);       
    }
    
    @Test
    public void divideTest() {
        Matematica conta = new Matematica();
        
        // casos de teste
        assertEquals(5, conta.divide(25, 5), 0);
        assertEquals(-15, conta.divide(-75, 5), 0);
        assertEquals(28.55, conta.divide(142.75f, 5), 0.001);
        assertEquals(0, conta.divide(1000, 0), 0);
        assertEquals(33.333, conta.divide(150, 4.5f), 0.001);       
    }
}

