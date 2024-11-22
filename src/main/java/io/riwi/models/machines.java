package io.riwi.models;

public class machines {
    private int id;
    private String model;
    private String serialNumber;
    private String status;

    public machines() {
    }

    public machines(int id, String model, String serialNumber, String status) {
        this.id = id;
        this.model = model;
        this.serialNumber = serialNumber;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
