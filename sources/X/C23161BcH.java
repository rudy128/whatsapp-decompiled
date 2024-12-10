package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcH  reason: case insensitive filesystem */
public final class C23161BcH extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23161BcH) {
                C23161BcH bcH = (C23161BcH) obj;
                if (DJ0.A0H(bcH.A00, Integer.valueOf(this.A00))) {
                    if (DJ0.A0H(bcH.A01, Integer.valueOf(this.A01))) {
                        if (!DJ0.A0H(bcH.A02, Integer.valueOf(this.A02)) || !DJ0.A0M(Boolean.valueOf(this.A03), bcH.A03)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        boolean z = this.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UwbRangingData{rawDistance=");
        A10.append(i);
        A10.append(", rawAngleOfArrivalAzimuth=");
        A10.append(i2);
        A10.append(", rawAngleOfArrivalPolar=");
        A10.append(i3);
        A10.append(", isValidAngleOfArrivalData=");
        A10.append(z);
        return AnonymousClass000.A0y("}", A10);
    }

    public final int hashCode() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        AnonymousClass000.A1M(A1a, this.A01);
        AnonymousClass3Ma.A1S(A1a, this.A02);
        BE8.A1P(A1a, this.A03);
        return Arrays.hashCode(A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A06(parcel, 3, this.A02);
        C26293Cx2.A08(parcel, 4, this.A03);
        C26293Cx2.A05(parcel, A002);
    }
}
