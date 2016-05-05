package id.web.faerul.learnmockito;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

//    @Test
//    public void list_isCorrect() throws Exception {
//        // mock creation
//        List mockedList = mock(List.class);
//
//        // using mock object - it does not throw any "unexpected interaction" exception
//        mockedList.add("one");
//        mockedList.clear();
//
//        // selective, explicit, highly readable verification
//        verify(mockedList).add("one");
//        verify(mockedList).clear();
//    }

//    @Test
//    public void checkMahasiswaNama_isNotNull() throws Exception {
//
//        Mahasiwa mockedMahasiswa = mock(Mahasiwa.class);
//
//        when(mockedMahasiswa.getNama()).thenReturn("faerul salamun");
//
//        assertNotNull("Seharusnya tidak null", mockedMahasiswa.getNama());
//    }

//    @Test
//    public void checkMahasiswaNama_isNull() throws Exception {
//
//        Mahasiwa mockedMahasiswa = mock(Mahasiwa.class);
//
//        assertNull("Seharusnya null", mockedMahasiswa.getNama());
//
//        assert
//    }

//    @Test
//    public void checkMahasiswaUmur_isCorrect() throws Exception {
//
//        Mahasiwa mockedMahasiswa = mock(Mahasiwa.class);
//
//        int tahunSekarang = 2016;
//
//        when(mockedMahasiswa.getTahunLahir()).thenReturn(1990);
//
//        int umur = tahunSekarang - mockedMahasiswa.getTahunLahir();
//
//        assertEquals("Umur", 26, umur);
//    }


    @Test
    public void checkMahasiswa_isObjectNotEquals() throws Exception {

        Mahasiwa mockedMahasiswa = mock(Mahasiwa.class);
        Mahasiwa mockedMahasiswaClone = mock(Mahasiwa.class);

        assertNotSame(mockedMahasiswa,mockedMahasiswaClone);
    }


}