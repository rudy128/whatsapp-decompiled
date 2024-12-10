package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADf  reason: case insensitive filesystem */
public final class C20247ADf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20247ADf) {
                C20247ADf aDf = (C20247ADf) obj;
                if (!(this.A00 == aDf.A00 && this.A01 == aDf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C20247ADf(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapViewLayer(layerZoomLevelIndex=");
        A10.append(this.A00);
        A10.append(", regularPinCount=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
