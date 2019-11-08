package jp.co.a7.trip.application.body.response;

public class SkiParkInfo {

    private String uuid;
    private String skipark_name;
    private String urlLink;
    private String gerendeMapFileName;
    private String gerendeMapFileNameExtension;
    private String gerendeMap;
    private String displayOrder;
    private String createdUserId;
    private String createdDatetime;
    private String updatedUserId;
    private String updatedDatetime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSkipark_name() {
        return skipark_name;
    }

    public void setSkipark_name(String skipark_name) {
        this.skipark_name = skipark_name;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }

    public String getGerendeMapFileName() {
        return gerendeMapFileName;
    }

    public void setGerendeMapFileName(String gerendeMapFileName) {
        this.gerendeMapFileName = gerendeMapFileName;
    }

    public String getGerendeMapFileNameExtension() {
        return gerendeMapFileNameExtension;
    }

    public void setGerendeMapFileNameExtension(String gerendeMapFileNameExtension) {
        this.gerendeMapFileNameExtension = gerendeMapFileNameExtension;
    }

    public String getGerendeMap() {
        return gerendeMap;
    }

    public void setGerendeMap(String gerendeMap) {
        this.gerendeMap = gerendeMap;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public String getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(String updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

}
