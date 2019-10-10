package jp.co.a7.trip.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
