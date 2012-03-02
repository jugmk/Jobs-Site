package mk.jug.jobs.server.dao.impl;

import org.springframework.stereotype.Repository;

import mk.jug.jobs.server.dao.DummyDAO;
import mk.jug.jobs.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link mk.jug.jobs.server.dao.impl.GenericHibernateDAOImpl} methods
 */
@Repository
public class DummyDAOImpl extends GenericHibernateDAOImpl<DummyEntity, Long> implements DummyDAO {
    
}
