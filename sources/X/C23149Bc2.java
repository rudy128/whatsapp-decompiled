package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bc2  reason: case insensitive filesystem */
public class C23149Bc2 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C23149Bc2) {
                C23149Bc2 bc2 = (C23149Bc2) obj;
                if (bc2.A00 != this.A00 || !C25332Cdd.A01(bc2.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        DJ0.A0G(parcel, this.A01, C26293Cx2.A01(parcel, this.A00));
    }

    public C23149Bc2(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(":");
        return AnonymousClass000.A0y(this.A01, A10);
    }
}
