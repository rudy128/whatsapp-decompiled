package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.D3u  reason: case insensitive filesystem */
public final class C26554D3u implements Parcelable {
    public static final C26554D3u A03 = new C26554D3u(new D3Z[0]);
    public static final Parcelable.Creator CREATOR = new D36(7);
    public int A00;
    public final int A01;
    public final D3Z[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26554D3u d3u = (C26554D3u) obj;
            if (this.A01 != d3u.A01 || !Arrays.equals(this.A02, d3u.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }

    public C26554D3u(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new D3Z[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = AnonymousClass3Ma.A08(parcel, D3Z.class);
        }
    }

    public C26554D3u(D3Z... d3zArr) {
        this.A02 = d3zArr;
        this.A01 = 0;
    }
}
