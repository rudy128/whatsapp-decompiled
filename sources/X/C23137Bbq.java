package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: X.Bbq  reason: case insensitive filesystem */
public class C23137Bbq extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (obj instanceof C23137Bbq) {
            C23137Bbq bbq = (C23137Bbq) obj;
            if (!C25332Cdd.A01(this.A01, bbq.A01) || !C25332Cdd.A01(this.A04, bbq.A04) || !C25332Cdd.A01(this.A02, bbq.A02) || !DJ0.A0M(Boolean.valueOf(this.A05), bbq.A05) || this.A00 != bbq.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A01, 5);
        A1b[1] = this.A02;
        A1b[2] = this.A04;
        BE8.A1P(A1b, this.A05);
        AnonymousClass3Ma.A1T(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }

    public C23137Bbq(String str, String str2, String str3, String str4, int i, boolean z) {
        C18210vx.A00(str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A01);
        C26293Cx2.A0A(parcel, this.A02, 2, A0K);
        C26293Cx2.A0A(parcel, this.A03, 3, A0K);
        C26293Cx2.A0A(parcel, this.A04, 4, A0K);
        C26293Cx2.A08(parcel, 5, this.A05);
        C26293Cx2.A06(parcel, 6, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
