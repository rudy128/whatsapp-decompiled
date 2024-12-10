package com.google.android.gms.auth;

import X.AnonymousClass000;
import X.AnonymousClass8BU;
import X.BE8;
import X.C18210vx;
import X.C25332Cdd;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

public class TokenData extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final Long A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        AnonymousClass8BU.A1Q(objArr, this.A05);
        BE8.A1P(objArr, this.A06);
        objArr[4] = this.A04;
        return AnonymousClass000.A0P(this.A03, objArr, 5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (!TextUtils.equals(this.A01, tokenData.A01) || !C25332Cdd.A01(this.A02, tokenData.A02) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !C25332Cdd.A01(this.A04, tokenData.A04) || !C25332Cdd.A01(this.A03, tokenData.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        C18210vx.A03(str);
        this.A01 = str;
        this.A02 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        boolean A0L = DJ0.A0L(parcel, this.A01);
        Long l = this.A02;
        if (l != null) {
            parcel.writeInt(524291);
            parcel.writeLong(l.longValue());
        }
        C26293Cx2.A08(parcel, 4, this.A05);
        C26293Cx2.A08(parcel, 5, this.A06);
        C26293Cx2.A0B(parcel, this.A04, 6);
        C26293Cx2.A0A(parcel, this.A03, 7, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
