package jp.co.a7.trip.application.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.a7.trip.application.model.mapper.entity.Trip;

@Mapper
public interface TripMapper {

    @Select("SELECT * FROM trip_detail")
    public List<Trip> getTripList();

}
