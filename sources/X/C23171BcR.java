package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.BcR  reason: case insensitive filesystem */
public final class C23171BcR extends DJ0 {
    public static final String[] A0F = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final C23167BcN A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final byte[] A0C;
    public final byte[] A0D;
    public final byte[] A0E;

    public final boolean equals(Object obj) {
        if (obj instanceof C23171BcR) {
            C23171BcR bcR = (C23171BcR) obj;
            if (C25332Cdd.A00(Long.valueOf(this.A04), bcR.A04) && C25332Cdd.A01(this.A07, bcR.A07)) {
                if (DJ0.A0H(bcR.A00, Integer.valueOf(this.A00)) && C25332Cdd.A01(this.A08, bcR.A08) && C25332Cdd.A01(this.A09, bcR.A09) && Arrays.equals(this.A0C, bcR.A0C) && Arrays.equals(this.A0D, bcR.A0D) && C25332Cdd.A01(this.A0B, bcR.A0B)) {
                    if (DJ0.A0H(bcR.A01, Integer.valueOf(this.A01)) && Arrays.equals(this.A0E, bcR.A0E) && C25332Cdd.A01(this.A06, bcR.A06)) {
                        if (DJ0.A0H(bcR.A02, Integer.valueOf(this.A02))) {
                            if (!DJ0.A0H(bcR.A03, Integer.valueOf(this.A03)) || !C25332Cdd.A01(this.A0A, bcR.A0A)) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[14];
        C17890vO.A1L(objArr, this.A04);
        objArr[1] = this.A07;
        AnonymousClass3Ma.A1S(objArr, this.A00);
        objArr[3] = this.A08;
        objArr[4] = this.A09;
        AnonymousClass3Ma.A1U(objArr, Arrays.hashCode(this.A0C));
        C17890vO.A1H(objArr, Arrays.hashCode(this.A0D));
        objArr[7] = this.A0B;
        objArr[8] = Integer.valueOf(this.A01);
        objArr[9] = BE8.A0a(this.A0E);
        objArr[10] = this.A06;
        objArr[11] = Integer.valueOf(this.A02);
        BE8.A1L(objArr, this.A03);
        return AnonymousClass000.A0P(this.A0A, objArr, 13);
    }

    public final String toString() {
        String arrays;
        Integer A0a;
        String str;
        Object[] objArr = new Object[15];
        char A1b = BE8.A1b(objArr, this.A04);
        objArr[1] = this.A07;
        switch (this.A00) {
            case 1:
                A1b = 1;
                break;
            case 2:
                A1b = 2;
                break;
            case 3:
                A1b = 3;
                break;
            case 4:
                A1b = 4;
                break;
            case 5:
                A1b = 5;
                break;
            case 6:
                A1b = 6;
                break;
            case 7:
                A1b = 7;
                break;
            case 8:
                A1b = 8;
                break;
            case 9:
                A1b = 9;
                break;
            case 10:
                A1b = 10;
                break;
        }
        objArr[2] = A0F[A1b];
        objArr[3] = this.A08;
        AnonymousClass3MX.A1S(objArr, 4, this.A05);
        objArr[5] = this.A09;
        byte[] bArr = this.A0C;
        String str2 = null;
        if (bArr == null) {
            arrays = null;
        } else {
            arrays = Arrays.toString(bArr);
        }
        objArr[6] = arrays;
        byte[] bArr2 = this.A0D;
        if (bArr2 == null) {
            A0a = null;
        } else {
            A0a = BE8.A0a(bArr2);
        }
        objArr[7] = A0a;
        objArr[8] = this.A0B;
        C17880vN.A1T(objArr, this.A01, 9);
        byte[] bArr3 = this.A0E;
        if (bArr3 != null) {
            str2 = Arrays.toString(bArr3);
        }
        objArr[10] = str2;
        objArr[11] = this.A06;
        BE8.A1L(objArr, this.A02);
        int i = this.A03;
        if (i == 0) {
            str = "UNKNOWN";
        } else if (i == 1) {
            str = "Main";
        } else if (i != 2) {
            str = "OTHER";
        } else {
            str = "Secondary";
        }
        objArr[13] = str;
        objArr[14] = this.A0A;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s>, Dusi: %s", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        C23433Bgy bgy;
        Object[] array;
        int length;
        long j = this.A04;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A07(parcel, 1, j);
        boolean A0L = DJ0.A0L(parcel, this.A07);
        C26293Cx2.A06(parcel, 3, this.A00);
        C26293Cx2.A0A(parcel, this.A08, 4, A0L);
        C26293Cx2.A07(parcel, 5, this.A05);
        C26293Cx2.A0A(parcel, this.A09, 6, A0L);
        byte[] bArr2 = this.A0C;
        byte[] bArr3 = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        C26293Cx2.A0D(parcel, bArr, 7, A0L);
        byte[] bArr4 = this.A0D;
        if (bArr4 != null) {
            bArr3 = (byte[]) bArr4.clone();
        }
        C26293Cx2.A0D(parcel, bArr3, 8, A0L);
        List list = this.A0B;
        C23435Bh0 bh0 = C23433Bgy.A00;
        if (list != null) {
            if (list instanceof C27286DbF) {
                bgy = (C23433Bgy) ((C27286DbF) list);
                if (!(bgy instanceof C23432Bgx)) {
                    array = bgy.toArray();
                    length = array.length;
                }
                C26293Cx2.A0C(parcel, bgy, 9, A0L);
                C26293Cx2.A06(parcel, 10, this.A01);
                C26293Cx2.A0D(parcel, this.A0E, 11, A0L);
                C26293Cx2.A09(parcel, this.A06, 12, i, A0L);
                C26293Cx2.A06(parcel, 13, this.A02);
                C26293Cx2.A06(parcel, 14, this.A03);
                C26293Cx2.A0A(parcel, this.A0A, 15, A0L);
                C26293Cx2.A05(parcel, A002);
            }
            array = list.toArray();
            length = array.length;
            CBF.A00(array, length);
            if (length != 0) {
                bgy = new C23432Bgx(array, length);
                C26293Cx2.A0C(parcel, bgy, 9, A0L);
                C26293Cx2.A06(parcel, 10, this.A01);
                C26293Cx2.A0D(parcel, this.A0E, 11, A0L);
                C26293Cx2.A09(parcel, this.A06, 12, i, A0L);
                C26293Cx2.A06(parcel, 13, this.A02);
                C26293Cx2.A06(parcel, 14, this.A03);
                C26293Cx2.A0A(parcel, this.A0A, 15, A0L);
                C26293Cx2.A05(parcel, A002);
            }
        }
        bgy = C23432Bgx.A02;
        C26293Cx2.A0C(parcel, bgy, 9, A0L);
        C26293Cx2.A06(parcel, 10, this.A01);
        C26293Cx2.A0D(parcel, this.A0E, 11, A0L);
        C26293Cx2.A09(parcel, this.A06, 12, i, A0L);
        C26293Cx2.A06(parcel, 13, this.A02);
        C26293Cx2.A06(parcel, 14, this.A03);
        C26293Cx2.A0A(parcel, this.A0A, 15, A0L);
        C26293Cx2.A05(parcel, A002);
    }

    public C23171BcR(C23167BcN bcN, String str, String str2, String str3, String str4, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, long j, long j2) {
        this.A04 = j;
        this.A07 = str;
        this.A00 = i;
        this.A08 = str2;
        this.A05 = j2;
        this.A09 = str3;
        this.A0C = bArr;
        this.A0D = bArr2;
        this.A0B = list;
        this.A01 = i2;
        this.A0E = bArr3;
        this.A06 = bcN;
        this.A02 = i3;
        this.A03 = i4;
        this.A0A = str4;
    }
}
