package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Bcw  reason: case insensitive filesystem */
public final class C23202Bcw extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public long A03 = 0;
    public Bc7 A04;
    public boolean A05 = false;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = true;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = true;
    @Deprecated
    public boolean A0F = true;
    @Deprecated
    public boolean A0G = false;
    public boolean A0H = true;
    public boolean A0I = true;
    public byte[] A0J;
    public byte[] A0K;
    public int[] A0L;
    public int[] A0M;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23202Bcw) {
                C23202Bcw bcw = (C23202Bcw) obj;
                if (DJ0.A0M(Boolean.valueOf(this.A05), bcw.A05) && DJ0.A0M(Boolean.valueOf(this.A06), bcw.A06) && DJ0.A0M(Boolean.valueOf(this.A07), bcw.A07) && DJ0.A0M(Boolean.valueOf(this.A08), bcw.A08) && DJ0.A0M(Boolean.valueOf(this.A09), bcw.A09) && DJ0.A0M(Boolean.valueOf(this.A0A), bcw.A0A) && DJ0.A0M(Boolean.valueOf(this.A0B), bcw.A0B) && DJ0.A0M(Boolean.valueOf(this.A0C), bcw.A0C) && Arrays.equals(this.A0J, bcw.A0J) && DJ0.A0M(Boolean.valueOf(this.A0D), bcw.A0D) && DJ0.A0M(Boolean.valueOf(this.A0E), bcw.A0E) && DJ0.A0M(Boolean.valueOf(this.A0F), bcw.A0F)) {
                    if (DJ0.A0H(bcw.A00, Integer.valueOf(this.A00))) {
                        if (DJ0.A0H(bcw.A01, Integer.valueOf(this.A01)) && Arrays.equals(this.A0L, bcw.A0L) && Arrays.equals(this.A0M, bcw.A0M) && Arrays.equals(this.A0K, bcw.A0K) && C25332Cdd.A01(this.A04, bcw.A04)) {
                            if (!DJ0.A0H(bcw.A02, Integer.valueOf(this.A02)) || !C25332Cdd.A00(Long.valueOf(this.A03), bcw.A03) || !DJ0.A0M(Boolean.valueOf(this.A0G), bcw.A0G) || !DJ0.A0M(Boolean.valueOf(this.A0H), bcw.A0H) || !DJ0.A0M(Boolean.valueOf(this.A0I), bcw.A0I)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C23202Bcw bcw, Object obj, Object[] objArr) {
        objArr[8] = obj;
        objArr[9] = Boolean.valueOf(bcw.A0D);
        objArr[10] = Boolean.valueOf(bcw.A0E);
        objArr[11] = Boolean.valueOf(bcw.A0F);
    }

    public static void A01(C23202Bcw bcw, Object[] objArr) {
        objArr[5] = Boolean.valueOf(bcw.A0A);
        objArr[6] = Boolean.valueOf(bcw.A0B);
        objArr[7] = Boolean.valueOf(bcw.A0C);
    }

    public int hashCode() {
        Object[] objArr = new Object[23];
        AnonymousClass000.A1N(objArr, this.A05);
        BE8.A1O(objArr, this.A06);
        AnonymousClass8BU.A1Q(objArr, this.A07);
        BE8.A1P(objArr, this.A08);
        BE8.A1Q(objArr, this.A09);
        A01(this, objArr);
        A00(this, BE8.A0a(this.A0J), objArr);
        BE8.A1L(objArr, this.A00);
        objArr[13] = Integer.valueOf(this.A01);
        objArr[14] = Integer.valueOf(Arrays.hashCode(this.A0L));
        objArr[15] = Integer.valueOf(Arrays.hashCode(this.A0M));
        objArr[16] = BE8.A0a(this.A0K);
        objArr[17] = this.A04;
        objArr[18] = Integer.valueOf(this.A02);
        objArr[19] = Long.valueOf(this.A03);
        objArr[20] = Boolean.valueOf(this.A0G);
        objArr[21] = Boolean.valueOf(this.A0H);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A0I), objArr, 22);
    }

    public String toString() {
        String A002;
        Locale locale = Locale.US;
        Object[] objArr = new Object[16];
        AnonymousClass000.A1N(objArr, this.A05);
        BE8.A1O(objArr, this.A06);
        AnonymousClass8BU.A1Q(objArr, this.A07);
        BE8.A1P(objArr, this.A08);
        BE8.A1Q(objArr, this.A09);
        A01(this, objArr);
        byte[] bArr = this.A0J;
        String str = null;
        if (bArr == null) {
            A002 = null;
        } else {
            A002 = C25408CfA.A00(bArr);
        }
        A00(this, A002, objArr);
        byte[] bArr2 = this.A0K;
        if (bArr2 != null) {
            str = C25408CfA.A00(bArr2);
        }
        objArr[12] = str;
        objArr[13] = this.A04;
        objArr[14] = Integer.valueOf(this.A02);
        objArr[15] = Long.valueOf(this.A03);
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s,deviceInfo: %s,strategy: %s,connectionType: %dflowId: %d, }", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A05);
        C26293Cx2.A08(parcel, 2, this.A06);
        C26293Cx2.A08(parcel, 3, this.A07);
        C26293Cx2.A08(parcel, 4, this.A08);
        C26293Cx2.A08(parcel, 5, this.A09);
        C26293Cx2.A08(parcel, 6, this.A0A);
        C26293Cx2.A08(parcel, 7, this.A0B);
        C26293Cx2.A08(parcel, 8, this.A0C);
        C26293Cx2.A0D(parcel, this.A0J, 9, false);
        C26293Cx2.A08(parcel, 10, this.A0D);
        C26293Cx2.A08(parcel, 11, this.A0E);
        C26293Cx2.A08(parcel, 12, this.A0F);
        C26293Cx2.A06(parcel, 13, this.A00);
        C26293Cx2.A06(parcel, 14, this.A01);
        C26293Cx2.A0E(parcel, this.A0L, 15);
        C26293Cx2.A0E(parcel, this.A0M, 16);
        C26293Cx2.A0D(parcel, this.A0K, 17, false);
        C26293Cx2.A09(parcel, this.A04, 18, i, false);
        C26293Cx2.A06(parcel, 19, this.A02);
        C26293Cx2.A07(parcel, 20, this.A03);
        C26293Cx2.A08(parcel, 21, this.A0G);
        C26293Cx2.A08(parcel, 22, this.A0H);
        C26293Cx2.A08(parcel, 23, this.A0I);
        C26293Cx2.A05(parcel, A002);
    }
}
