package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: X.Bbs  reason: case insensitive filesystem */
public final class C23139Bbs extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1N(objArr, this.A04);
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        BE8.A1P(objArr, this.A05);
        objArr[4] = this.A02;
        objArr[5] = this.A03;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A06), objArr, 6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23139Bbs) {
            C23139Bbs bbs = (C23139Bbs) obj;
            if (this.A04 != bbs.A04 || !C25332Cdd.A01(this.A00, bbs.A00) || !C25332Cdd.A01(this.A01, bbs.A01) || this.A05 != bbs.A05 || !C25332Cdd.A01(this.A02, bbs.A02) || !C25332Cdd.A01(this.A03, bbs.A03) || this.A06 != bbs.A06) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C23139Bbs(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        C18210vx.A07(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
        this.A04 = z;
        if (z) {
            C18210vx.A02(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.A00 = str;
        this.A01 = str2;
        this.A05 = z2;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            arrayList = C17880vN.A10(list);
            Collections.sort(arrayList);
        }
        this.A03 = arrayList;
        this.A02 = str3;
        this.A06 = z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A04);
        boolean A0L = DJ0.A0L(parcel, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 3, A0L);
        C26293Cx2.A08(parcel, 4, this.A05);
        C26293Cx2.A0A(parcel, this.A02, 5, A0L);
        C26293Cx2.A0B(parcel, this.A03, 6);
        C26293Cx2.A08(parcel, 7, this.A06);
        C26293Cx2.A05(parcel, A002);
    }
}
