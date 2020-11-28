package pl.weekop.dao;

import java.util.List;

import pl.weekop.model.Discovery;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long>{

    List<Discovery> getAll();

}