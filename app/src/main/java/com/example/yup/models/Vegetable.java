package com.example.yup.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Vegetable implements Parcelable {
    private final String name;
    private final double price;
    private int quantity;

    public Vegetable(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    protected Vegetable(Parcel in) {
        name = in.readString();
        price = in.readDouble();
        quantity = in.readInt();
    }

    public static final Creator<Vegetable> CREATOR = new Creator<Vegetable>() {
        @Override
        public Vegetable createFromParcel(Parcel in) {
            return new Vegetable(in);
        }

        @Override
        public Vegetable[] newArray(int size) {
            return new Vegetable[size];
        }
    };

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeDouble(price);
        parcel.writeDouble(quantity);
    }
}
