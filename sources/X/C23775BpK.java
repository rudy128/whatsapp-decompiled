package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BpK  reason: case insensitive filesystem */
public final class C23775BpK extends D3D {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23775BpK) && Float.compare(this.A00, ((C23775BpK) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeFloat(this.A00);
    }

    public C23775BpK(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FixedAlpha(alpha=");
        return AnonymousClass001.A1K(A10, this.A00);
    }

    public C23775BpK() {
        this(0.5f);
    }
}
