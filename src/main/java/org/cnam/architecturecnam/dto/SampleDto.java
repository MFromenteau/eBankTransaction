package org.cnam.architecturecnam.dto;

public class SampleDto {

    private long id;
    public String data;

    public SampleDto(long id, String data) {
        this.id = id;
        this.data = data;
    }

    public SampleDto() {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
