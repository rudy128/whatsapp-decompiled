package com.google.android.gms.wearable;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3Ma;
import X.BE6;
import X.BE8;
import X.BE9;
import X.BEA;
import X.C17890vO;
import X.C17900vP;
import X.C25332Cdd;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class ConnectionConfiguration extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public volatile String A08;
    public volatile boolean A09;

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        AnonymousClass3Ma.A1S(objArr, this.A03);
        C17890vO.A1G(objArr, this.A04);
        BE8.A1Q(objArr, this.A07);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A02), objArr, 5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            if (C25332Cdd.A01(this.A05, connectionConfiguration.A05) && C25332Cdd.A01(this.A06, connectionConfiguration.A06)) {
                if (DJ0.A0H(connectionConfiguration.A03, Integer.valueOf(this.A03))) {
                    if (!DJ0.A0H(connectionConfiguration.A04, Integer.valueOf(this.A04)) || !DJ0.A0M(Boolean.valueOf(this.A07), connectionConfiguration.A07) || !DJ0.A0M(Boolean.valueOf(this.A02), connectionConfiguration.A02)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder A0u = BE6.A0u("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.A05);
        A0u.append(BE9.A0o("Name=", valueOf, valueOf.length()));
        String valueOf2 = String.valueOf(this.A06);
        A0u.append(BE9.A0o(", Address=", valueOf2, valueOf2.length()));
        A0u.append(AnonymousClass001.A1I(", Type=", BE6.A0t(18), this.A03));
        A0u.append(AnonymousClass001.A1I(", Role=", BE6.A0t(18), this.A04));
        A0u.append(C17900vP.A0D(", Enabled=", BE6.A0t(15), this.A07));
        A0u.append(C17900vP.A0D(", IsConnected=", BE6.A0t(19), this.A09));
        String valueOf3 = String.valueOf(this.A08);
        A0u.append(BE9.A0o(", PeerNodeId=", valueOf3, valueOf3.length()));
        A0u.append(C17900vP.A0D(", BtlePriority=", BE6.A0t(20), this.A02));
        String valueOf4 = String.valueOf(this.A00);
        A0u.append(BE9.A0o(", NodeId=", valueOf4, valueOf4.length()));
        String valueOf5 = String.valueOf(this.A01);
        return BEA.A0m(BE9.A0o(", PackageName=", valueOf5, valueOf5.length()), A0u);
    }

    public ConnectionConfiguration(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = i;
        this.A04 = i2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = str3;
        this.A02 = z3;
        this.A00 = str4;
        this.A01 = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A05);
        C26293Cx2.A0A(parcel, this.A06, 3, A0L);
        C26293Cx2.A06(parcel, 4, this.A03);
        C26293Cx2.A06(parcel, 5, this.A04);
        C26293Cx2.A08(parcel, 6, this.A07);
        C26293Cx2.A08(parcel, 7, this.A09);
        C26293Cx2.A0A(parcel, this.A08, 8, A0L);
        C26293Cx2.A08(parcel, 9, this.A02);
        C26293Cx2.A0A(parcel, this.A00, 10, A0L);
        C26293Cx2.A0A(parcel, this.A01, 11, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
