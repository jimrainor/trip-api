package jp.co.a7.trip.application.body.response;

public class TripInfo {

    private String uuid;
    private String startDate;
    private String endDate;
    private String costmoney;
    private String placename;
    private String hotel;
    private String menber;
    private String createdUserId;
    private String createdDatetime;
    private String updatedUserId;
    private String updatedDatetime;
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
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
    /**
     * @return createdUserId
     */
    public String getCreatedUserId() {
        return createdUserId;
    }
    /**
     * @param createdUserId セットする createdUserId
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }
    /**
     * @return createdDatetime
     */
    public String getCreatedDatetime() {
        return createdDatetime;
    }
    /**
     * @param createdDatetime セットする createdDatetime
     */
    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
    /**
     * @return updatedUserId
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }
    /**
     * @param updatedUserId セットする updatedUserId
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
    /**
     * @return updatedDatetime
     */
    public String getUpdatedDatetime() {
        return updatedDatetime;
    }
    /**
     * @param updatedDatetime セットする updatedDatetime
     */
    public void setUpdatedDatetime(String updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

}
