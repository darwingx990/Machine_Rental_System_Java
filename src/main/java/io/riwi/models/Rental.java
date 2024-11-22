package io.riwi.models;

import java.time.LocalDate;

public class Rental {
    private int id;
    private int clientId;
    private int machineId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status;

    public Rental() {
    }

    public Rental(int id, int clientId, int machineId, LocalDate startDate, LocalDate endDate, boolean status) {
        this.id = id;
        this.clientId = clientId;
        this.machineId = machineId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rental: " +
                "id=" + id +
                ", clientId=" + clientId +
                ", machineId=" + machineId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status;
    }
}

