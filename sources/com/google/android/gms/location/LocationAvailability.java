package com.google.android.gms.location;

import X.AnonymousClass000;
import X.AnonymousClass3Ma;
import X.BE6;
import X.C17890vO;
import X.C23160BcG;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationAvailability extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    @Deprecated
    public int A00;
    @Deprecated
    public int A01;
    public int A02;
    public long A03;
    public C23160BcG[] A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A02);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass3Ma.A1S(objArr, this.A01);
        C17890vO.A1O(objArr, this.A03);
        return AnonymousClass000.A0P(this.A04, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.A00 == locationAvailability.A00 && this.A01 == locationAvailability.A01 && this.A03 == locationAvailability.A03 && this.A02 == locationAvailability.A02 && Arrays.equals(this.A04, locationAvailability.A04)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        boolean A1U = AnonymousClass000.A1U(this.A02, 1000);
        StringBuilder A0t = BE6.A0t(48);
        A0t.append("LocationAvailability[isLocationAvailable: ");
        A0t.append(A1U);
        return AnonymousClass000.A0z(A0t);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A07(parcel, 3, this.A03);
        C26293Cx2.A06(parcel, 4, this.A02);
        C26293Cx2.A0F(parcel, this.A04, 5, i);
        C26293Cx2.A05(parcel, A002);
    }
}
