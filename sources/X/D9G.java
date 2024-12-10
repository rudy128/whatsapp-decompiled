package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D9G implements ECQ {
    public static final Parcelable.Creator CREATOR = D3B.A00(20);
    public final float A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D9G d9g = (D9G) obj;
            if (!(this.A00 == d9g.A00 && this.A01 == d9g.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(Float.valueOf(this.A00), 527) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public D9G(int i, float f) {
        this.A00 = f;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("smta: captureFrameRate=");
        A10.append(this.A00);
        A10.append(", svcTemporalLayerCount=");
        return C17880vN.A0t(A10, this.A01);
    }

    public D9G(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}
