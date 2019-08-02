package com.stackroute.Muzix.repository;

import com.stackroute.Muzix.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository class used to perform database operations, extends JpaRepository
//MongoRepository<EntityClassName,WrapperTypeOfIdPropertyInEntityClass>
@Repository
public interface TrackRepository extends MongoRepository<Track, Integer> {

    //Query to search a track by its name or comments in the database
    //used lower() to make searching case insensitive
    List<Track> findByTrackCommentsContainingIgnoreCaseOrTrackNameContainingIgnoreCase(String comments,String name);
//    @Query("SELECT t FROM Track t WHERE lower(t.trackName) LIKE lower(CONCAT('%',:string,'%')) OR lower(t.trackComments) LIKE lower(CONCAT('%',:string,'%'))")
//    List<Track> findTrackByNameOrComments(String string);
}
