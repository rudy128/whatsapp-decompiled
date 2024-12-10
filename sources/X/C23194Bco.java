package X;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Bco  reason: case insensitive filesystem */
public final class C23194Bco extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = 0;
    public int A01 = 0;
    public long A02 = 0;
    public ParcelUuid A03;
    public Bc7 A04;
    public boolean A05 = false;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = false;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = false;
    public boolean A0D = true;
    @Deprecated
    public boolean A0E = false;
    public boolean A0F = true;
    public boolean A0G = true;
    public byte[] A0H;
    public int[] A0I;

    public static void A00(C23194Bco bco, Object[] objArr) {
        objArr[5] = bco.A03;
        objArr[6] = Boolean.valueOf(bco.A09);
        objArr[7] = Boolean.valueOf(bco.A0A);
        objArr[8] = Boolean.valueOf(bco.A0B);
        objArr[9] = Boolean.valueOf(bco.A0C);
        objArr[10] = Integer.valueOf(bco.A00);
        objArr[11] = Integer.valueOf(bco.A01);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23194Bco) {
                C23194Bco bco = (C23194Bco) obj;
                if (C25332Cdd.A01(this.A04, bco.A04) && DJ0.A0M(Boolean.valueOf(this.A05), bco.A05) && DJ0.A0M(Boolean.valueOf(this.A06), bco.A06) && DJ0.A0M(Boolean.valueOf(this.A07), bco.A07) && DJ0.A0M(Boolean.valueOf(this.A08), bco.A08) && C25332Cdd.A01(this.A03, bco.A03) && DJ0.A0M(Boolean.valueOf(this.A09), bco.A09) && DJ0.A0M(Boolean.valueOf(this.A0A), bco.A0A) && DJ0.A0M(Boolean.valueOf(this.A0B), bco.A0B) && DJ0.A0M(Boolean.valueOf(this.A0C), bco.A0C)) {
                    if (DJ0.A0H(bco.A00, Integer.valueOf(this.A00))) {
                        if (!DJ0.A0H(bco.A01, Integer.valueOf(this.A01)) || !Arrays.equals(this.A0H, bco.A0H) || !C25332Cdd.A00(Long.valueOf(this.A02), bco.A02) || !Arrays.equals(this.A0I, bco.A0I) || !DJ0.A0M(Boolean.valueOf(this.A0D), bco.A0D) || !DJ0.A0M(Boolean.valueOf(this.A0E), bco.A0E) || !DJ0.A0M(Boolean.valueOf(this.A0F), bco.A0F) || !DJ0.A0M(Boolean.valueOf(this.A0G), bco.A0G)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[19];
        objArr[0] = this.A04;
        BE8.A1O(objArr, this.A05);
        AnonymousClass8BU.A1Q(objArr, this.A06);
        BE8.A1P(objArr, this.A07);
        BE8.A1Q(objArr, this.A08);
        A00(this, objArr);
        BE8.A1L(objArr, Arrays.hashCode(this.A0H));
        objArr[13] = Long.valueOf(this.A02);
        objArr[14] = Integer.valueOf(Arrays.hashCode(this.A0I));
        objArr[15] = Boolean.valueOf(this.A0D);
        objArr[16] = Boolean.valueOf(this.A0E);
        objArr[17] = Boolean.valueOf(this.A0F);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A0G), objArr, 18);
    }

    public String toString() {
        String A002;
        Locale locale = Locale.US;
        Object[] objArr = new Object[15];
        objArr[0] = this.A04;
        BE8.A1O(objArr, this.A05);
        AnonymousClass8BU.A1Q(objArr, this.A06);
        BE8.A1P(objArr, this.A07);
        BE8.A1Q(objArr, this.A08);
        A00(this, objArr);
        byte[] bArr = this.A0H;
        if (bArr == null) {
            A002 = "null";
        } else {
            A002 = C25408CfA.A00(bArr);
        }
        objArr[12] = A002;
        objArr[13] = Long.valueOf(this.A02);
        objArr[14] = Boolean.valueOf(this.A0D);
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d, allowGattConnections: %s}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0I2 = DJ0.A0I(parcel, this.A04, i);
        C26293Cx2.A08(parcel, 2, this.A05);
        C26293Cx2.A08(parcel, 3, this.A06);
        C26293Cx2.A08(parcel, 4, this.A07);
        C26293Cx2.A08(parcel, 5, this.A08);
        C26293Cx2.A09(parcel, this.A03, 6, i, A0I2);
        C26293Cx2.A08(parcel, 8, this.A09);
        C26293Cx2.A08(parcel, 9, this.A0A);
        C26293Cx2.A08(parcel, 10, this.A0B);
        C26293Cx2.A08(parcel, 11, this.A0C);
        C26293Cx2.A06(parcel, 12, this.A00);
        C26293Cx2.A06(parcel, 13, this.A01);
        C26293Cx2.A0D(parcel, this.A0H, 14, A0I2);
        C26293Cx2.A07(parcel, 15, this.A02);
        C26293Cx2.A0E(parcel, this.A0I, 16);
        C26293Cx2.A08(parcel, 17, this.A0D);
        C26293Cx2.A08(parcel, 18, this.A0E);
        C26293Cx2.A08(parcel, 19, this.A0F);
        C26293Cx2.A08(parcel, 20, this.A0G);
        C26293Cx2.A05(parcel, A002);
    }
}
