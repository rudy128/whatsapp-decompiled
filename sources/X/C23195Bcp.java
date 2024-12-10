package X;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Bcp  reason: case insensitive filesystem */
public final class C23195Bcp extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public long A04 = 0;
    public ParcelUuid A05;
    public Bc7 A06;
    public boolean A07 = true;
    @Deprecated
    public boolean A08 = false;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = true;
    public boolean A0E = true;
    public boolean A0F = true;
    public boolean A0G = false;
    public boolean A0H = true;
    public boolean A0I = true;
    public boolean A0J = true;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    @Deprecated
    public boolean A0O = true;
    public boolean A0P = false;
    public boolean A0Q = true;
    public boolean A0R = true;
    public byte[] A0S;
    public byte[] A0T;
    public byte[] A0U;
    public int[] A0V;
    public int[] A0W;
    public C23154BcA[] A0X;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23195Bcp) {
                C23195Bcp bcp = (C23195Bcp) obj;
                if (C25332Cdd.A01(this.A06, bcp.A06) && DJ0.A0M(Boolean.valueOf(this.A0C), bcp.A0C) && DJ0.A0M(Boolean.valueOf(this.A0D), bcp.A0D) && DJ0.A0M(Boolean.valueOf(this.A0E), bcp.A0E) && DJ0.A0M(Boolean.valueOf(this.A0F), bcp.A0F) && Arrays.equals(this.A0T, bcp.A0T) && DJ0.A0M(Boolean.valueOf(this.A0G), bcp.A0G) && C25332Cdd.A01(this.A05, bcp.A05) && DJ0.A0M(Boolean.valueOf(this.A0H), bcp.A0H) && DJ0.A0M(Boolean.valueOf(this.A0I), bcp.A0I) && DJ0.A0M(Boolean.valueOf(this.A0J), bcp.A0J) && DJ0.A0M(Boolean.valueOf(this.A0K), bcp.A0K) && DJ0.A0M(Boolean.valueOf(this.A0L), bcp.A0L) && DJ0.A0M(Boolean.valueOf(this.A0M), bcp.A0M)) {
                    if (DJ0.A0H(bcp.A02, Integer.valueOf(this.A02))) {
                        if (DJ0.A0H(bcp.A03, Integer.valueOf(this.A03)) && Arrays.equals(this.A0U, bcp.A0U) && C25332Cdd.A00(Long.valueOf(this.A04), bcp.A04) && Arrays.equals(this.A0X, bcp.A0X) && DJ0.A0M(Boolean.valueOf(this.A0N), bcp.A0N) && DJ0.A0M(Boolean.valueOf(this.A0O), bcp.A0O) && DJ0.A0M(Boolean.valueOf(this.A0P), bcp.A0P) && DJ0.A0M(Boolean.valueOf(this.A0Q), bcp.A0Q) && Arrays.equals(this.A0V, bcp.A0V) && Arrays.equals(this.A0W, bcp.A0W) && DJ0.A0M(Boolean.valueOf(this.A0R), bcp.A0R)) {
                            if (DJ0.A0H(bcp.A00, Integer.valueOf(this.A00)) && Arrays.equals(this.A0S, bcp.A0S) && DJ0.A0M(Boolean.valueOf(this.A07), bcp.A07)) {
                                if (!DJ0.A0H(bcp.A01, Integer.valueOf(this.A01)) || !DJ0.A0M(Boolean.valueOf(this.A08), bcp.A08) || !DJ0.A0M(Boolean.valueOf(this.A09), bcp.A09) || !DJ0.A0M(Boolean.valueOf(this.A0A), bcp.A0A) || !DJ0.A0M(Boolean.valueOf(this.A0B), bcp.A0B)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C23195Bcp bcp, Object[] objArr) {
        objArr[6] = Boolean.valueOf(bcp.A0G);
        objArr[7] = bcp.A05;
        objArr[8] = Boolean.valueOf(bcp.A0H);
        objArr[9] = Boolean.valueOf(bcp.A0I);
        objArr[10] = Boolean.valueOf(bcp.A0J);
        objArr[11] = Boolean.valueOf(bcp.A0K);
        objArr[12] = Boolean.valueOf(bcp.A0L);
        objArr[13] = Boolean.valueOf(bcp.A0M);
        objArr[14] = Integer.valueOf(bcp.A02);
        objArr[15] = Integer.valueOf(bcp.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[34];
        objArr[0] = this.A06;
        BE8.A1O(objArr, this.A0C);
        AnonymousClass8BU.A1Q(objArr, this.A0D);
        BE8.A1P(objArr, this.A0E);
        BE8.A1Q(objArr, this.A0F);
        AnonymousClass3Ma.A1U(objArr, Arrays.hashCode(this.A0T));
        A00(this, objArr);
        objArr[16] = BE8.A0a(this.A0U);
        objArr[17] = Long.valueOf(this.A04);
        objArr[18] = Integer.valueOf(Arrays.hashCode(this.A0X));
        objArr[19] = Boolean.valueOf(this.A0N);
        objArr[20] = Boolean.valueOf(this.A0O);
        objArr[21] = Boolean.valueOf(this.A0P);
        objArr[22] = Boolean.valueOf(this.A0Q);
        objArr[23] = Integer.valueOf(Arrays.hashCode(this.A0V));
        objArr[24] = Integer.valueOf(Arrays.hashCode(this.A0W));
        objArr[25] = Boolean.valueOf(this.A0R);
        objArr[26] = Integer.valueOf(this.A00);
        objArr[27] = BE8.A0a(this.A0S);
        objArr[28] = Boolean.valueOf(this.A07);
        objArr[29] = Integer.valueOf(this.A01);
        objArr[30] = Boolean.valueOf(this.A08);
        objArr[31] = Boolean.valueOf(this.A09);
        objArr[32] = Boolean.valueOf(this.A0A);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A0B), objArr, 33);
    }

    public String toString() {
        String A002;
        String A003;
        Locale locale = Locale.US;
        Object[] objArr = new Object[25];
        objArr[0] = this.A06;
        BE8.A1O(objArr, this.A0C);
        AnonymousClass8BU.A1Q(objArr, this.A0D);
        BE8.A1P(objArr, this.A0E);
        BE8.A1Q(objArr, this.A0F);
        byte[] bArr = this.A0T;
        String str = null;
        if (bArr == null) {
            A002 = null;
        } else {
            A002 = C25408CfA.A00(bArr);
        }
        objArr[5] = A002;
        A00(this, objArr);
        byte[] bArr2 = this.A0U;
        if (bArr2 == null) {
            A003 = "null";
        } else {
            A003 = C25408CfA.A00(bArr2);
        }
        objArr[16] = A003;
        objArr[17] = Long.valueOf(this.A04);
        objArr[18] = Arrays.toString(this.A0X);
        objArr[19] = Boolean.valueOf(this.A0N);
        objArr[20] = Boolean.valueOf(this.A0O);
        objArr[21] = Boolean.valueOf(this.A0Q);
        byte[] bArr3 = this.A0S;
        if (bArr3 != null) {
            str = C25408CfA.A00(bArr3);
        }
        objArr[22] = str;
        objArr[23] = Boolean.valueOf(this.A07);
        objArr[24] = Integer.valueOf(this.A01);
        return String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s,useStableIdentifiers: %s,deviceInfo: %s,allowGattConnections: %s,connectionType: %d}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0I2 = DJ0.A0I(parcel, this.A06, i);
        C26293Cx2.A08(parcel, 2, this.A0C);
        C26293Cx2.A08(parcel, 3, this.A0D);
        C26293Cx2.A08(parcel, 4, this.A0E);
        C26293Cx2.A08(parcel, 5, this.A0F);
        C26293Cx2.A0D(parcel, this.A0T, 6, A0I2);
        C26293Cx2.A08(parcel, 7, this.A0G);
        C26293Cx2.A09(parcel, this.A05, 8, i, A0I2);
        C26293Cx2.A08(parcel, 9, this.A0H);
        C26293Cx2.A08(parcel, 10, this.A0I);
        C26293Cx2.A08(parcel, 11, this.A0J);
        C26293Cx2.A08(parcel, 12, this.A0K);
        C26293Cx2.A08(parcel, 13, this.A0L);
        C26293Cx2.A08(parcel, 14, this.A0M);
        C26293Cx2.A06(parcel, 15, this.A02);
        C26293Cx2.A06(parcel, 16, this.A03);
        C26293Cx2.A0D(parcel, this.A0U, 17, A0I2);
        C26293Cx2.A07(parcel, 18, this.A04);
        C26293Cx2.A0F(parcel, this.A0X, 19, i);
        C26293Cx2.A08(parcel, 20, this.A0N);
        C26293Cx2.A08(parcel, 21, this.A0O);
        C26293Cx2.A08(parcel, 22, this.A0P);
        C26293Cx2.A08(parcel, 23, this.A0Q);
        C26293Cx2.A0E(parcel, this.A0V, 24);
        C26293Cx2.A0E(parcel, this.A0W, 25);
        C26293Cx2.A08(parcel, 26, this.A0R);
        C26293Cx2.A06(parcel, 27, this.A00);
        C26293Cx2.A0D(parcel, this.A0S, 28, A0I2);
        C26293Cx2.A08(parcel, 29, this.A07);
        C26293Cx2.A06(parcel, 30, this.A01);
        C26293Cx2.A08(parcel, 31, this.A08);
        C26293Cx2.A08(parcel, 32, this.A09);
        C26293Cx2.A08(parcel, 33, this.A0A);
        C26293Cx2.A08(parcel, 34, this.A0B);
        C26293Cx2.A05(parcel, A002);
    }
}
