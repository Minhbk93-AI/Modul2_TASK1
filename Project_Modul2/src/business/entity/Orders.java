package business.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Orders implements Serializable {
    private int orderId;
    private String serialNumber= UUID.randomUUID().toString();
    private int userId;
    private Double totalPrice;
    private String note;
    private String receive;
    private String receiveName;
    private String receiveAddress;
    private String receivePhone;
    private LocalDate created;
    private LocalDate received;

    public Orders() {
    }

    public Orders(int orderId, String serialNumber, int userId, Double totalPrice, String note, String receive, String receiveName, String receiveAddress, String receivePhone, LocalDate created, LocalDate received) {
        this.orderId = orderId;
        this.serialNumber = serialNumber;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.note = note;
        this.receive = receive;
        this.receiveName = receiveName;
        this.receiveAddress = receiveAddress;
        this.receivePhone = receivePhone;
        this.created = created;
        this.received = received;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getReceived() {
        return received;
    }

    public void setReceived(LocalDate received) {
        this.received = received;
    }
}
