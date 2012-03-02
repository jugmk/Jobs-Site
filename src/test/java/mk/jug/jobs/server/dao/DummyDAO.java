package mk.jug.jobs.server.dao;

import mk.jug.jobs.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link mk.jug.jobs.server.dao.impl.GenericHibernateDAOImpl} methods
 */
public interface DummyDAO extends GenericDAO<DummyEntity, Long> {
}
