package pl.lodz.uni.math.kamilmucha;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaoFactoryTest {
    private static DaoFactory daoFactory;

    @Before
    public void setUp() throws Exception {
        daoFactory = new DaoFactory();
    }

    @Test
    public void shouldReturnFactoryDB() {
        daoFactory.setSource(FactorySource.DATABASE);
    }
}