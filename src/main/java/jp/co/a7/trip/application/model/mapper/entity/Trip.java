package jp.co.a7.trip.application.model.mapper.entity;

import java.util.Date;

public class Trip {

    private String uuid;
    private String startdate;
    private String enddate;
    private String costmoney;
    private String placename;
    private String hotel;
    private String menber;
    private String createdUserId;
    private Date createdDatetime;
    private String updatedUserId;
    private Date updatedDatetime;
    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }
    /**
     * @param uuid セットする uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return startdate
     */
    public String getStartdate() {
        return startdate;
    }
    /**
     * @param startdate セットする startdate
     */
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
    /**
     * @return enddate
     */
    public String getEnddate() {
        return enddate;
    }
    /**
     * @param enddate セットする enddate
     */
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
    /**
     * @return costmoney
     */
    public String getCostmoney() {
        return costmoney;
    }
    /**
     * @param costmoney セットする costmoney
     */
    public void setCostmoney(String costmoney) {
        this.costmoney = costmoney;
    }
    /**
     * @return placename
     */
    public String getPlacename() {
        return placename;
    }
    /**
     * @param placename セットする placename
     */
    public void setPlacename(String placename) {
        this.placename = placename;
    }
    /**
     * @return hotel
     */
    public String getHotel() {
        return hotel;
    }
    /**
     * @param hotel セットする hotel
     */
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    /**
     * @return menber
     */
    public String getMenber() {
        return menber;
    }
    /**
     * @param menber セットする menber
     */
    public void setMenber(String menber) {
        this.menber = menber;
    }
    public String getCreatedUserId() {
        return createdUserId;
    }
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }
    public Date getCreatedDatetime() {
        return createdDatetime;
    }
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
    public String getUpdatedUserId() {
        return updatedUserId;
    }
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
    public Date getUpdatedDatetime() {
        return updatedDatetime;
    }
    public void setUpdatedDatetime(Date updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

}
