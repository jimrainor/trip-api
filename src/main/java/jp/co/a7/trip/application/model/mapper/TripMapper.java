package jp.co.a7.trip.application.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.a7.trip.application.model.mapper.entity.Trip;

@Mapper
public interface TripMapper {

    @Select("SELECT * FROM trip_detail")
    public List<Trip> getTripList();

    @Update("UPDATE trip_detail set "
            + "startdate  = #{trip.startdate}"
            + ",enddate   = #{trip.enddate}"
            + ",costmoney = #{trip.costmoney}"
            + ",placename = #{trip.placename}"
            + ",hotel     = #{trip.hotel}"
            + ",menber    = #{trip.menber}"
            + ",created_user_id  = #{trip.created_user_id}"
            + ",created_datetime = #{trip.created_datetime}"
            + ",updated_user_id  = #{trip.updated_user_id}"
            + ",updated_datetime = #{trip.updated_datetime}"
            + " where uuid = #{trip.uuid}")
    public int updateTrip(@Param(value = "trip") Trip trip);
}
