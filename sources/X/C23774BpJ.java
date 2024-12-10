package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BpJ  reason: case insensitive filesystem */
public final class C23774BpJ extends D3D {
    public static final C23774BpJ A00 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof C23774BpJ);
    }

    public int hashCode() {
        return -1522220413;
    }

    public String toString() {
        return "Default";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }
}
