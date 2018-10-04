package divers;

import org.junit.Test;

import static divers.Exemples.unBooleenAvecMajuscule;
import static divers.Exemples.unBooleenSansMajuscule;
import static org.junit.Assert.*;

public class TestsBooleens {

    @Test
    public void unBooleenAvecMajusculeTest(){
        Boolean resultat = unBooleenAvecMajuscule();
        assertNull("une variable de type Boolean peut être null", resultat);
    }

    @Test
    public void unBooleenSansMajusculeTest(){
        boolean resultat= unBooleenSansMajuscule();
        assertNull("une variable de type boolean ne peut pas être null ", resultat);
    }
}
