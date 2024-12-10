package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D44 implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(24);
    public final float A00;
    public final float A01;
    public final float A02;
    public final C20269AEc A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D44)) {
            return false;
        }
        D44 d44 = (D44) obj;
        if (this.A00 == d44.A00) {
            C20269AEc aEc = this.A03;
            C20269AEc aEc2 = d44.A03;
            if (aEc != null) {
                return aEc.equals(aEc2) && this.A01 == d44.A01 && this.A02 == d44.A02;
            }
            if (aEc2 == null) {
                return true;
            }
        }
    }

    public int hashCode() {
        C20269AEc aEc = this.A03;
        float f = 17.0f;
        if (aEc != null) {
            f = (17.0f * 31.0f) + ((float) aEc.hashCode());
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public D44(C20269AEc aEc, float f, float f2, float f3) {
        this.A03 = aEc;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append("{target=");
        A10.append(this.A03);
        A10.append(", zoom=");
        A10.append(this.A02);
        A10.append(", tilt=");
        A10.append(this.A01);
        A10.append(", bearing=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }

    public D44(Parcel parcel) {
        this.A03 = (C20269AEc) AnonymousClass3Ma.A08(parcel, C20269AEc.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }
}
