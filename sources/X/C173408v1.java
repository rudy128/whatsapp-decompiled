package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8v1  reason: invalid class name and case insensitive filesystem */
public final class C173408v1 extends C29661cf {
    public static final C173408v1 A00 = new C173408v1();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 6;
    }

    public C173408v1() {
        super("location");
    }

    public String getServer() {
        return "broadcast";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C72473Md.A0w(parcel);
    }
}
