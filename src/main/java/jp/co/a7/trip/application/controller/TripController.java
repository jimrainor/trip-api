package jp.co.a7.trip.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.a7.trip.application.body.response.TripInfo;
import jp.co.a7.trip.application.service.TripService;

@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    TripService tripService;

    @RequestMapping(value = "/selectList")
    public List<TripInfo> selectList() {

        return tripService.searchTripList();

    }

}
