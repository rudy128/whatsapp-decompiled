package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEc  reason: case insensitive filesystem */
public final class C20269AEc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(7);
    public final double A00;
    public final double A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20269AEc)) {
            return false;
        }
        C20269AEc aEc = (C20269AEc) obj;
        return Math.abs(this.A00 - aEc.A00) < 0.002d && Math.abs(this.A01 - aEc.A01) < 2.0E-4d;
    }

    public int hashCode() {
        return (int) ((((17.0d * 31.0d) + this.A00) * 31.0d) + this.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public C20269AEc(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append("{latitude=");
        A10.append(this.A00);
        A10.append(", longitude=");
        A10.append(this.A01);
        return AnonymousClass000.A0y("}", A10);
    }

    public C20269AEc(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }
}
