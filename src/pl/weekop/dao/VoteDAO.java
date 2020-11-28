package pl.weekop.dao;

import pl.weekop.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long> {

    public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);
}