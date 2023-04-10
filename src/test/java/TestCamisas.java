/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import junit.framework.TestCase;
import tarea1.camisas;
/**
 *
 * @author Adair
 */
public class TestCamisas extends TestCase {
    private camisas camisas;
    
    public void escenario (){
        camisas = new camisas();
    }
    
    
    public void testAMoneda(){
        escenario();
        assertTrue(camisas.aMoneda(190.0)==("$ 190.0 MXN"));;
    }
    
    public void testCalcularPrecio (){
        double precio = 190.0;
        int cantidad = 3;
        
        assertEquals(570.0, cantidad*precio);
    }
    
}
