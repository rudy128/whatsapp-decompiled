package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.BcN  reason: case insensitive filesystem */
public final class C23167BcN extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C23145Bby A00;
    public final C23146Bbz A01;
    public final C23148Bc1 A02;
    public final C23151Bc4 A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final boolean A07;
    public final byte[] A08;

    public final boolean equals(Object obj) {
        if (obj instanceof C23167BcN) {
            C23167BcN bcN = (C23167BcN) obj;
            if (!C25332Cdd.A01(this.A02, bcN.A02) || !C25332Cdd.A01(this.A00, bcN.A00) || !Arrays.equals(this.A08, bcN.A08) || this.A07 != bcN.A07 || !C25332Cdd.A01(this.A04, bcN.A04) || !C25332Cdd.A01(this.A05, bcN.A05) || !C25332Cdd.A01(this.A06, bcN.A06) || !C25332Cdd.A01(this.A03, bcN.A03) || !C25332Cdd.A01(this.A01, bcN.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A02, 8);
        A1b[1] = this.A00;
        AnonymousClass8BU.A1Q(A1b, this.A07);
        A1b[3] = this.A04;
        A1b[4] = this.A05;
        A1b[5] = this.A06;
        A1b[6] = this.A03;
        return AnonymousClass000.A0P(this.A01, A1b, 7);
    }

    public final String toString() {
        C23148Bc1 bc1 = this.A02;
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass000.A1b(bc1, 9);
        A1b[1] = this.A00;
        A1b[2] = Arrays.toString(this.A08);
        BE8.A1P(A1b, this.A07);
        A1b[4] = this.A04;
        A1b[5] = this.A05;
        A1b[6] = this.A06;
        A1b[7] = this.A03;
        A1b[8] = this.A01;
        return String.format(locale, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C23148Bc1 bc1 = this.A02;
        int A002 = C26293Cx2.A00(parcel);
        boolean A0I = DJ0.A0I(parcel, bc1, i);
        C26293Cx2.A09(parcel, this.A00, 2, i, A0I);
        C26293Cx2.A0D(parcel, this.A08, 3, A0I);
        C26293Cx2.A08(parcel, 4, this.A07);
        C26293Cx2.A0C(parcel, this.A04, 5, A0I);
        C26293Cx2.A0C(parcel, this.A05, 6, A0I);
        C26293Cx2.A0C(parcel, this.A06, 7, A0I);
        C26293Cx2.A09(parcel, this.A03, 8, i, A0I);
        C26293Cx2.A09(parcel, this.A01, 9, i, A0I);
        C26293Cx2.A05(parcel, A002);
    }

    public C23167BcN(C23145Bby bby, C23146Bbz bbz, C23148Bc1 bc1, C23151Bc4 bc4, List list, List list2, List list3, byte[] bArr, boolean z) {
        this.A02 = bc1;
        this.A00 = bby;
        this.A08 = bArr;
        this.A07 = z;
        this.A04 = list;
        this.A05 = list2;
        this.A06 = list3;
        this.A03 = bc4;
        this.A01 = bbz;
    }
}
