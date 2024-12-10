package X;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bcj  reason: case insensitive filesystem */
public final class C23189Bcj extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public BluetoothDevice A00;
    public String A01;
    public String A02;
    public String A03;
    public C23166BcM A04;
    public byte[] A05;
    public final int A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23189Bcj) {
                C23189Bcj bcj = (C23189Bcj) obj;
                if (C25332Cdd.A01(this.A01, bcj.A01) && C25332Cdd.A01(this.A02, bcj.A02) && C25332Cdd.A01(this.A03, bcj.A03) && C25332Cdd.A01(this.A00, bcj.A00) && Arrays.equals(this.A05, bcj.A05)) {
                    if (!DJ0.A0H(bcj.A06, Integer.valueOf(this.A06)) || !C25332Cdd.A01(this.A04, bcj.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A03;
        objArr[3] = this.A00;
        AnonymousClass3Ma.A1T(objArr, Arrays.hashCode(this.A05));
        AnonymousClass3Ma.A1U(objArr, this.A06);
        return AnonymousClass000.A0P(this.A04, objArr, 6);
    }

    public C23189Bcj(BluetoothDevice bluetoothDevice, C23166BcM bcM, String str, String str2, String str3, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = bluetoothDevice;
        this.A05 = bArr;
        this.A06 = i;
        this.A04 = bcM;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A01);
        C26293Cx2.A0A(parcel, this.A02, 2, A0K);
        C26293Cx2.A0A(parcel, this.A03, 3, A0K);
        C26293Cx2.A09(parcel, this.A00, 4, i, A0K);
        C26293Cx2.A0D(parcel, this.A05, 5, A0K);
        C26293Cx2.A06(parcel, 6, this.A06);
        C26293Cx2.A09(parcel, this.A04, 7, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23189Bcj() {
        this.A06 = 0;
    }
}
