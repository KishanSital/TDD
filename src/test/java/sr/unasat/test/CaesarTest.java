package sr.unasat.test;

import org.junit.jupiter.api.Test;
import sr.unasat.caesar.Caesar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarTest {

    @Test
    public void encryptedOneCharacter(){
        Caesar caesar = new Caesar(1);
        assertEquals("b", caesar.encrypt("a"));
    }

    @Test
    public void encryptedOneCharacterC(){
        Caesar caesar = new Caesar(1);
        assertEquals("d", caesar.encrypt("c"));
    }

    @Test
    public void encryptedOneCharacterA(){
        Caesar caesar = new Caesar(2);
        assertEquals("C", caesar.encrypt("A"));
    }

    @Test
    public void encryptingKishan(){
        Caesar caesar = new Caesar(2);
        assertEquals("mkujcp", caesar.encrypt("kishan"));
    }

    @Test
    public void decryptingKishan(){
        Caesar caesar = new Caesar(2);
        assertEquals("kishan", caesar.decrypt("mkujcp"));
    }

}
