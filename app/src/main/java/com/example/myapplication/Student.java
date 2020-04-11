package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

     private String id ;
    private String name ;
    private String last;
    private String address;
    private String email;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student(String id, String name, String last, String address, String email, String status) {
        this.id = id;
        this.name = name;
        this.last = last;
        this.address = address;
        this.email = email;
        this.status = status;
    }

    protected Student(Parcel in) {
        id = in.readString();
        name = in.readString();
        last = in.readString();
        address = in.readString();
        email = in.readString();
        status = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(last);
        dest.writeString(address);
        dest.writeString(email);
        dest.writeString(status);
    }
}
