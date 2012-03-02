package mk.jug.jobs.server.dao.impl;

import javax.annotation.Resource;

import org.junit.Test;

import mk.jug.jobs.ApplicationContextAwareTest;
import mk.jug.jobs.server.dao.DummyDAO;
import mk.jug.jobs.server.entity.DummyEntity;

import static org.junit.Assert.assertEquals;

/**
 * 
 */
public class SimpleIntegrationTest extends ApplicationContextAwareTest {

    @Resource
    private DummyDAO dummyDAO;

    /**
     * Tries to store {@link mk.jug.jobs.server.entity.DummyEntity}.
     */
    @Test
    public void testPersistTestEntity() {
        int countBefore = dummyDAO.findAll().size();
        DummyEntity dummyEntity = new DummyEntity();
        dummyDAO.makePersistent(dummyEntity);

        int countAfter = dummyDAO.findAll().size();
        assertEquals(countBefore + 1, countAfter);
    }
}
