package jp.co.a7.trip.application.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import jp.co.a7.trip.application.body.response.TripInfo;
import jp.co.a7.trip.application.model.mapper.TripMapper;
import jp.co.a7.trip.application.model.mapper.entity.Trip;

@Service
public class TripService {

    @Autowired
    private TripMapper tripMapper;

    public List<TripInfo> searchTripList() {

        List<Trip> tripList = new ArrayList<>();
        List<TripInfo> tripListReturn = new ArrayList<>();

        tripList = tripMapper.getTripList();

        for (Trip trip : tripList) {
            TripInfo target = new TripInfo();
            BeanUtils.copyProperties(trip, target);
            tripListReturn.add(target);
        }

        return tripListReturn;
    }

    public int updateTrip(TripInfo tripInfo) {
        Trip trip = new Trip();
        BeanUtils.copyProperties(tripInfo, trip);

        int res = -1;
        Date curTime = new Date();
        if (StringUtils.isEmpty(trip.getUuid())) {

            trip.setUuid(UUID.randomUUID().toString().replace("-", ""));
            trip.setCreatedUserId("TESTUSER1001");
            trip.setCreatedDatetime(curTime);
            trip.setUpdatedUserId("TESTUSER1001");
            trip.setUpdatedDatetime(curTime);
             res = tripMapper.insertTrip(trip);
        }else {
             res = tripMapper.updateTrip(trip);
             trip.setUpdatedUserId("TESTUSER1001");
             trip.setUpdatedDatetime(curTime);
        }
        return res;
    }

}
