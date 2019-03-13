package com.example.resolvertest;

import android.os.Parcel;
import android.os.Parcelable;

public class AParcelable implements Parcelable {
  public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
    public AParcelable createFromParcel(Parcel in) {
      return new AParcelable(in);
    }

    public AParcelable[] newArray(int size) {
      return new AParcelable[size];
    }
  };

  private final String aString;
  private final int anInt;

  public AParcelable(String aString, int anInt) {
    this.aString = aString;
    this.anInt = anInt;
  }

  public AParcelable(Parcel in) {
    this.aString = in.readString();
    this.anInt = in.readInt();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(aString);
    dest.writeInt(anInt);
  }

  @Override
  public String toString() {
    return "AParcelable{" +
        "aString='" + aString + '\'' +
        ", anInt=" + anInt +
        '}';
  }
}
