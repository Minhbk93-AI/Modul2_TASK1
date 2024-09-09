package business.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private int addressId;
    private int userId;
    private String fullAddress;
    private String phone;
    private String receiveName;

    public Address() {
    }

    public Address(int addressId, int userId, String fullAddress, String phone, String receive) {
        this.addressId = addressId;
        this.userId = userId;
        this.fullAddress = fullAddress;
        this.phone = phone;
        this.receiveName = receive;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReceive() {
        return receiveName;
    }

    public void setReceive(String receive) {
        this.receiveName = receive;
    }
}
