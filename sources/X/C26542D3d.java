package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3d  reason: case insensitive filesystem */
public final class C26542D3d implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26542D3d) {
                C26542D3d d3d = (C26542D3d) obj;
                if (!(this.A01 == d3d.A01 && this.A00 == d3d.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C26542D3d(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Size(width=");
        A10.append(this.A01);
        A10.append(", height=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
