package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {

    private PlanejadorDeChurrasco plan;

    @BeforeEach
    public void inicio(){     
    }

    @Test
    public void testaUmAdultoZeroCrianca(){
        PlanejadorDeChurrasco plan = new PlanejadorDeChurrasco();
        plan.setAdulto(1);
        plan.setcrianca(0);
        assertEquals(250f, plan.calculaQtdCarne());

    }

    @Test
    public void testaDoisAdultoUmaCrianca(){
        PlanejadorDeChurrasco plan = new PlanejadorDeChurrasco();
        plan.setAdulto(2);
        plan.setcrianca(1);
        assertEquals(600f, plan.calculaQtdCarne());

    }

    @Test
    public void testaDezAdultoCincoCrianca(){
        PlanejadorDeChurrasco plan = new PlanejadorDeChurrasco();
        plan.setAdulto(10);
        plan.setcrianca(5);
        assertEquals(3000f, plan.calculaQtdCarne());

    }

   
    
}
