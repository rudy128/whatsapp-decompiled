package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Bbt  reason: case insensitive filesystem */
public final class C23140Bbt extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23139Bbs A01;
    public final C23125Bbe A02;
    public final C23130Bbj A03;
    public final C23111BbQ A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (obj instanceof C23140Bbt) {
            C23140Bbt bbt = (C23140Bbt) obj;
            if (!C25332Cdd.A01(this.A04, bbt.A04) || !C25332Cdd.A01(this.A01, bbt.A01) || !C25332Cdd.A01(this.A03, bbt.A03) || !C25332Cdd.A01(this.A02, bbt.A02) || !C25332Cdd.A01(this.A05, bbt.A05) || this.A06 != bbt.A06 || this.A00 != bbt.A00 || this.A07 != bbt.A07) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A04, 8);
        A1b[1] = this.A01;
        A1b[2] = this.A03;
        A1b[3] = this.A02;
        A1b[4] = this.A05;
        A1b[5] = Boolean.valueOf(this.A06);
        C17890vO.A1H(A1b, this.A00);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A07), A1b, 7);
    }

    public C23140Bbt(C23139Bbs bbs, C23125Bbe bbe, C23130Bbj bbj, C23111BbQ bbQ, String str, int i, boolean z, boolean z2) {
        C18210vx.A00(bbQ);
        this.A04 = bbQ;
        C18210vx.A00(bbs);
        this.A01 = bbs;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        this.A03 = bbj == null ? new C23130Bbj((byte[]) null, (String) null, false) : bbj;
        this.A02 = bbe == null ? new C23125Bbe(false, (String) null) : bbe;
        this.A07 = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0I = DJ0.A0I(parcel, this.A04, i);
        C26293Cx2.A09(parcel, this.A01, 2, i, A0I);
        C26293Cx2.A0A(parcel, this.A05, 3, A0I);
        C26293Cx2.A08(parcel, 4, this.A06);
        C26293Cx2.A06(parcel, 5, this.A00);
        C26293Cx2.A09(parcel, this.A03, 6, i, A0I);
        C26293Cx2.A09(parcel, this.A02, 7, i, A0I);
        C26293Cx2.A08(parcel, 8, this.A07);
        C26293Cx2.A05(parcel, A002);
    }
}
