package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bbw  reason: case insensitive filesystem */
public final class C23143Bbw extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public long A01;
    public long A02 = -1;
    public long A03 = 0;
    public long A04 = 0;
    public Uri A05;
    public ParcelFileDescriptor A06;
    public ParcelFileDescriptor A07;
    public C23181Bcb A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C = false;
    public byte[] A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23143Bbw) {
                C23143Bbw bbw = (C23143Bbw) obj;
                if (C25332Cdd.A00(Long.valueOf(this.A01), bbw.A01)) {
                    if (!DJ0.A0H(bbw.A00, Integer.valueOf(this.A00)) || !Arrays.equals(this.A0D, bbw.A0D) || !C25332Cdd.A01(this.A06, bbw.A06) || !C25332Cdd.A01(this.A09, bbw.A09) || !C25332Cdd.A00(Long.valueOf(this.A02), bbw.A02) || !C25332Cdd.A01(this.A07, bbw.A07) || !C25332Cdd.A01(this.A05, bbw.A05) || !C25332Cdd.A00(Long.valueOf(this.A03), bbw.A03) || !DJ0.A0M(Boolean.valueOf(this.A0C), bbw.A0C) || !C25332Cdd.A01(this.A08, bbw.A08) || !C25332Cdd.A00(Long.valueOf(this.A04), bbw.A04) || !C25332Cdd.A01(this.A0A, bbw.A0A) || !C25332Cdd.A01(this.A0B, bbw.A0B)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[14];
        C17890vO.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass3Ma.A1S(objArr, Arrays.hashCode(this.A0D));
        objArr[3] = this.A06;
        objArr[4] = this.A09;
        C17890vO.A1Q(objArr, this.A02);
        objArr[6] = this.A07;
        objArr[7] = this.A05;
        objArr[8] = Long.valueOf(this.A03);
        objArr[9] = Boolean.valueOf(this.A0C);
        objArr[10] = this.A08;
        objArr[11] = Long.valueOf(this.A04);
        objArr[12] = this.A0A;
        return AnonymousClass000.A0P(this.A0B, objArr, 13);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A07(parcel, 1, this.A01);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A0D(parcel, this.A0D, 3, false);
        C26293Cx2.A09(parcel, this.A06, 4, i, false);
        C26293Cx2.A0A(parcel, this.A09, 5, false);
        C26293Cx2.A07(parcel, 6, this.A02);
        C26293Cx2.A09(parcel, this.A07, 7, i, false);
        C26293Cx2.A09(parcel, this.A05, 8, i, false);
        C26293Cx2.A07(parcel, 9, this.A03);
        C26293Cx2.A08(parcel, 10, this.A0C);
        C26293Cx2.A09(parcel, this.A08, 11, i, false);
        C26293Cx2.A07(parcel, 12, this.A04);
        C26293Cx2.A0A(parcel, this.A0A, 13, false);
        C26293Cx2.A0A(parcel, this.A0B, 14, false);
        C26293Cx2.A05(parcel, A002);
    }
}
