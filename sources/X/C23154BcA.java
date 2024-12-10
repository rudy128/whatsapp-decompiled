package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcA  reason: case insensitive filesystem */
public final class C23154BcA extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public byte[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23154BcA) {
                C23154BcA bcA = (C23154BcA) obj;
                if (Arrays.equals(this.A02, bcA.A02)) {
                    if (DJ0.A0H(bcA.A00, Integer.valueOf(this.A00))) {
                        if (DJ0.A0H(bcA.A01, Integer.valueOf(this.A01))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.A02);
        int i = this.A00;
        int i2 = this.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UwbSenderInfo{address=");
        A10.append(arrays);
        A10.append(", channel=");
        A10.append(i);
        A10.append(", preambleIndex=");
        A10.append(i2);
        return AnonymousClass000.A0y("}", A10);
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, Arrays.hashCode(this.A02));
        AnonymousClass000.A1M(A1a, this.A00);
        AnonymousClass3Ma.A1S(A1a, this.A01);
        return Arrays.hashCode(A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A02, 1, false);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A06(parcel, 3, this.A01);
        C26293Cx2.A05(parcel, A002);
    }
}
